package com.alibaba.edas.boot;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务调用
 *
 * @author ywb
 * @date 2020/2/14 12:17
 */
@RestController
public class DemoConsumerController {

    @Reference
    private IHelloService demoService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return demoService.sayHello(name);
    }
}
