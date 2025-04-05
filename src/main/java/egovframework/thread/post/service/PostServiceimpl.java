package egovframework.thread.post.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.thread.post.entity.Post;
import egovframework.thread.post.entity.PostEtc;
import egovframework.thread.post.repository.PostRepository;

@Service
public class PostServiceimpl implements PostService{
	
	@Autowired
    private PostRepository postRepository;


	@Override
	public List<Post> getPostsAll(Post postVo) {
		
		List<Post> postList = postRepository.getPostsAll(postVo);
		for(int i=0; i< postList.size(); i++) {
			PostEtc postEtcVo  = new PostEtc();
			postEtcVo.setPostSeq(postList.get(i).getPostSeq());
			
			postEtcVo = postRepository.getPostEtc(postEtcVo);
			
			postList.get(i).setPostEtcVo(postEtcVo);
		}
		
		return postList;
	}


    public void toggleIncrease(PostEtc postEtcVo) {
    	 String actionType = postEtcVo.getActionType();

	    if ("like".equals(actionType)) {
	        postRepository.increaseLike(postEtcVo);
	    } else if ("quote".equals(actionType)) {
	        postRepository.increaseQuote(postEtcVo);
	    } else {
	        throw new IllegalArgumentException("유효하지 않은 액션 타입입니다.");
	    }
    }

    public void toggleDecrease(PostEtc postEtcVo) {
    	 String actionType = postEtcVo.getActionType();

 	    if ("like".equals(actionType)) {
 	        postRepository.decreaseLike(postEtcVo);
 	    } else if ("quote".equals(actionType)) {
 	        postRepository.decreaseQuote(postEtcVo);
 	    } else {
 	        throw new IllegalArgumentException("유효하지 않은 액션 타입입니다.");
 	    }
    }

    private String getColumnForAction(String actionType) {
        if ("like".equals(actionType)) {
            return "LIKE_CNT";
        } else if ("quote".equals(actionType)) {    
            return "QUOTE_CNT";
        }
        return null;
    }


	@Override
	public List<Post> getMyPostsAll(Post postVo) {
		
		List<Post> postList = postRepository.getMyPostsAll(postVo);
		for(int i=0; i< postList.size(); i++) {
			PostEtc postEtcVo  = new PostEtc();
			postEtcVo.setPostSeq(postList.get(i).getPostSeq());
			
			postEtcVo = postRepository.getPostEtc(postEtcVo);
			
			postList.get(i).setPostEtcVo(postEtcVo);
		}
		
		return postList;
	}


	

}