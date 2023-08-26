package com.javajourney.learnspringframework.examples.realworld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBData implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] { 10, 20, 30, 40, 50 };
    }
}
