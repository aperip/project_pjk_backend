package egovframework.thread.timeLine.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.thread.timeLine.entity.TimeLine;
import egovframework.thread.timeLine.repository.TimeLineRepository;

@Service
public class TimeLineServiceimpl implements TimeLineService{
	
	@Autowired
    private TimeLineRepository timeLineRepository;


	@Override
	public List<TimeLine> getTimeLineAll(TimeLine timelineVo) {
		return timeLineRepository.getTimeLineAll(timelineVo);
		}

}