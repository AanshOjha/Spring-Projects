package com.javajourney.learnspringframework.examples.realworld;

import org.springframework.stereotype.Component;

@Component
public class MySQLData implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] { 1, 2, 3, 4, 5 };
    }
    
}
