package com.dh.mail.dhmailportal.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

/**
 * @description: 自定义的负载均衡策略
 * @author: Jh Lee
 * @create: 2023-02-24 13:56
 **/
public class DhMailHashRule extends AbstractLoadBalancerRule {
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    public Server choose(ILoadBalancer lb, Object key) {

        Server server = null;
        return server;
    }

    @Override
    public Server choose(Object o) {
        return null;
    }
}
