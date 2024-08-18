package egovframework.thread.login.entity;

import java.io.Serializable;
import java.util.Objects;

public class LoginCompositeKey implements Serializable {
    private int followingSeq;
    private int memberSeq;

    // 기본 생성자
    public LoginCompositeKey() {}

    // 파라미터가 있는 생성자
    public LoginCompositeKey(int followingSeq, int memberSeq) {
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
        LoginCompositeKey that = (LoginCompositeKey) o;
        return followingSeq == that.followingSeq && memberSeq == that.memberSeq;
    }

    @Override
    public int hashCode() {
        return Objects.hash(followingSeq, memberSeq);
    }
}
