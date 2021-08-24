package com.chan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author bronchan
 * @version 1.0
 * @className DeptProvider_8001
 * @date 2021/8/21 21:08
 * @description TODO
 */
@SpringBootApplication
@EnableEurekaClient    //在服务启动后自动注册到eureka注册中心
//@EnableDiscoveryClient //服务发现
public class DeptProvider_8001 {
    public static void main(String[] args) {
       SpringApplication.run(DeptProvider_8001.class,args);
    }
}
