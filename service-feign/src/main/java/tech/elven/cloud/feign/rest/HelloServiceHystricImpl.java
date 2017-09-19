/**
 * elven.tech Inc.
 * Copyright (c) 2017-2026 All Rights Reserved.
 */
package tech.elven.cloud.feign.rest;

import org.springframework.stereotype.Component;

/**
 * @Filename HelloServiceHystricImpl.java
 *
 * @description
 *
 * @Version 1.0
 *
 * @author elven
 * @History
 *
 * <li>Author: elven</li>
 * <li>Date: 17-9-19 下午11:58</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Component
public class HelloServiceHystricImpl implements HelloService {
    @Override
    public String hello() {
        return "sorry, feign hystric, it's error!";
    }
}