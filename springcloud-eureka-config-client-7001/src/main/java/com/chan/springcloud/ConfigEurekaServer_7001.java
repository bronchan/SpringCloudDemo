package com.chan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author bronchan
 * @version 1.0
 * @className ConfigEurekaServer_7001
 * @date 2021/8/24 21:40
 * @description TODO
 */
//启动之后访问 http://localhost:7001/
@SpringBootApplication
@EnableEurekaServer //EnableEurekaServer表示服务端的启动类，可以接收别人注册进来
public class ConfigEurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaServer_7001.class, args);
    }
}
