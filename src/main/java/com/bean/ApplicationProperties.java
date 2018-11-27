package com.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: yunxiang.yang
 * @Date: 2018/11/26 17:18
 */
@Component
@ConfigurationProperties(value = "application.properties")
public class ApplicationProperties {

    private String test1;
    private String test2;
    private String test3;

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public String getTest3() {
        return test3;
    }

    public void setTest3(String test3) {
        this.test3 = test3;
    }
}
