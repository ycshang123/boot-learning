package com.ycshang.boot.mybatis.mapper;

import com.ycshang.boot.mybatis.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ycshang
 * @description 针对表【t_student】的数据库操作Mapper
 * @createDate 2022-03-28 14:08:00
 * @Entity com.ycshang.boot.mybatis.domain.Student
 */
public interface StudentMapper {
    /**
     * 根据学生id查询学生
     *
     * @param studentId
     * @return
     */
    Student findManyByOne(int studentId);

    /**
     * 根据学生id查询学生
     *
     * @param studentId
     * @return
     */
    Student getStudent(int studentId);

    /**
     * 批量新增
     * @param students
     * @return
     */
    int batchInsert(@Param("students")  List<Student> students);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int batchDelete(@Param("ids") List<Integer> ids);

    /**
     * 批量修改
     * @param students
     * @return
     */
    int batchUpdate(@Param("students") List<Student> students);

    /**
     * 动态查询
     * @param student
     * @return
     */
    List<Student> findStudentBy(@Param("student") Student student);

}




