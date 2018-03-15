package com.demo.spring;

import com.demo.spring.annotation.AppConfig;
import com.demo.spring.bo.Meter;
import com.demo.spring.bo.Site;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bqhuy on 3/14/2018.
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("ClassPathXmlApplicationContext -------------------------------------------");
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        System.out.println("scope= singleton");
        Meter singletonMeter1 = (Meter) context.getBean("singletonMeter");
        singletonMeter1.setMeterType("Real");
        System.out.println(singletonMeter1.toString());
        Meter singletonMeter2 = (Meter) context.getBean("singletonMeter");
        System.out.println(singletonMeter2.toString());

        System.out.println("scope= prototype");
        Meter prototypeMeter1 = (Meter) context.getBean("prototypeMeter");
        prototypeMeter1.setMeterType("Real");
        System.out.println(prototypeMeter1.toString());
        Meter prototypeMeter2 = (Meter) context.getBean("prototypeMeter");
        System.out.println(prototypeMeter2.toString());

        System.out.println("AnnotationConfigApplicationContext -------------------------------------------");
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Meter meter = context2.getBean(Meter.class);
        System.out.println(meter.toString());
        Site site = context2.getBean(Site.class);
        System.out.println(site.toString());
    }
}
