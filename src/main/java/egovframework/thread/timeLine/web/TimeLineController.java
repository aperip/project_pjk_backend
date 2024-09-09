package egovframework.thread.timeLine.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import egovframework.thread.timeLine.entity.TimeLine;
import egovframework.thread.timeLine.service.TimeLineService;

@RestController
public class TimeLineController {
	
	@Autowired
    private TimeLineService timeLineServce;
	
	@RequestMapping("/timeLine/timeLineAll.do")
	@ResponseBody
	public List<TimeLine> showTimelineListAll(TimeLine timelineVo) {
		
		  // offset 계산 (몇 번째 데이터부터 가져올지 결정)
	    int offset = (timelineVo.getPage() - 1) * timelineVo.getLimit();
	    timelineVo.setOffset(offset);
		List<TimeLine> allList =  timeLineServce.getTimeLineAll(timelineVo);
		
		return allList;
	}

}
