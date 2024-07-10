package com.restart.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {
    @RequestMapping("/test")
    String test(){
        System.out.println("Testing page");
        return "Just testing..!";
    }
}
