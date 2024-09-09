package egovframework.thread.timeLine.repository;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.thread.timeLine.entity.TimeLine;

@Mapper("timeLineRepository")
public interface TimeLineRepository {

	 List<TimeLine> getTimeLineAll(TimeLine timelineVo);
}
