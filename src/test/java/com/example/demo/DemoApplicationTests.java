package com.example.demo;

import com.bean.ApplicationProperties;
import com.config.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DemoApplicationTests {

    @Autowired
    ApplicationProperties applicationProperties;

    @Test
    public void contextLoads() {
    }

    public int searchFirst(int a[], int size, int target) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }


    @Test
    public void test1(){
        System.out.println(applicationProperties.getTest1() + "/" + applicationProperties.getTest2() + "/" + applicationProperties.getTest3());

    }

}
