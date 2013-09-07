package com.gogowise.repository.course;

import com.gogowise.repository.ModelDao;
import com.gogowise.domain.user.Comments;
import com.gogowise.domain.Pagination;

import java.util.List;

public interface CommentsDao extends ModelDao<Comments> {

    public List<Comments> findByCommentTo(Integer userId, Pagination page);
}
