package com.gogowise.rep.live;

import com.gogowise.rep.ModelDaoImpl;
import com.gogowise.rep.live.enity.LiveTrailer;
import com.gogowise.rep.Pagination;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("liveTrailerDao")
public class LiveTrailerDaoImpl extends ModelDaoImpl<LiveTrailer> implements LiveTrailerDao{

    public List<LiveTrailer> findByPublishTime(Pagination pagination) {
        String hql = "From LiveTrailer lt order by lt.id desc";
        return this.find(hql,pagination);
    }
}
