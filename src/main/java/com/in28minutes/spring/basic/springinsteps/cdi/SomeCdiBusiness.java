package com.in28minutes.spring.basic.springinsteps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeCdiBusiness {

    @Autowired //Or @Inject for JavaEE CDI annotation
    SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCdiDao() {
        return someCdiDao;
    }

    public void setSomeCdiDao(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public int findTheGreatest(){
        int greatest = Integer.MIN_VALUE;
        int data [] = someCdiDao.getData();
        for (int value : data){
            if (value > greatest)
                greatest = value;
        }
        return greatest;
    }


}
