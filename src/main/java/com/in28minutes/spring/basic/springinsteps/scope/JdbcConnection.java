package com.in28minutes.spring.basic.springinsteps.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {

    public JdbcConnection() {
        System.out.println("JDBC Connection");
    }


}
