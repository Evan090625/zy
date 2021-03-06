package com.gogowise.common.utils;

import com.gogowise.rep.live.MatterDao;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

@Component
public class InitializingServiceBean {
    private ThreadPoolTaskScheduler scheduler;
    private MatterDao matterDao;

    public ThreadPoolTaskScheduler getScheduler() {
        return scheduler;
    }

    public void setScheduler(ThreadPoolTaskScheduler scheduler) {
        EmailUtil.scheduler =  scheduler;
        this.scheduler = scheduler;

    }

    public MatterDao getMatterDao() {
        return matterDao;
    }

    public void setMatterDao(MatterDao matterDao) {
        EmailUtil.matterDao=matterDao;
        this.matterDao = matterDao;
    }
}
