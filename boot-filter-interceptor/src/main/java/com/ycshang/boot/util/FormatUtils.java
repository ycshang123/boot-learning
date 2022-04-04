package com.ycshang.boot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-04 14:41
 **/
public class FormatUtils {
    public static String formatTime(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(date.getTime());
        return time;
    }
}