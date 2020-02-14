package com.alibaba.edas.boot;


import org.apache.dubbo.config.annotation.Service;

/**
 * 服务提供者实现
 *
 * @author ywb
 * @date 2020/2/14 12:05
 */
@Service
public class IHelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Dubbo with Spring Boot)";
    }
}
