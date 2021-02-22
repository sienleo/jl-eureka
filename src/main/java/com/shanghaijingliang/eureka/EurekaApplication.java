package com.shanghaijingliang.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaApplication.class).run(args);
    }

    @Override

    public void run(String... arg0) throws Exception {
        log.info("===================================================");
        log.info("---------------eureka注册中心启动成功---------------");
        log.info("===================================================");
    }
}
