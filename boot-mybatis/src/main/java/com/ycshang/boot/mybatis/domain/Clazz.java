package com.ycshang.boot.mybatis.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @TableName t_clazz
 */
@Data
public class Clazz implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 班级id
     */
    private Integer clazzId;
    /**
     * 班级名称
     */
    private String clazzName;
    /**
     * 班级管理老师的id
     */
    private Integer teacherId;
    /**
     * 管理老师的id(一对一)
     */
    private Teacher teacher;
    /**
     * 班级里所有的学生，在一方中声明多方的集合
     */
    private List<Student> students;
    /**
     * 多方里声明一方的对象
     */
    private Clazz clazz;
}