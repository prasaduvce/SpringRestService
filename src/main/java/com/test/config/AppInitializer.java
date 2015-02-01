package com.test.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        XmlWebApplicationContext xmlWebApplicationContext = new XmlWebApplicationContext();
        xmlWebApplicationContext.setConfigLocation("spring/SpringContext-servlet.xml");

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringContext",new DispatcherServlet(xmlWebApplicationContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
