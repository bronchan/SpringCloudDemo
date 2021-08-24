package com.chan.springcloud.controller;

import com.chan.pojo.DpDept;
import com.chan.springcloud.service.DeptServiceImpl;
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
@RestController
public class DeptController {

    @Autowired
    private DeptServiceImpl deptService;

    //获取微服务信息
    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept(DpDept dept) {
        return deptService.addDept(dept);
    }


    @GetMapping("/dept/get/{id}")
    public DpDept getDept(@PathVariable("id") Long id) {
        DpDept dept = deptService.queryById(id);
        if (dept == null) {
            throw new RuntimeException("Fail");
        }
        return dept;
    }

    @GetMapping("/dept/list")
    public List<DpDept> queryAll() {
        return deptService.queryAll();
    }

    @GetMapping("/dept/discovery")
    public Object getDiscovery(){
//        获取服务清单
        List<String> services = client.getServices();
        System.out.println("services = " + services);

//        得到具体微服务信息
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost()+"\t"+
                    instance.getPort()+"\t"+
                    instance.getUri()+"\t"+
                    instance.getServiceId()
            );
        }

        return this.client;
    }

}
