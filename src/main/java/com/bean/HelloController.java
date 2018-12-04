package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Author: yunxiang.yang
 * @Date: 2018/11/26 15:09
 */

@Controller
//@ConfigurationProperties(prefix = "properties")
public class HelloController {
    @Autowired
    JdbcTemplate template;

    @Autowired
    ApplicationProperties applicationProperties;

    private String testUuid;

    public String getTestUuid() {
        return testUuid;
    }

    public void setTestUuid(String testUuid) {
        this.testUuid = testUuid;
    }

    @GetMapping("/query")
    @ResponseBody
    public List<Map<String, Object>> map() {
        List<Map<String, Object>> list = template.queryForList("select * from department");
        return list;
    }


    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return applicationProperties.getTest1() + "/" + applicationProperties.getTest2() + "/" + applicationProperties.getTest3();
//        return "Good Job";
    }


    @GetMapping("/index")
    public String index() {
        return "index";
    }
}

