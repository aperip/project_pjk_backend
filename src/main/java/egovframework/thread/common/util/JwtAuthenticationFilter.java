package egovframework.thread.common.util;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Claims;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		 String header = request.getHeader("Authorization");
	        if (header != null && header.startsWith("Bearer ")) {
	            String token = header.substring(7);
	            try {
	                Claims claims = JwtUtil.validateToken(token);
	                request.setAttribute("claims", claims);
	            } catch (Exception e) {
	                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	                return;
	            }
	        }
	        filterChain.doFilter(request, response);
		
	}

}
