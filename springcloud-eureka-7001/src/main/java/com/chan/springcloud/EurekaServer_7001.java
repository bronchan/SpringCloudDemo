package com.chan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author bronchan
 * @version 1.0
 * @className EurekaServer_7001
 * @date 2021/8/22 13:22
 * @description TODO
 */
//   访问url http://eureka7001.com:7001/eureka/
@SpringBootApplication
@EnableEurekaServer   //EnableEurekaServer表示服务端的启动类，可以接收别人注册进来
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
