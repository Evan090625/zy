package com.gogowise.dao;

import com.gogowise.domain.Allocation;

/**
 * Created by IntelliJ IDEA.
 * User: Benson
 * Date: 11-8-7
 * Time: 下午8:23
 * To change this template use File | Settings | File Templates.
 */
public interface AllocationDao extends ModelDao<Allocation>{
     public Boolean findByCompetitionIdAndUserId(Integer cId, Integer userId);
}
