package com.ytzf.demo.test.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
@MapperScan("com.ytzf.demo.test.user.mapper")//使用MapperScan批量扫描所有的Mapper接口；
@ServletComponentScan(basePackages = {"com.ytzf.demo.test.filter"})
@EnableScheduling
@SpringBootApplication

public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
