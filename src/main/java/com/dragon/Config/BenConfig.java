package com.dragon.Config;

import com.dragon.Entity.TripBase;
import com.dragon.Entity.TripPerson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BenConfig {

    @Bean
    public TripPerson getTripPerson(){
        return new TripPerson();
    }

    @Bean
    public TripBase getTripBase(){
        return new TripBase();
    }
}
