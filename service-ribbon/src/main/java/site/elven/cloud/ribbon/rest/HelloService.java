/**
 * elven.site Inc.
 * Copyright (c) 2017-2026 All Rights Reserved.
 */
package site.elven.cloud.ribbon.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author qiusheng.wu
 * @Filename HelloService.java
 * @description
 * @Version 1.0
 * @History <li>Author: qiusheng.wu</li>
 * <li>Date: 2017/9/19 17:45</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String hello() {
        return restTemplate.getForObject("http://elven-cloud-service-provider/rest/hello/hello",String.class);
    }

    public String helloError(){
        return "sorry, hystrix, it's error";
    }
}