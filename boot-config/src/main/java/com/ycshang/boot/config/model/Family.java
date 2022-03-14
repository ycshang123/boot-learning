package com.ycshang.boot.config.model;

import com.ycshang.boot.config.util.MixPropertySourceFactory;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-14 11:08
 **/
@Data
@Component
@ConfigurationProperties(prefix = "family")
@Validated
@PropertySource(value = {"classpath:family.yml"}, factory = MixPropertySourceFactory.class)

public class Family {
    @Length(min = 5, max = 20, message = "家庭名称长度必须在5—20之间")
    //@Value("${family.family-name}")
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;
}