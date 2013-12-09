package com.gogowise.rep.course.dao;

import com.gogowise.rep.ModelDao;
import com.gogowise.rep.course.enity.CourseEvaluation;
import com.gogowise.rep.Pagination;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11-11-20
 * Time: 下午1:19
 * To change this template use File | Settings | File Templates.
 */
public interface CourseEvaluationDao extends ModelDao<CourseEvaluation> {

    public CourseEvaluation findByEvaluatorId(Integer eid);

    public CourseEvaluation findByCourseId(Integer cid);

    public List<CourseEvaluation> findByCourseId(Pagination pagination,Integer cid);

    public List<CourseEvaluation> findByTeacherId(Pagination pagination, Integer cid);

    public List<CourseEvaluation> findByOrganizationId(Pagination pagination,Integer oid);

}
