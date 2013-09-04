package com.gogowise.dao.competition;

import com.gogowise.dao.ModelDao;
import com.gogowise.dao.competition.CompetitionDaoImpl;
import com.gogowise.domain.SingerAllocation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Benson
 * Date: 11-8-7
 * Time: 下午8:23
 * To change this template use File | Settings | File Templates.
 */
@Repository("singerAllocationDao")
public class SingerAllocationDaoImpl extends ModelDao.ModelDaoImpl<SingerAllocation> implements CompetitionDaoImpl.SingerAllocationDao {
    public List<SingerAllocation> findByUserId(Integer id) {
        return this.find("from SingerAllocation sa where sa.singUpInfo.user.id =?", id);
    }

    public Boolean findByCompetitionIdAndUserId(Integer cId, Integer userId) {
        return this.find("from SingerAllocation sa where sa.singUpInfo.user.id =? and sa.competitionSession.competitionPhase.competition.id =?", userId, cId).size() > 0;
    }
}
