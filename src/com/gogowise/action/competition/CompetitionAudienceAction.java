package com.gogowise.action.competition;

import com.gogowise.action.BasicAction;
import com.gogowise.rep.user.dao.BaseUserDao;
import com.gogowise.rep.competition.CompetitionAudienceDao;
import com.gogowise.rep.competition.CompetitionSessionDao;
import com.gogowise.rep.competition.enity.CompetitionAudience;
import com.gogowise.common.utils.Constants;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11-10-17
 * Time: 下午6:33
 * To change this template use File | Settings | File Templates.
 */
@Controller
@Namespace(BasicAction.BASE_NAME_SPACE)
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CompetitionAudienceAction extends BasicAction {
    /**
     *
     */
    private static final long serialVersionUID = -7661285349496823533L;
    private CompetitionAudienceDao competitionAudienceDao;
    private BaseUserDao baseUserDao;
    private CompetitionSessionDao competitionSessionDao;
    private CompetitionAudience competitionAudience;

    @Action(value = "saveReservation")
    public void saveReservation() throws IOException {

        competitionAudience.setAudience(baseUserDao.findById(super.getSessionUserId()));
        competitionAudience.setCompetitionSession(competitionSessionDao.findById(competitionAudience.getCompetitionSession().getId()));

        CompetitionAudience curr = competitionAudienceDao.findCompetitionAudienceByUserIdCid(super.getSessionUserId(), competitionAudience.getCompetitionSession().getId());

        PrintWriter out = ServletActionContext.getResponse().getWriter();

        if (curr != null) {
            out.println(Constants.SUCCESS_OBSERVATED);
        } else {
            competitionAudienceDao.saveCompetitionAudience(competitionAudience);
            out.println(Constants.SUCCESS_OBSERVATE);
        }


    }


    //==================================getter and setter
    public CompetitionAudienceDao getCompetitionAudienceDao() {
        return competitionAudienceDao;
    }

    public void setCompetitionAudienceDao(CompetitionAudienceDao competitionAudienceDao) {
        this.competitionAudienceDao = competitionAudienceDao;
    }

    public CompetitionAudience getCompetitionAudience() {
        return competitionAudience;
    }

    public void setCompetitionAudience(CompetitionAudience competitionAudience) {
        this.competitionAudience = competitionAudience;
    }

    public BaseUserDao getBaseUserDao() {
        return baseUserDao;
    }

    public void setBaseUserDao(BaseUserDao baseUserDao) {
        this.baseUserDao = baseUserDao;
    }

    public CompetitionSessionDao getCompetitionSessionDao() {
        return competitionSessionDao;
    }

    public void setCompetitionSessionDao(CompetitionSessionDao competitionSessionDao) {
        this.competitionSessionDao = competitionSessionDao;
    }
}
