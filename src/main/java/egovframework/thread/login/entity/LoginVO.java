package egovframework.thread.login.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.EmbeddedId;

@Entity
@Table(name="pjk_following")
public class LoginVO {
	@EmbeddedId
	private SignUpRepository followingSeq;
	///private int followingSeq;
	///private int memberSeq;

	private String following;
	
	private String createDate;
	
	private String updateDate;


	public SignUpRepository getFollowingSeq() {
		return followingSeq;
	}

	public void setFollowingSeq(SignUpRepository followingSeq) {
		this.followingSeq = followingSeq;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	
}
