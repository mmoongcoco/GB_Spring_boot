package com.example.ex00.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j

public class DependencyTest {
//    @Autowired
//    private Coding coding;
//
//    @Test
//    public void dependencyTest(){
//        log.info(coding+"");
//    }

    @Autowired
    private Restaurant restaurant;

    @Autowired
    private Chef chef;

    @Test
    public void dependencyTest(){
        log.info(restaurant+"");
        log.info(chef+"");
    }
}
