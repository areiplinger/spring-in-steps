package com.in28minutes.spring.basic.springinsteps;

import com.in28minutes.spring.basic.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//Necessary to scan other packages outside current package
@ComponentScan("com.in28minutes.spring.basic.componentscan")
public class SpringInStepsComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInStepsComponentScanApplication.class);

    public static void main(String[] args) {

        // Spring application context
        // Gets the application context of beans
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringInStepsComponentScanApplication.class);
                //SpringApplication.run(SpringInStepsComponentScanApplication.class, args);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);

	}
}
