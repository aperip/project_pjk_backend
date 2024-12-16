package egovframework.thread.post.repository;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.thread.post.entity.Post;
import egovframework.thread.post.entity.PostEtc;

@Mapper("postRepository")
public interface PostRepository {

	 List<Post> getPostsAll(Post postVo);
	 
	 PostEtc getPostEtc(PostEtc postEtcVo);
	void increaseLike(PostEtc postEtcVo);
	void increaseQuote(PostEtc postEtcVo);

	void decreaseLike(PostEtc postEtcVo);
	void decreaseQuote(PostEtc postEtcVo);
}
