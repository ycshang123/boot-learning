package com.ycshang.boot.datasource.entity;

import com.ycshang.boot.jpa.listener.DataBaseAuditListener;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-01 11:12
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners({DataBaseAuditListener.class})
public class Article implements Serializable {
    @Serial
    private static final long serialVersionUID = -3317203987154803161L;

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String author;

    private String title;

    private String thumbnail;

    private String content;

    @Column(name = "create_time", updatable = false)
    private Date createTime;

    private Date updateTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
