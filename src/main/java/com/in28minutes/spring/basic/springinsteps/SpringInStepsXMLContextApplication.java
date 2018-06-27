package com.in28minutes.spring.basic.springinsteps;


import com.in28minutes.spring.basic.springinsteps.xml.XMLPersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringInStepsXMLContextApplication {

    //What are the beans?
    //What are the dependencies for the beans?
    //Where to search for the beans? => Searches in the package

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInStepsXMLContextApplication.class);

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        LOGGER.info("Beans loaded -> {}",(Object) applicationContext.getBeanDefinitionNames());

        XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);


        LOGGER.info("{} {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());

        System.out.println(xmlPersonDAO);
        System.out.println(xmlPersonDAO.getXmlJdbcConnection());

	}
}

