package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

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

}
