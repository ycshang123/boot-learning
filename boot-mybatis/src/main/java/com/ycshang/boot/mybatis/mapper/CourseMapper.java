package com.ycshang.boot.mybatis.mapper;

import com.ycshang.boot.mybatis.domain.Course;

import java.util.List;

/**
* @author ycshang
* @description 针对表【t_course】的数据库操作Mapper
* @createDate 2022-03-28 14:08:00
* @Entity com.ycshang.boot.mybatis.domain.Course
*/
public interface CourseMapper {

    List<Course> findOne(int courseId);

}




