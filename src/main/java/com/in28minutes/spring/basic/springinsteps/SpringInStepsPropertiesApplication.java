package com.in28minutes.spring.basic.springinsteps;

import com.in28minutes.spring.basic.springinsteps.basic.BinarySearchImpl;
import com.in28minutes.spring.basic.springinsteps.properties.SomeExternalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//app.properties
@PropertySource("classpath:app.properties")
public class SpringInStepsPropertiesApplication {

    public static void main(String[] args) {

            try (AnnotationConfigApplicationContext applicationContext =
                    new AnnotationConfigApplicationContext(SpringInStepsPropertiesApplication.class)) {

                    SomeExternalService service =
                            applicationContext.getBean(SomeExternalService.class);

                    System.out.println(service.returnUrl());
            }
    }
}

//((AnnotationConfigApplicationContext) applicationContext).close();