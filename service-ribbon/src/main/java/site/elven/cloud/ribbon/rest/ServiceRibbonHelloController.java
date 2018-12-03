/**
 * elven.site Inc.
 * Copyright (c) 2017-2026 All Rights Reserved.
 */
package site.elven.cloud.ribbon.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiusheng.wu
 * @Filename ServiceRibbonHelloController.java
 * @description
 * @Version 1.0
 * @History <li>Author: qiusheng.wu</li>
 * <li>Date: 2017/9/19 17:43</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
@RequestMapping("/rest/hello")
public class ServiceRibbonHelloController {

    /** 日志记录器 **/
    private static final Logger logger = LoggerFactory.getLogger(ServiceRibbonHelloController.class);

    @Value("${server.port}")
    private String port;

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
        logger.info("ribbon调用微服务helloService");
        return helloService.hello();
    }
}