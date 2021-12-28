package com.marinel.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/*
    This class is used to:
    - create the servlet context
    - to register the WebConfig class
    - to create the dispatcher
    - register and config the dispatcher servlet
 */

@Slf4j
public class WebAppInitializer implements WebApplicationInitializer {

    // == this is the name of the servlet ==
    private final String DISPATCHER_SERVLET_NAME = "dispatcher";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        log.info("onStartup method");

        // == create the spring web application context ==
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        //== register the WebConfig class ==
        context.register(WebConfig.class);

        // == create the dispatcher servlet ==
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        // == register and config the dispatcher servlet ==
        ServletRegistration.Dynamic registration = servletContext.addServlet(DISPATCHER_SERVLET_NAME, dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
