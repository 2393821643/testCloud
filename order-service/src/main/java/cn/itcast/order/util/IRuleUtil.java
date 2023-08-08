package cn.itcast.order.util;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
//public class IRuleUtil {
//
//    @Bean
//    public IRule randomRule(){
//        return new NacosRule();
//    }
//}
