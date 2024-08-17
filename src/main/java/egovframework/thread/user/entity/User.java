package egovframework.thread.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pjk_member")
public class User {

	@Id
	private int memberSeq;
	
	private String memberId;
	
	private String memberPw;
	
	private String memberName;
	
	private String memberNname;
	
	private String createId;
	
	private String createDate;
	
	private String updateId;
	
	private String updateDate;

	public int getMemberSeq() {
		return memberSeq;
	}

	public void setMemberSeq(int memberSeq) {
		this.memberSeq = memberSeq;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberNname() {
		return memberNname;
	}

	public void setMemberNname(String memberNname) {
		this.memberNname = memberNname;
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
	
	
}
