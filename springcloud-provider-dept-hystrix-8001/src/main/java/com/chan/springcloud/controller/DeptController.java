package com.chan.springcloud.controller;

import com.chan.pojo.DpDept;
import com.chan.springcloud.service.DeptServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author bronchan
 * @version 1.0
 * @className DeptController
 * @date 2021/8/21 21:04
 * @description TODO
 */
//提供Restfull服务!!
@RestController
public class DeptController {

    @Autowired
    private DeptServiceImpl deptService;


    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGetDept") //失败了就会调用下面的这个备选方案
    public DpDept getDept(@PathVariable("id") Long id) {
        DpDept dept = deptService.queryById(id);
        if (dept == null) {
            throw new RuntimeException("id-->" + id + "不存在该用户，或者信息无法找到");
        }
        return dept;
    }

    //备选方案
    public DpDept hystrixGetDept(@PathVariable("id") Long id) {
        return new DpDept()
                .setDept_no(id)
                .setDept_name("id=>" + id + "没有对应的信息，null---@hystrix")
                .setDept_source("not this database in MySQL");
    }

}

