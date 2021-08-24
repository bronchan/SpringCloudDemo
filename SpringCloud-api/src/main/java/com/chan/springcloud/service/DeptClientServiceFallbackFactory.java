package com.chan.springcloud.service;

import com.chan.pojo.DpDept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author bronchan
 * @version 1.0
 * @className DeptClientServiceFallbackFactory
 * @date 2021/8/24 14:15
 * @description 服务降级
 */
//服务降级
@Component
//失败回调
public class DeptClientServiceFallbackFactory implements FallbackFactory {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public DpDept queryById(Long id) {
                return new DpDept()
                        .setDept_no(id)
                        .setDept_name("id=>" + id + "，没有对应的信息，客户端提供了降级的信息，这个服务现在已经被关闭了")
                        .setDept_source("没有数据");
            }

            @Override
            public boolean addDept(DpDept dept) {
                //...
                return false;
            }

            @Override
            public List<DpDept> queryAll() {
                //...
                return null;
            }

        };
    }
}
