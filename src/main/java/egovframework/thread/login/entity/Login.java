package egovframework.thread.login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pjk_user")
public class Login {
	
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_SEQ")
	private int userSeq;

	@Column(name="USER_ID")
	private String userId;

	@Column(name="USER_PW")
	private String userPw;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_NICK_NAME")
	private String userNickName;

	@Column(name="CREATE_ID")
	private String createId;

	@Column(name="CREATE_DATE")
	private String createDate;

	@Column(name="UPDATE_ID")
	private String updateId;

	@Column(name="UPDATE_DATE")
	private String updateDate;

	@Column(name="REFRESH_TOKEN")
	private String refreshToken;

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
    
    

	
	

	
	
	
	
	
	

}
