package egovframework.thread.post.service;

import java.util.List;

import egovframework.thread.post.entity.Post;
import egovframework.thread.post.entity.PostEtc;

public interface PostService {

	
	List<Post> getPostsAll(Post postVo);
	
	void toggleIncrease(PostEtc postEtcVo);

	void toggleDecrease(PostEtc postEtcVo);

	List<Post> getMyPostsAll(Post postVo);


}