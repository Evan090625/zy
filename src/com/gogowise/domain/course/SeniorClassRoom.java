package com.gogowise.domain.course;

import com.gogowise.domain.AbstractPersistence;
import com.gogowise.domain.course.Course;
import com.gogowise.domain.user.BaseUser;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11-11-4
 * Time: 下午6:25
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class SeniorClassRoom extends AbstractPersistence {
    @ManyToOne
    private Course course;
    @OneToOne
    private BaseUser student;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public BaseUser getStudent() {
        return student;
    }

    public void setStudent(BaseUser student) {
        this.student = student;
    }
}
