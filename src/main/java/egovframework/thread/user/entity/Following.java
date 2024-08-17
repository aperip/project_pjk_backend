package egovframework.thread.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.EmbeddedId;

@Entity
@Table(name="pjk_following")
public class Following {
	@EmbeddedId
	private FollowingCompositeKey followingSeq;
	///private int followingSeq;
	///private int memberSeq;

	private String following;
	
	private String createDate;
	
	private String updateDate;


	public FollowingCompositeKey getFollowingSeq() {
		return followingSeq;
	}

	public void setFollowingSeq(FollowingCompositeKey followingSeq) {
		this.followingSeq = followingSeq;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	
}
