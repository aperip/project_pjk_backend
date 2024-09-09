package egovframework.thread.timeLine.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pjk_timeline")
public class TimeLine {
	
	@Id
	
	private int timelineSeq;

	private int timelineNo;

	private String timelineType;

	private String timelineTitle;

	private String timelineContents;

	private int timelineLikeCnt;

	private int timelineViewCnt;

	private int timelineShareCnt;

	private int bbsBookmarkCnt;

	private String createId;

	private Date createDate;

	private String updateId;

	private Date updateDate;
	
	private int page;
	
	private int limit;
	
	private int offset;

	public int getTimelineSeq() {
		return timelineSeq;
	}

	public void setTimelineSeq(int timelineSeq) {
		this.timelineSeq = timelineSeq;
	}

	public int getTimelineNo() {
		return timelineNo;
	}

	public void setTimelineNo(int timelineNo) {
		this.timelineNo = timelineNo;
	}

	public String getTimelineType() {
		return timelineType;
	}

	public void setTimelineType(String timelineType) {
		this.timelineType = timelineType;
	}

	public String getTimelineTitle() {
		return timelineTitle;
	}

	public void setTimelineTitle(String timelineTitle) {
		this.timelineTitle = timelineTitle;
	}

	public String getTimelineContents() {
		return timelineContents;
	}

	public void setTimelineContents(String timelineContents) {
		this.timelineContents = timelineContents;
	}

	public int getTimelineLikeCnt() {
		return timelineLikeCnt;
	}

	public void setTimelineLikeCnt(int timelineLikeCnt) {
		this.timelineLikeCnt = timelineLikeCnt;
	}

	public int getTimelineViewCnt() {
		return timelineViewCnt;
	}

	public void setTimelineViewCnt(int timelineViewCnt) {
		this.timelineViewCnt = timelineViewCnt;
	}

	public int getTimelineShareCnt() {
		return timelineShareCnt;
	}

	public void setTimelineShareCnt(int timelineShareCnt) {
		this.timelineShareCnt = timelineShareCnt;
	}

	public int getBbsBookmarkCnt() {
		return bbsBookmarkCnt;
	}

	public void setBbsBookmarkCnt(int bbsBookmarkCnt) {
		this.bbsBookmarkCnt = bbsBookmarkCnt;
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
	
	
	
	
	

}
