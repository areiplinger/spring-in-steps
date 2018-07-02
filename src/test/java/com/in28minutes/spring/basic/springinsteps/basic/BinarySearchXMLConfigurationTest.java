package com.in28minutes.spring.basic.springinsteps.basic;

import com.in28minutes.spring.basic.springinsteps.SpringInStepsBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//Load the Context
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class BinarySearchXMLConfigurationTest {

    //Get bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {

        //Call method on binarySearch
        int actualResult = binarySearch.binarySearch(new int[]{}, 5);
        //Check if value is correct
        assertEquals(3, actualResult);
    }
}