package com.gogowise.dao.live;

import com.gogowise.dao.ModelDao;
import com.gogowise.domain.live.UserPrivateChannel;


public interface UserPrivateChannelDao extends ModelDao<UserPrivateChannel> {

    public UserPrivateChannel findByUser(Integer userID);
}
