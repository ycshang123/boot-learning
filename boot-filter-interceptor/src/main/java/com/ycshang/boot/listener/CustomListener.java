package com.ycshang.boot.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.SessionEvent;
import org.apache.catalina.SessionListener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-04 10:21
 **/
@Slf4j
@WebListener
public class CustomListener implements ServletContextListener, HttpSessionListener, ServletRequestListener, ServletRequestAttributeListener, HttpSessionAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
      log.info("==============================context创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("==============================context销毁");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("==============================request销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("==============================request创建");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
      if("a".equals(srae.getName())){
          log.info("----------------------attribute  Added值是==="+srae.getValue());
      }
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        if("a".equals(srae.getName())){
            log.info("----------------------attribute  Removed");
        }
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        if("a".equals(srae.getName())){
            log.info("----------------------attribute  Replaced");
        }
    }



    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("==============================session创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("==============================session销毁");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        if("a".equals(se.getName())){
            log.info("----------------------sessionAdded");
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        if("a".equals(se.getName())){
            log.info("----------------------sessionRemoved");
        }
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        if("a".equals(se.getName())){
            log.info("----------------------sessionReplaced");
        }
    }
}