package com.gogowise.rep.org.dao;

import com.gogowise.rep.ModelDaoImpl;
import com.gogowise.rep.org.enity.ChangeResponserHistory;
import com.gogowise.rep.org.enity.Organization;
import com.gogowise.rep.org.enity.OrganizationHistory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11-11-3
 * Time: 上午9:30
 * To change this template use File | Settings | File Templates.
 */
@Repository("changeResponserHistoryDao")
public class ChangeResponserHistoryDaoImpl extends ModelDaoImpl<ChangeResponserHistory> implements ChangeResponserHistoryDao{
    private OrganizationHistoryDao organizationHistoryDao;
    private OrganizationDao organizationDao;

    public void confirmChange(String effectiveCode) {
        //需要做的事 是将学校负责人变更后的信息填入 OrganizationHistory中同时更新Organization 并将Organization的代理人设置为null
        ChangeResponserHistory history = this.findByEffectiveCode(effectiveCode);
        Organization organization = history.getOrganization();

        //将新的负责人以及代理人填入学校历史，以便将来付款
        OrganizationHistory organizationHistory = new OrganizationHistory();
        organizationHistory.setOrganization(organization);
        organizationHistory.setAgent(null);

        //这里记录的是新的负责人 原来负责人信息在新创建学校的时候就已经记录了
        organizationHistory.setResponser(history.getNewResponser());
        organizationHistoryDao.persistAbstract(organizationHistory);
//        organization.setAgent(null);
        organization.setResponsiblePerson(history.getNewResponser());
        organizationDao.persistAbstract(organization);
    }

    public ChangeResponserHistory findByEffectiveCode(String effective){
         List<ChangeResponserHistory> list = this.find("From ChangeResponserHistory f where f.effectiveCode=?",effective);
         if(list.size()>0){
             return list.get(0);
         }
        return null;
    }

    public OrganizationHistoryDao getOrganizationHistoryDao() {
        return organizationHistoryDao;
    }

    public void setOrganizationHistoryDao(OrganizationHistoryDao organizationHistoryDao) {
        this.organizationHistoryDao = organizationHistoryDao;
    }

    public OrganizationDao getOrganizationDao() {
        return organizationDao;
    }

    public void setOrganizationDao(OrganizationDao organizationDao) {
        this.organizationDao = organizationDao;
    }
}
