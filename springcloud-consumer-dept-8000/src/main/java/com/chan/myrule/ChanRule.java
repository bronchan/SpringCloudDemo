package com.chan.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bronchan
 * @version 1.0
 * @className ChanRule
 * @date 2021/8/22 22:40
 * @description TODO
 */
@Configuration
public class ChanRule {

    @Bean
    public IRule myRule() {
        return new ChanRandomRule(); //默认为轮询，现在试使用自己自定义的
    }
}
