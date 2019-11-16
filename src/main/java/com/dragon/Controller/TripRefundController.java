package com.dragon.Controller;

import com.dragon.Entity.TripBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trip")
public class TripRefundController {

    @Autowired
    ApplicationContext applicationContext;

    @RequestMapping("getHello")
    public String getHello(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        String[] beanNamesForType = applicationContext.getBeanNamesForType(TripBase.class);
        Environment environment = applicationContext.getEnvironment();
        environment.getProperty("os.name");

        for (String name :beanNamesForType) {
            System.out.println(name);
        }

        return "AAA";
    }
}
