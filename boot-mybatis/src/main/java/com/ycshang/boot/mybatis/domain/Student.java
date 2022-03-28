package com.ycshang.boot.mybatis.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @TableName t_student
 */
@Data
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 学生id
     */
    private Integer studentId;
    /**
     * 学生所属班级的id
     */
    private Integer clazzId;
    /**
     * 学生姓名
     */
    private String studentName;
    /**
     * 学生籍贯
     */
    private String hometown;
    /**
     * 出生日期
     */
    private Date birthday;
    /**
     * 教师管理的班级对象
     */
    private Clazz clazz;
    /**
     * 一个学生可以选多门课(多对多)
     */
    private List<Course> courses;

}