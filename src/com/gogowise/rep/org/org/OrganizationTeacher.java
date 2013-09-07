package com.gogowise.rep.org.org;

import com.gogowise.rep.AbstractPersistence;
import com.gogowise.rep.user.user.BaseUser;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11-10-24
 * Time: 下午3:09
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class OrganizationTeacher extends AbstractPersistence {

    public final static  Integer ORG_ROLE_TYPE_AUTH = 1;

    @ManyToOne
    private BaseUser teacher;
    @ManyToOne
    private Organization org;

    private Boolean orgRoleType = false;

    private Calendar createDate = Calendar.getInstance();

    public BaseUser getTeacher() {
        return teacher;
    }

    public void setTeacher(BaseUser teacher) {
        this.teacher = teacher;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public Calendar getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Calendar createDate) {
        this.createDate = createDate;
    }

    public Boolean getOrgRoleType() {
        return orgRoleType;
    }

    public void setOrgRoleType(Boolean orgRoleType) {
        this.orgRoleType = orgRoleType;
    }
}
