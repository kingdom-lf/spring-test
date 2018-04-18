package com.persional.spring.service.impl;

import com.persional.spring.manager.AnnaManager;
import com.persional.spring.manager.BobManager;
import com.persional.spring.service.AppService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/4/18.
 */
public class AppServiceImpl implements AppService {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        AnnaManager annaManager = (AnnaManager) context.getBean("annaManager");
        BobManager bobManager = (BobManager) context.getBean("bobManager");

        annaManager.requestBob();
        bobManager.requestAnna();
    }

}
