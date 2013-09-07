package com.gogowise.rep.org;

import com.gogowise.rep.ModelDaoImpl;
import com.gogowise.rep.org.org.OrganizationComment;
import com.gogowise.rep.Pagination;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("organizationCommentDao")
public class OrganizationCommentDaoImpl extends ModelDaoImpl<OrganizationComment> implements OrganizationCommentDao {
       public List<OrganizationComment> findOrgCommentByOrgId(Integer orgId, Pagination pagination){
            return  this.find("select oc from OrganizationComment oc where oc.organization.id = ? order by oc.id desc ", pagination, orgId);
       }

}
