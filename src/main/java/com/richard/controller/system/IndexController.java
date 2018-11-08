package com.richard.controller.system;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
    /**
     * 登录成功后去后台首页
     * @return
     */
    @RequestMapping
    public String goIntoIndex(){
        return  "/system/index";
    }
}
