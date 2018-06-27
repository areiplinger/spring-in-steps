package com.in28minutes.spring.basic.springinsteps;

import com.in28minutes.spring.basic.springinsteps.basic.BinarySearchImpl;
import com.in28minutes.spring.basic.springinsteps.scope.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInStepsScopeApplication {

    //What are the beans?
    //What are the dependencies for the beans?
    //Where to search for the beans? => Searches in the package

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInStepsScopeApplication.class);

    public static void main(String[] args) {

        // Old method having to manually wire the dependency
        // (creating the object, but dynamically passing the (class)method to use)
        /*BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlg());*/

        // Spring application context
        // Gets the application context of beans
        ApplicationContext applicationContext =
                SpringApplication.run(SpringInStepsScopeApplication.class, args);

        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

        PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);


        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());

        LOGGER.info("{}", personDAO1);
        LOGGER.info("{}", personDAO1.getJdbcConnection());



	}
}
