package com.dragon.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextUtil implements ApplicationContextAware {
    /**
     * spring应用上下文
     */
    private static ApplicationContext applicationContext;

    private static synchronized void setSyncApplication(ApplicationContext applicationContext){
        SpringContextUtil.applicationContext = applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        setSyncApplication(ctx);
    }

    /**
     * 获取Bean
     * @param name
     * @return
     */
    public static Object getBean(String name){
        return  applicationContext.getBean(name);
    }

    public static <T> T getBean(Class<T> clazz){
        return applicationContext.getBean(clazz);
    }
}
