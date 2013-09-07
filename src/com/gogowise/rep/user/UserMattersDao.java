package com.gogowise.rep.user;

import com.gogowise.rep.ModelDao;
import com.gogowise.rep.user.user.UserMatters;


public interface UserMattersDao extends ModelDao<UserMatters> {

    public UserMatters  findByUser(Integer userID);
}
