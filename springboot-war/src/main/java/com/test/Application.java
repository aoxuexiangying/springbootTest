package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by hujianjun on 8/4 0004.
 */
@SpringBootApplication
@Controller
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @RequestMapping("/index")
    public String index(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", "中国上海");
        return "index";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}

