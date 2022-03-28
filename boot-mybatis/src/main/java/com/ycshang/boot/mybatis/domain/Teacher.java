package com.ycshang.boot.mybatis.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @TableName t_teacher
 */
@Data
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 教师id
     */
    private Integer teacherId;
    /**
     * 教师姓名
     */
    private String teacherName;
    /**
     * 教师管理的班级id
     */
    private Integer clazzId;
    private Clazz clazz;
}