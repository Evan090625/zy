package com.gogowise.dao;

import com.gogowise.domain.Pagination;
import com.gogowise.domain.ShowComment;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-7-9
 * Time: 下午1:24
 * To change this template use File | Settings | File Templates.
 */
public interface ShowCommentDao extends ModelDao<ShowComment>{

    public List<ShowComment> findByShow(Integer showID,Pagination pagination);

}
