package com.gogowise.dao.impl;

import com.gogowise.dao.LiveTrailerDao;
import com.gogowise.domain.LiveTrailer;
import com.gogowise.domain.Pagination;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("liveTrailerDao")
public class LiveTrailerDaoImpl extends ModelDaoImpl<LiveTrailer> implements LiveTrailerDao{

    public List<LiveTrailer> findByPublishTime(Pagination pagination) {
        String hql = "From LiveTrailer lt order by lt.id desc";
        return this.find(hql,pagination);
    }
}
