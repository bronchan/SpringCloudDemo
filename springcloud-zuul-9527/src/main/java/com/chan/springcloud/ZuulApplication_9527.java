package com.chan.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author bronchan
 * @version 1.0
 * @className ZuulApplication_9527
 * @date 2021/8/24 16:14
 * @description TODO
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication_9527.class,args);
    }
}
