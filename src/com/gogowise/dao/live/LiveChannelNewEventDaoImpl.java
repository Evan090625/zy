package com.gogowise.dao.live;

import com.gogowise.dao.ModelDaoImpl;
import com.gogowise.domain.LiveChannelNewEvent;
import com.gogowise.domain.Pagination;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("liveChannelNewEventDao")
public class LiveChannelNewEventDaoImpl extends ModelDaoImpl<LiveChannelNewEvent> implements LiveChannelNewEventDao{

    public List<LiveChannelNewEvent> findLatestNews(Pagination pagination) {
        String hql = "From LiveChannelNewEvent lcne order by lcne.id desc";
        return this.find(hql,pagination);
    }
}
