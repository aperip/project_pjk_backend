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
        String column = getColumnForAction(postEtcVo.getActionType());
        if (column != null) {
        	postRepository.increaseToggle(postEtcVo, column);
        }
    }

    public void toggleDecrease(PostEtc postEtcVo) {
        String column = getColumnForAction(postEtcVo.getActionType());
        if (column != null) {
        	postRepository.decreaseToggle(postEtcVo, column);
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


	

}