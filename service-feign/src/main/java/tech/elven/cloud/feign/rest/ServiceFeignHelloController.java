/**
 * msxf.com Inc.
 * Copyright (c) 2017-2026 All Rights Reserved.
 */
package tech.elven.cloud.feign.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiusheng.wu
 * @Filename ServiceFeignHelloController.java
 * @description
 * @Version 1.0
 * @History <li>Author: qiusheng.wu</li>
 * <li>Date: 2017/9/19 19:57</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
@RequestMapping("/rest/hello")
public class ServiceFeignHelloController {
    /** 日志记录器 **/
    private static final Logger logger = LoggerFactory.getLogger(ServiceFeignHelloController.class);

    @Value("${server.port}")
    private String port;

    @Qualifier("elven-cloud-service-provider")
    @Autowired
    private HelloService helloService;

    /**
     * home
     * @return
     */
    @RequestMapping()
    public String home(){
        return "home: port:"+port;
    }

    @RequestMapping("hello")
    public String hello() {
        logger.info("feign调用微服务helloService");
        return helloService.hello();
    }

}