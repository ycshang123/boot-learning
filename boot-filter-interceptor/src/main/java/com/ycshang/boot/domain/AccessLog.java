package com.ycshang.boot.domain;

import com.ycshang.boot.util.FormatUtils;
import lombok.Data;

import java.util.Date;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-04 14:06
 **/
@Data
public class AccessLog {
    private String username;
    private String uri;
    private Integer duration;
    private String httpMethod;
    private Integer httpStatus;
    private String ip;
    private Date createTime;

    @Override
    public String toString() {
        return "AccessLog{" +
                "username='" + username + '\'' +
                ", uri='" + uri + '\'' +
                ", duration=" + duration +
                ", httpMethod='" + httpMethod + '\'' +
                ", httpStatus=" + httpStatus +
                ", ip='" + ip + '\'' +
                ", createTime=" + FormatUtils.formatTime(this.createTime) +
                '}';
    }
}