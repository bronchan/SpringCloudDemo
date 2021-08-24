package com.chan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author bronchan
 * @version 1.0
 * @className EurekaServer_7003
 * @date 2021/8/22 16:04
 * @description TODO
 */
//   访问url http://eureka7003.com:7003/eureka/
@SpringBootApplication
@EnableEurekaServer   //EnableEurekaServer表示服务端的启动类，可以接收别人注册进来
public class EurekaServer_7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7003.class,args);
    }
}
