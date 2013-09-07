package com.gogowise.rep.live;

import com.gogowise.rep.ModelDao;
import com.gogowise.rep.Pagination;
import com.gogowise.rep.live.enity.ShowComment;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-7-9
 * Time: 下午1:24
 * To change this template use File | Settings | File Templates.
 */
public interface ShowCommentDao extends ModelDao<ShowComment> {

    public List<ShowComment> findByShow(Integer showID,Pagination pagination);

}
