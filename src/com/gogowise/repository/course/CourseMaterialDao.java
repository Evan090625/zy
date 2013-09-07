package com.gogowise.repository.course;

import com.gogowise.repository.ModelDao;
import com.gogowise.domain.course.CourseMaterial;
import com.gogowise.domain.Pagination;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AN
 * Date: 12-5-14
 * Time: 上午1:50
 * To change this template use File | Settings | File Templates.
 */

public interface CourseMaterialDao extends ModelDao<CourseMaterial> {
     public List<CourseMaterial> findByCourseId(Pagination pagination, Integer courseId);
}
