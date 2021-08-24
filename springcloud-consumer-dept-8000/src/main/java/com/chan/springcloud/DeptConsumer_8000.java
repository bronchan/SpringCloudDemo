package com.chan.springcloud;

import com.chan.myrule.ChanRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author bronchan
 * @version 1.0
 * @className DeptConsumer_80
 * @date 2021/8/21 22:36
 * @description TODO
 */
@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就能去加载我们自定义的Ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = ChanRule.class)
public class DeptConsumer_8000 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_8000.class,args);
    }
}
