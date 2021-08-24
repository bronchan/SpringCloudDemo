package com.chan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author bronchan
 * @version 1.0
 * @className Config_Server_9966
 * @date 2021/8/24 21:25
 * @description TODO
 */
@SpringBootApplication
@EnableConfigServer
public class Config_Server_9966 {
    public static void main(String[] args) {
        SpringApplication.run(Config_Server_9966.class,args);
    }
}
