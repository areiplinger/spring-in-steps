package com.in28minutes.spring.basic.springinsteps.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

//Load the Context
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    //Create mock
    @Mock
    SomeCdiDao daoMock;

    //Get bean from the context
    @InjectMocks
    SomeCdiBusiness someCdiBusiness;

    @Test
    public void testBasicScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4});
        // When daoMock.getData() method is called return int[]{2,4}

        //Call method on someCdiBusiness
        //Check if value is correct
        assertEquals(4, someCdiBusiness.findTheGreatest());
    }

    @Test
    public void testBasicScenario_NoElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{});
        // When daoMock.getData() method is called return int[]{2,4}

        //Call method on someCdiBusiness
        //Check if value is correct
        assertEquals(Integer.MIN_VALUE, someCdiBusiness.findTheGreatest());
    }

    @Test
    public void testBasicScenario_EqualElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,2});
        // When daoMock.getData() method is called return int[]{2,4}

        //Call method on someCdiBusiness
        //Check if value is correct
        assertEquals(2, someCdiBusiness.findTheGreatest());
    }
}