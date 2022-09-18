package com.johnny;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author johnny
 * @Classname com.johnny.DistributedLock
 * @Description
 * @Date 2022/9/18 09:16
 */
@SpringBootApplication
@MapperScan("com.johnny.mapper")
public class DistributedLock {
    public static void main(String[] args) {
        SpringApplication.run(DistributedLock.class, args);
    }


}
