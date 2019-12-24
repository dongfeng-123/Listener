package com.hd.监听器;

import javax.servlet.*;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author 风
 * @date 2019/12/23 - 10:30
 */
public class HelloListener implements ServletContextListener, HttpSessionListener, ServletRequestListener {
    ServletOutputStream out;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println ("被创建");

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println ("被销毁");
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println ("Seeion被创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println ("Session被销毁");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println ("request被销毁");

    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("request被创建");
    }
}
