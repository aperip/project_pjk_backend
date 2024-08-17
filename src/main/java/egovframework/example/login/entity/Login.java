package egovframework.example.login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pjk_member")
public class Login {
	
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_SEQ")
    private int memberSeq;

    @Column(name = "CREATE_DATE")
    private String createDate;

    @Column(name = "CREATE_ID")
    private String createId;

    @Column(name = "MEMBER_ID")
    private String memberId;

    @Column(name = "MEMBER_NAME")
    private String memberName;

    @Column(name = "MEMBER_NNAME")
    private String memberNname;

    @Column(name = "MEMBER_PW")
    private String memberPw;

    @Column(name = "UPDATE_DATE")
    private String updateDate;

    @Column(name = "UPDATE_ID")
    private String updateId;

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
