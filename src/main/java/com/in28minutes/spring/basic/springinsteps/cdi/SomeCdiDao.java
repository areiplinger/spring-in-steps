package com.in28minutes.spring.basic.springinsteps.cdi;

import org.springframework.stereotype.Component;

@Component //Or @Named for JavaEE CDI annotation, Or @Repository Spring Annotation
public class SomeCdiDao {

    public int[] getData() {
        return new int[] {5,89,102};
    }

}
