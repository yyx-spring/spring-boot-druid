package com.config;

import com.condition.TestBeanCondition;
import com.bean.TestBean1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@SpringBootApplication
@ComponentScan("com.**")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }

    @Bean
    @Conditional(TestBeanCondition.class)
    public TestBean1 testBean1() {
        return new TestBean1();
    }


    @Bean
    public InMemoryHttpTraceRepository traceRepository() {
        InMemoryHttpTraceRepository traceRepo = new InMemoryHttpTraceRepository();
        traceRepo.setCapacity(10);
        return traceRepo;
    }

    /*@Bean
    @Profile("development")
    public DataSource dataSource() {
        PoolProperties poolProperties = new PoolProperties();
        poolProperties.setMaxActive(105);
        return new DataSource(poolProperties);
    }*/
}
