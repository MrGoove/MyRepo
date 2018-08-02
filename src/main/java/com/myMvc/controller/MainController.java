package com.myMvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "hello";
    }

    //默认首页
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/{formName}")
    public String main(@PathVariable String formName){
        return formName;
    }
}
