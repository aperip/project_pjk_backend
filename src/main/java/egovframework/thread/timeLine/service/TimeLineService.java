package egovframework.thread.timeLine.service;

import java.util.List;

import egovframework.thread.timeLine.entity.TimeLine;

public interface TimeLineService {


	List<TimeLine> getTimeLineAll(TimeLine timelineVo);


}