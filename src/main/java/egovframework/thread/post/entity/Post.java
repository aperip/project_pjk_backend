package egovframework.thread.post.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="pjk_post")
public class Post {
	
	@Id
	
	@Column(name = "POST_SEQ")  
    private int postSeq;
    
    @Column(name = "POST_NO")   
    private String postNo;
    
    @Column(name = "POST_TYPE")
    private String postType;
    
    @Column(name = "POST_TITLE")
    private String postTitle;
    
    @Column(name = "POST_CONTENTS")
    private String postContents;    
    
    @Column(name = "CREATE_ID")
    private String createId;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "UPDATE_ID")
    private String updateId;

    @Column(name = "UPDATE_DATE")
    private Date updateDate;
    
    @Transient
    private PostEtc postEtcVo;
	
    @Transient
	private int page;
	
    @Transient
	private int limit;
    
    @Transient	
	private int offset;
	
	

	public int getPostSeq() {
		return postSeq;
	}

	public void setPostSeq(int postSeq) {
		this.postSeq = postSeq;
	}

	public String getPostNo() {
		return postNo;
	}

	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContents() {
		return postContents;
	}

	public void setPostContents(String postContents) {
		this.postContents = postContents;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public PostEtc getPostEtcVo() {
		return postEtcVo;
	}

	public void setPostEtcVo(PostEtc postEtcVo) {
		this.postEtcVo = postEtcVo;
	}
	
	
	
	
	
	
	

}
