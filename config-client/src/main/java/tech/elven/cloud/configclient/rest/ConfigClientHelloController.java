/**
 * elven.tech Inc.
 * Copyright (c) 2017-2026 All Rights Reserved.
 */
package tech.elven.cloud.configclient.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Filename ConfigClientHelloController.java
 *
 * @description
 *
 * @Version 1.0
 *
 * @author elven
 * @History
 *
 * <li>Author: elven</li>
 * <li>Date: 17-9-21 上午1:15</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
@RequestMapping("/rest/hello")
@RefreshScope
public class ConfigClientHelloController {
    /** 日志记录器 **/
    private static final Logger logger = LoggerFactory.getLogger(ConfigClientHelloController.class);

    @Value("${application.message}")
    private String message;

    /**
     * home
     * @return
     */
    @RequestMapping()
    public String home(){
        return "home: message => " + message;
    }

}