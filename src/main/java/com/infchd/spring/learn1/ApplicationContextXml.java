package com.infchd.spring.learn1;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextXml {
    private static Logger LOGGER = LogManager.getLogger(ApplicationContextXml.class);
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService helloService = context.getBean(HelloService.class);
        helloService.findAll();
        LOGGER.info("sgsgsg");
    }
}
