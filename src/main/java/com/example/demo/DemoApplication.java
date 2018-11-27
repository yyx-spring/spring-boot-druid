package com.example.demo;

import com.condition.TestBeanCondition;
import com.bean.TestBean1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;

@SpringBootApplication
@ComponentScan("com.**")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    @Conditional(TestBeanCondition.class)
    public TestBean1 testBean1() {
        return new TestBean1();
    }
}
