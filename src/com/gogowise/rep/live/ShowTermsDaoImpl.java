package com.gogowise.rep.live;

import com.gogowise.rep.ModelDaoImpl;
import com.gogowise.rep.live.enity.ShowTerms;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-6-11
 * Time: 下午3:17
 * To change this template use File | Settings | File Templates.
 */
@Repository("showTermsDao")
public class ShowTermsDaoImpl extends ModelDaoImpl<ShowTerms> implements ShowTermsDao{
}
