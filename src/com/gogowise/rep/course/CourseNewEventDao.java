package com.gogowise.rep.course;

import com.gogowise.rep.ModelDao;
import com.gogowise.domain.course.CourseNewEvent;
import com.gogowise.domain.Pagination;

import java.util.List;


public interface CourseNewEventDao extends ModelDao<CourseNewEvent> {

    public List<CourseNewEvent> findLatestTenEvents(Pagination pagination);

    public List<CourseNewEvent> findByCourseID(Integer courseID, Pagination pagination);
}
