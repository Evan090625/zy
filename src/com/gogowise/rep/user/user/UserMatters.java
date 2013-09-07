package com.gogowise.rep.user.user;


import com.gogowise.rep.AbstractPersistence;
import com.gogowise.rep.live.live.PersonalOnlive;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Calendar;
@Entity
public class UserMatters extends AbstractPersistence {

    @OneToOne
    private BaseUser user;
    @OneToOne
    private PersonalOnlive personalOnlive;
    private Boolean viewed = false;
    private Calendar createTime;

    public BaseUser getUser() {
        return user;
    }

    public void setUser(BaseUser user) {
        this.user = user;
    }

    public PersonalOnlive getPersonalOnlive() {
        return personalOnlive;
    }

    public void setPersonalOnlive(PersonalOnlive personalOnlive) {
        this.personalOnlive = personalOnlive;
    }

    public Boolean getViewed() {
        return viewed;
    }

    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }

    public Calendar getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Calendar createTime) {
        this.createTime = createTime;
    }
}
