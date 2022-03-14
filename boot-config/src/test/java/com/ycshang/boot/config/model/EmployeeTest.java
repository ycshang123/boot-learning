package com.ycshang.boot.config.model;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest
//JUnit5
@ExtendWith(SpringExtension.class)
@Slf4j
//JUnit4
//@RunWith(SpringRunner.class)
class EmployeeTest {
    @Resource
    private Employee employee;

    @Test
    void valueBind() throws Exception {
        log.info(String.valueOf(employee));

        Map<String, Integer> map = employee.getEmployeeAge();
        map.forEach((key, value) -> {
            System.out.println(key + "->" + value);
        });

    }


    @Test
    void testList() throws Exception {
        List<String> list = List.of("aaa", "bbb", "ccc");
        list.forEach(System.out::println);

    }

}