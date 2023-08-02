package com.in28min.learnspringframework.examples.exercise01;

import org.springframework.stereotype.Repository;

@Repository
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
