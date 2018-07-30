package com.gymn.controller;

import com.gymn.annotation.JCarryResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author hunan
 * @Date 2018/6/29
 * @Time 下午3:49
 */
@Controller
@RequestMapping(value = "/jcarry", produces = "application/json;charset=UTF-8")
public class MainController {
    @JCarryResponse
    @RequestMapping(value = "/greet")
    public String getHello(@RequestParam("name") String name) {
        return "你好，"+name +"！";
    }
}
