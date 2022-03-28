package com.ycshang.boot.mybatis.mapper;

import com.ycshang.boot.mybatis.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class TeacherMapperTest {
    @Resource
    private TeacherMapper teacherMapper;

    @Test
    void findOneByOne() {
        Teacher teacher = teacherMapper.findOneByOne(1);
        System.out.println(teacher);
    }
}