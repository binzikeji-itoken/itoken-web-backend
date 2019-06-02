package com.binzikeji.itoken.web.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author Bin
 * @Date 2019/6/1 13:57
 **/
@SpringBootApplication(scanBasePackages = "com.binzikeji.itoken")
@EnableDiscoveryClient
@EnableFeignClients
public class WebBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebBackendApplication.class, args);
    }
}
