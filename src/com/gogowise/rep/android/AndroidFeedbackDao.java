package com.gogowise.rep.android;

import com.gogowise.rep.ModelDao;
import com.gogowise.rep.android.enity.AndroidFeedback;

/**
 * Created by IntelliJ IDEA.
 * User: AN
 * Date: 12-10-4
 * Time: 下午5:25
 * To change this template use File | Settings | File Templates.
 */
public interface AndroidFeedbackDao extends ModelDao<AndroidFeedback> {
       public void saveAndroidFeedback(AndroidFeedback androidFeedback);


}
