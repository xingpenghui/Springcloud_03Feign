package com.feri.springcloud_03ferign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *@Author feri
 *@Date Created in 2018/9/28 11:08
 */
@FeignClient(value = "provider1803")//配置提供者的名称
public interface HelloService {
    @RequestMapping(value = "/hello.do",method = RequestMethod.GET)//
    String hi();
}
