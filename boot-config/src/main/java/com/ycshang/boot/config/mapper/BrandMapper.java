package com.ycshang.boot.config.mapper;

import com.ycshang.boot.config.model.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BrandMapper {
    @Select("SELECT * FROM tb_brand ORDER BY ordered")
    List<Brand> selectAll();
}
