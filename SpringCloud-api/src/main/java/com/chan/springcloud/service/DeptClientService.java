package com.chan.springcloud.service;

import com.chan.pojo.DpDept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author bronchan
 * @version 1.0
 * @className DeptClientService
 * @date 2021/8/23 14:42
 * @description 使用feign实现负载均衡
 */
@Component
//Feign客户端的服务名
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)  //后面参数是服务降级，配合feign一起使用
public interface DeptClientService {

    @GetMapping("/dept/get/{id}")
    DpDept queryById(@PathVariable("id") Long id);

    @PostMapping("/dept/add")
    boolean addDept(DpDept dept);

    @RequestMapping("/dept/list")
    List<DpDept> queryAll();

}
