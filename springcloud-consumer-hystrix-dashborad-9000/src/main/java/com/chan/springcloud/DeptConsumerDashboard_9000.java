package com.chan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author bronchan
 * @version 1.0
 * @className DeptConsumerDashboard_9000
 * @date 2021/8/24 15:09
 * @description TODO
 */
@SpringBootApplication
//服务端必须都要有监控依赖actuator   //开启监控页面  http://localhost:9000/hystrix
@EnableHystrixDashboard
public class DeptConsumerDashboard_9000 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard_9000.class,args);
    }
}
