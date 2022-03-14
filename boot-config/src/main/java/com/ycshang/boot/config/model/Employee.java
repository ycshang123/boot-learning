package com.ycshang.boot.config.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @program: spring-boot-learning
 * @description:@Configuration 表示本类是一个配置类
 * @author: ycshang
 * @create: 2022-03-14 15:40
 **/
@Data
@Configuration
@PropertySource(name = "employeeProperties", value = "classpath:employee.properties")
public class Employee {

    /**
     * 使用SqEL，读取employee.properties
     */
    @Value("#{'${employee.names}'.split(',') }")
    private List<String> employeeNames;

    @Value("#{'${employee.type}'.split(',') }")
    private List<String> type;

    @Value("#{'${employee.names}'.split(',')[0] }")
    private String firstname;

    @Value("#{${employee.age}}")
    private Map<String, Integer> employeeAge;


    @Value("#{${employee.age}['one'] !=null ? ${employee.age}['one']: 99}")
    private Integer ageWithDefaultValue;

    @Value("#{systemProperties['java.home']}")
    private String javaHome;

    @Value("#{systemProperties['user.dir']}")
    private String userDir;


}