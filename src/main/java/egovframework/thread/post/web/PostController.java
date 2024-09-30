package egovframework.thread.post.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import egovframework.thread.post.entity.Post;
import egovframework.thread.post.entity.PostEtc;
import egovframework.thread.post.service.PostService;

@RestController
public class PostController {
	
	@Autowired
    private PostService postService;
	
	@RequestMapping("/post/postAll.do")
	@ResponseBody
	public List<Post> showPostListAll(Post postVo) {
		
		  // offset 계산 (몇 번째 데이터부터 가져올지 결정)
	    int offset = (postVo.getPage() - 1) * postVo.getLimit();
	    postVo.setOffset(offset);
		List<Post> allList =  postService.getPostsAll(postVo);
		
		return allList;
	}
	
	@RequestMapping("/post/toggleAction.do")
	 public ResponseEntity<Map<String, Object>> toggleAction(@RequestBody  PostEtc postEtcVo, @RequestParam boolean isIncrease) {
			Map<String, Object> response = new HashMap<>();
			try {
				if (isIncrease) {
					postService.toggleIncrease(postEtcVo);
				} else {
					postService.toggleDecrease(postEtcVo);
				}
				response.put("success", true);
			} catch (Exception e) {
				response.put("success", false);
				response.put("error", "액션 처리 중 오류 발생");
			}
			return ResponseEntity.ok(response);
		}
	
}
