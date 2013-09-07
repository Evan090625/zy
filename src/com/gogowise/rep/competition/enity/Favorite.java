package com.gogowise.rep.competition.enity;

import com.gogowise.rep.AbstractPersistence;
import com.gogowise.rep.user.user.BaseUser;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Favorite extends AbstractPersistence {

    @OneToOne
    private BaseUser owner;
    private CompetitionSession session;


    public BaseUser getOwner() {
        return owner;
    }

    public void setOwner(BaseUser owner) {
        this.owner = owner;
    }

    public CompetitionSession getSession() {
        return session;
    }

    public void setSession(CompetitionSession session) {
        this.session = session;
    }
}
