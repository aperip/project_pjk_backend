package egovframework.thread.user.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Entity;

@Entity
@Embeddable
public class FollowingCompositeKey implements Serializable {
    private int followingSeq;
    private int memberSeq;

    // 기본 생성자
    public FollowingCompositeKey() {}

    // 파라미터가 있는 생성자
    public FollowingCompositeKey(int followingSeq, int memberSeq) {
        this.followingSeq = followingSeq;
        this.memberSeq = memberSeq;
    }

    public int getFollowingSeq() {
        return followingSeq;
    }

    public void setFollowingSeq(int followingSeq) {
        this.followingSeq = followingSeq;
    }

    public int getMemberSeq() {
        return memberSeq;
    }

    public void setMemberSeq(int memberSeq) {
        this.memberSeq = memberSeq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FollowingCompositeKey that = (FollowingCompositeKey) o;
        return followingSeq == that.followingSeq && memberSeq == that.memberSeq;
    }

    @Override
    public int hashCode() {
        return Objects.hash(followingSeq, memberSeq);
    }
}
