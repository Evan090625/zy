package com.gogowise.dao.course;

import com.gogowise.dao.ModelDao;
import com.gogowise.domain.Pagination;
import com.gogowise.domain.course.SeniorClassRoom;

import java.io.IOException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11-11-4
 * Time: 下午6:43
 * To change this template use File | Settings | File Templates.
 */
public interface SeniorClassRoomDao extends ModelDao<SeniorClassRoom> {

    public void saveStudentforSeniorClassRoom(SeniorClassRoom seniorClassRoom);

    public SeniorClassRoom findClassRoomByCourseAndStudent(Integer cid,Integer sid);

    public List<SeniorClassRoom> findClassRoomByCourseId(Integer cid);

    public List<SeniorClassRoom> findAllClassRoomByUser(Pagination pagination,Integer userId);

    public String  saveSeniorClassRoom(Integer courseId,Integer userId) throws IOException;

    public String deleteSeniorClassRoom(Integer cid,Integer uid);
}
