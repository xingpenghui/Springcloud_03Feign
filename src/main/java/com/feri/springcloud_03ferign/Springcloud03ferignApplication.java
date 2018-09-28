package com.feri.springcloud_03ferign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient//标记客户端
@EnableDiscoveryClient//发现服务
@EnableFeignClients//消费者模板
public class Springcloud03ferignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud03ferignApplication.class, args);
    }
}
