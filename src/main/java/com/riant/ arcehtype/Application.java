package com.riant. arcehtype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

/**
 * Created by 张斌 on 2020/1/12.
 */
@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
