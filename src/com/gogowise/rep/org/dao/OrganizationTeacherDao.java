package com.gogowise.rep.org.dao;

import com.gogowise.rep.ModelDao;
import com.gogowise.rep.org.enity.OrganizationTeacher;
import com.gogowise.rep.Pagination;

import java.util.List;


public interface OrganizationTeacherDao extends ModelDao<OrganizationTeacher> {

    public List<OrganizationTeacher> find(Integer orgId,Pagination pagination);

    public OrganizationTeacher findByOrgIdAndTeacherId(Integer orgId,Integer teacherId);
}
