package com.ycshang.boot.mybatis.mapper;

import com.ycshang.boot.mybatis.domain.Teacher;

/**
* @author ycshang
* @description 针对表【t_teacher】的数据库操作Mapper
* @createDate 2022-03-28 14:08:00
* @Entity com.ycshang.boot.mybatis.domain.Teacher
*/
public interface TeacherMapper {
    /**
     * 根据教师id查询对应班级
     * @param teacherId
     * @return
     */
    Teacher findOneByOne(int teacherId);

}




