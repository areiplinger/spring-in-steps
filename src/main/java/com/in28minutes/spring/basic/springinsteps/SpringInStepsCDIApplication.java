package com.in28minutes.spring.basic.springinsteps;

import com.in28minutes.spring.basic.springinsteps.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringInStepsCDIApplication {

    //What are the beans?
    //What are the dependencies for the beans?
    //Where to search for the beans? => Searches in the package

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInStepsCDIApplication.class);

    public static void main(String[] args) {

        // Spring application context
        // Gets the application context of beans
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringInStepsCDIApplication.class);
                //SpringApplication.run(SpringInStepsCDIApplication.class, args);

        SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

        LOGGER.info("{} dao-{}", business, business.getSomeCdiDao());

	}
}
