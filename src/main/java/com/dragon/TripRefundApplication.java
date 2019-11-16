package com.dragon;


import com.dragon.Filter.MyTypeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@SpringBootApplication
@ComponentScan(basePackages={"com.dragon.*"}
//        excludeFilters = {@ComponentScan.Filter(value ={Service.class})}
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})}
        )
public class TripRefundApplication {


    public static void main(String[] args) {
        SpringApplication.run(TripRefundApplication.class, args);
    }
}
