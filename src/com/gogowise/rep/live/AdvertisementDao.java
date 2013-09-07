package com.gogowise.rep.live;

import com.gogowise.rep.ModelDao;
import com.gogowise.rep.live.enity.Advertisement;

import java.util.List;

public interface AdvertisementDao extends ModelDao<Advertisement> {

    public List<Advertisement> findByProvider(Integer uid);

}
