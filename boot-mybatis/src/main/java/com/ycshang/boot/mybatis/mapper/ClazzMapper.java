package com.ycshang.boot.mybatis.mapper;

import com.ycshang.boot.mybatis.domain.Clazz;

/**
* @author ycshang
* @description 针对表【t_clazz】的数据库操作Mapper
* @createDate 2022-03-28 14:07:17
* @Entity com.ycshang.boot.mybatis.domain.Clazz
*/
public interface ClazzMapper {
    /**
     * 根据班级id查询班级信息
     * @param clazzId
     * @return
     */
    Clazz findOneByMany(int clazzId);

    /**
     * 根据班级id查询班级信息
     * @param clazzId
     * @return
     */
    Clazz getClazz(int clazzId);

}




