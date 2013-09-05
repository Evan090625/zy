package com.gogowise.dao.impl;


import com.gogowise.dao.CourseMaterialDao;
import com.gogowise.domain.CourseMaterial;
import com.gogowise.domain.Pagination;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *Created by IntelliJ IDEA.
 * User: Yongzhi
 * Date: 12-5-13
 * Time: 下午10:12.
 */

@Repository("courseMaterialDao")
public class CourseMaterialDaoImpl extends ModelDaoImpl<CourseMaterial> implements CourseMaterialDao{

    public List<CourseMaterial> findByCourseId(Pagination pagination, Integer courseId) {
        return this.find("From CourseMaterial cm where cm.course.id=? order by cm.uploadTime desc",pagination,courseId);
    }
}


