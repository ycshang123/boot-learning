package com.ycshang.boot.mybatis.mapper;

import com.ycshang.boot.mybatis.domain.Course;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
class CourseMapperTest {
    @Resource
    private CourseMapper courseMapper;

    @Test
    void findOne() {
        List<Course> courses = courseMapper.findOne(20001);
        courses.forEach(course -> log.info(String.valueOf(course)));
    }
}