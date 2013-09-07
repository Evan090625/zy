package com.gogowise.repository.live;

import com.gogowise.repository.ModelDaoImpl;
import com.gogowise.domain.live.LiveTermComment;
import com.gogowise.domain.Pagination;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("liveTermCommentDao")
public class LiveTermCommentDaoImpl extends ModelDaoImpl<LiveTermComment> implements LiveTermCommentDao{

    public List<LiveTermComment> findByTermsID(Integer termsID, Pagination pagination) {
        String hql = "From LiveTermComment ltc where ltc.channelTerms.id=? order by ltc.commentTime desc ,ltc.id desc";
        return this.find(hql,pagination,termsID);
    }
}
