package com.chan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author bronchan
 * @version 1.0
 * @className FeignDeptConsumer_80
 * @date 2021/8/23 14:45
 * @description TODO
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.chan"})  //扫描的是springcloud-api的包，将feign service扫描进来
public class FeignDeptConsumer_8000 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_8000.class, args);
    }
}
