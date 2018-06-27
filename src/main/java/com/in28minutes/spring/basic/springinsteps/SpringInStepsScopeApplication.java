package com.in28minutes.spring.basic.springinsteps;

import com.in28minutes.spring.basic.springinsteps.scope.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringInStepsScopeApplication {

    //What are the beans?
    //What are the dependencies for the beans?
    //Where to search for the beans? => Searches in the package

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInStepsScopeApplication.class);

    public static void main(String[] args) {

        // Spring application context
        // Gets the application context of beans
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringInStepsScopeApplication.class);
                //SpringApplication.run(SpringInStepsScopeApplication.class, args);

        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

        PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);


        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());
        LOGGER.info("{}", personDAO.getJdbcConnection());

        LOGGER.info("{}", personDAO1);
        LOGGER.info("{}", personDAO1.getJdbcConnection());



	}
}
