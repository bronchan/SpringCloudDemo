package com.chan.springcloud.controller;

import com.chan.pojo.DpDept;
import com.chan.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author bronchan
 * @version 1.0
 * @className DeptConsumerController
 * @date 2021/8/23 14:44
 * @description TODO
 */
@Controller
public class DeptConsumerController {

    //这里直接把springcloud-api的DeptClientService接口注入进来
    @Autowired
    private DeptClientService deptClientService = null;
    //然后通过接口来调用方法，调用方法后，它会调用上面类对应的方法，最后调用其服务名字的接口
    @RequestMapping("/consumer/dept/get/{id}")
    @ResponseBody
    public DpDept queryById(@PathVariable("id") Long id) {
        return this.deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/add")
    @ResponseBody
    public boolean add(DpDept dept) {
        return this.deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/list")
    @ResponseBody
    public List<DpDept> queryAll() {
        return this.deptClientService.queryAll();
    }

}
