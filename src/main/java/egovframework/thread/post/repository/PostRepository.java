package egovframework.thread.post.repository;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.thread.post.entity.Post;
import egovframework.thread.post.entity.PostEtc;

@Mapper("postRepository")
public interface PostRepository {

	//전체 포스트
	List<Post> getPostsAll(Post postVo);
	//내 포스트
	List<Post> getMyPostsAll(Post postVo);
	//포스트 기타(좋아요,공유,리트윗)
	PostEtc getPostEtc(PostEtc postEtcVo);
	//좋아요증가
	void increaseLike(PostEtc postEtcVo);
	//공유 증가
	void increaseQuote(PostEtc postEtcVo);
	//좋아요감소
	void decreaseLike(PostEtc postEtcVo);	
	//공유 감소
	void decreaseQuote(PostEtc postEtcVo);
	

}
