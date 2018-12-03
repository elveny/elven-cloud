/**
 * elven.site Inc.
 * Copyright (c) 2017-2026 All Rights Reserved.
 */
package site.elven.cloud.service.provider.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiusheng.wu
 * @Filename ServiceAHelloController.java
 * @description
 * @Version 1.0
 * @History <li>Author: qiusheng.wu</li>
 * <li>Date: 2017/9/19 13:45</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
@RequestMapping("/rest/hello")
public class ServiceProviderHelloController {
    /** 日志记录器 **/
    private static final Logger logger = LoggerFactory.getLogger(ServiceProviderHelloController.class);

    @Value("${server.port}")
    private String port;

    @Value("${application.message}")
    private String message;

    /**
     * home
     * @return
     */
    @RequestMapping()
    public String home(){
        return "provider home: message => " + message;
    }

    @RequestMapping("hello")
    public String hello() {
        logger.info("start hello..., i am {}", port);
        return "hello world!!! I'm "+port;
    }
}