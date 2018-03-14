package com.demo.spring;

import com.demo.spring.bo.Meter;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bqhuy on 3/14/2018.
 */
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
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
        context.registerShutdownHook();
    }
}
