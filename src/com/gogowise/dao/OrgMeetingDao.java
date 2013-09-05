package com.gogowise.dao;

import com.gogowise.domain.OrgMeeting;
import com.gogowise.domain.Pagination;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-4-19
 * Time: 上午11:50
 * To change this template use File | Settings | File Templates.
 */
public interface OrgMeetingDao extends ModelDao<OrgMeeting>{

    public List<OrgMeeting> findForUserCenter(Pagination pagination,Integer uid);
}
