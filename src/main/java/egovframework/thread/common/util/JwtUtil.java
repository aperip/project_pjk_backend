package egovframework.thread.common.util;

import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
	
	private static final String SECRET_KEY = "pjkProject";
	private static final long ACCESS_TOKEN_EXPIRATION = 1000 * 60 * 30; // 30분
	private static final long REFRESH_TOKEN_EXPIRATION = 1000 * 60 * 60 * 24 * 7; // 7일
	
	
	public static String generateAcessToken(String userId) {
		return Jwts.builder()
				.setSubject(userId)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis()+ACCESS_TOKEN_EXPIRATION))
				.signWith(SignatureAlgorithm.HS512, SECRET_KEY)
				.compact();
	}
	 
	public static String generateRefreshToken(String userId) {
		return Jwts.builder()
				.setSubject(userId)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis()+REFRESH_TOKEN_EXPIRATION))
				.signWith(SignatureAlgorithm.HS512, SECRET_KEY)
				.compact();
	}
	
	public static Claims validateToken(String token) {
		return Jwts.parser()
				.setSigningKey(SECRET_KEY)
				.parseClaimsJws(token)
				.getBody();
	}
	
	public static boolean isTokenExpired(String token) {
	    try {
	        Claims claims = validateToken(token);
	        return claims.getExpiration().before(new Date());
	    } catch (Exception e) {
	        return true; // 토큰이 만료되거나 유효하지 않은 경우
	    }
	}

}
