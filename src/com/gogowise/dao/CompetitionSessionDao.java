package com.gogowise.dao;

import com.gogowise.domain.CompetitionSession;
import com.gogowise.domain.Pagination;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Benson
 * Date: 11-8-7
 * Time: ä¸‹å�ˆ8:23
 * To change this template use File | Settings | File Templates.
 */
public interface CompetitionSessionDao extends ModelDao<CompetitionSession> {
    public CompetitionSession createSessionWithPhase(Integer id);

    public void saveAll(CompetitionSession competitionSession);

    public List<CompetitionSession> findOngoing(Pagination page);

    public List<CompetitionSession> findAge(Pagination page);

    public List<CompetitionSession> findForcast(Pagination page);

    public List<CompetitionSession> findForcastByUser(Integer id, Pagination page);

     public List<CompetitionSession> findAgeByUser(Integer id, Pagination page);
}
