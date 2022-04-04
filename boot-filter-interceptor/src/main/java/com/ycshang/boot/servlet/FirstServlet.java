package com.ycshang.boot.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-04 11:26
 **/
@WebServlet(name = "firstServlet",urlPatterns = "/firstServlet")
@Slf4j
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      log.info("firstServlet");
      resp.getWriter().write("firstServlet");
    }
}