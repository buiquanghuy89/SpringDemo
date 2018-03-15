package com.demo.spring.annotation;

import com.demo.spring.bo.Meter;
import com.demo.spring.bo.Site;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bqhuy on 3/15/2018.
 */
@Configuration
public class AppConfig {
    @Bean
    public Meter meter() {
        Meter result = new Meter();
        result.setMeterCode("M3");
        result.setMeterName("BOIS");
        result.setNumberOfWheel(10);
        result.setSite(site());
        return result;
    }

    @Bean
    public Site site() {
        Site result = new Site();
        result.setSiteCode("S3");
        result.setSiteName("ThangLong Tower");
        result.setSiteType("Building");
        return result;
    }
}
