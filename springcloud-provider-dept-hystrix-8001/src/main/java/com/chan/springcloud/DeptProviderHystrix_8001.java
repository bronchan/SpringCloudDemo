package com.chan.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author bronchan
 * @version 1.0
 * @className DeptProviderHystrix_8001
 * @date 2021/8/21 21:08
 * @description TODO
 */
@SpringBootApplication
@EnableEurekaClient    //在服务启动后自动注册到eureka注册中心
//@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker    //开启熔断
public class DeptProviderHystrix_8001 {
    public static void main(String[] args) {
       SpringApplication.run(DeptProviderHystrix_8001.class,args);
    }

    //为了配合监控使用
    //增加一个Servlet
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }
}
