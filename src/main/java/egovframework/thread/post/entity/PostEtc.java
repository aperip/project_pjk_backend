package egovframework.thread.post.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="pjk_post_etc")
public class PostEtc {
	
	@Id
	
	@Column(name ="POST_ETC_SEQ")
	private int postEtcSeq;
	@Column(name ="POST_SEQ")
	private int postSeq;
	@Column(name ="USER_ID")
	private String userId;
	@Column(name ="LIKE_CNT")
	private int likeCnt;
	@Column(name ="COMMENT_CNT")
	private int commentCnt;
	@Column(name ="QUOTE_CNT")
	private int quoteCnt;
	@Column(name ="CREATE_DATE")
	private Date createDate;
	@Transient
	private String actionType;  // 액션 타입 (like, quote 등)
	@Transient
    private boolean actionActive;  // true: 액션 활성화, false: 비활성화
	
	
	public int getPostEtcSeq() {
		return postEtcSeq;
	}
	public void setPostEtcSeq(int postEtcSeq) {
		this.postEtcSeq = postEtcSeq;
	}
	public int getPostSeq() {
		return postSeq;
	}
	public void setPostSeq(int postSeq) {
		this.postSeq = postSeq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getLikeCnt() {
		return likeCnt;
	}
	public void setLikeCnt(int likeCnt) {
		this.likeCnt = likeCnt;
	}
	public int getCommentCnt() {
		return commentCnt;
	}
	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}
	public int getQuoteCnt() {
		return quoteCnt;
	}
	public void setQuoteCnt(int quoteCnt) {
		this.quoteCnt = quoteCnt;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public boolean isActionActive() {
		return actionActive;
	}
	public void setActionActive(boolean actionActive) {
		this.actionActive = actionActive;
	}
	

	
	
	
	
	
	

}
