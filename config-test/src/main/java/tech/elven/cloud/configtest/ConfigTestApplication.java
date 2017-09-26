/**
 * msxf.com Inc.
 * Copyright (c) 2017-2026 All Rights Reserved.
 */
package tech.elven.cloud.configtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qiusheng.wu
 * @Filename ConfigTestApplication.java
 * @description
 * @Version 1.0
 * @History <li>Author: qiusheng.wu</li>
 * <li>Date: 2017/9/26 10:07</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigTestApplication.class, args);
    }
}