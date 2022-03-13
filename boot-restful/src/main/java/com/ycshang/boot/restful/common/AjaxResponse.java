package com.ycshang.boot.restful.common;

import lombok.Data;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-10 16:39
 **/
@Data
public class AjaxResponse {
    private Integer code;
    private String message;
    private Object data;


    private AjaxResponse() {

    }

    /**
     * 请求成功响应，不带查询参数(常用于删除、修改、新增)
     *
     * @return
     */
    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求成功");
        return ajaxResponse;
    }

    /**
     * 请求成功响应:带返回数据
     *
     * @param data
     * @return
     */
    public static AjaxResponse success(Object data) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求成功");
        ajaxResponse.setData(data);
        return ajaxResponse;
    }


}