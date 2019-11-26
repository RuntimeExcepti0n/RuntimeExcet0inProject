package com.dragon;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.dragon.*"}
//        excludeFilters = {@ComponentScan.filter(value ={service.class})}
//        excludeFilters = {@ComponentScan.filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})}
        )
public class TripRefundApplication {


    public static void main(String[] args) {
        SpringApplication.run(TripRefundApplication.class, args);
    }
}
