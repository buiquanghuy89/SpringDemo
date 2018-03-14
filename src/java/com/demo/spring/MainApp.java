package com.demo.spring;

import com.demo.spring.bo.Meter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bqhuy on 3/14/2018.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Meter obj = (Meter) context.getBean("meter");
        System.out.println(obj.toString());
    }
}
