package com.binzikeji.itoken.web.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description
 * @Author Bin
 * @Date 2019/6/1 14:00
 **/
@Controller
public class MainController {

    @RequestMapping(value = {"", "main"}, method = RequestMethod.GET)
    public String main(){
        return "main";
    }

    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String welcome(){
        return "welcome";
    }
}
