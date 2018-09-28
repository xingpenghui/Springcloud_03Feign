package com.feri.springcloud_03ferign.app;

import com.feri.springcloud_03ferign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author feri
 *@Date Created in 2018/9/28 11:11
 */
@RestController
public class HiApp {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hi.do")
    public String hi(){
        return helloService.hi();
    }
}
