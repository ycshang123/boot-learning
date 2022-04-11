package com.ycshang.boot.exception.service;

import com.ycshang.boot.exception.consts.MsgConsts;
import com.ycshang.boot.exception.enums.ExceptionTypeEnum;
import com.ycshang.boot.exception.exception.CustomException;
import org.springframework.stereotype.Service;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-11 11:45
 **/
@Service
public class ArticleService {

    public void systemBizError(int id) {

        throw new CustomException(ExceptionTypeEnum.SYSTEM_ERROR, "您输入的数据不符合业务逻辑,请确认后重新输入！！！");

    }

    public void userBizError(int id) {
        //    模拟业务校验失败逻辑
        if (id < 0) {
            throw new CustomException(ExceptionTypeEnum.USER_INPUT_REEOE, MsgConsts.INPUT_ERROR);
        }

    }
}