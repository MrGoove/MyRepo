package com.myMvc.controller;


import org.springframework.stereotype.Controller;
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

    //默认首页
    @RequestMapping("/index")
    public String main(){
        return "index";
    }

    @RequestMapping(value = "/buy")
    public String buy(){
        return "buy";
    }


    @RequestMapping(value = "/registration")
    public String registration(){
        return "registration";
    }


    @RequestMapping(value = "/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping(value = "/getList")
    public String getList(){
        return "woman";
    }

    @RequestMapping(value = "/getDetail",method = RequestMethod.GET)
    public String getDetail(){
        return "detail";
    }
}
