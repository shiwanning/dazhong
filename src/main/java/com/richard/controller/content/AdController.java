package com.richard.controller.content;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ad")
public class AdController {

    @RequestMapping
    public String init(){
        return "/content/adList";
    }
    @RequestMapping("/addInit")
    public String addList(){
        return  "/content/adAdd";
    }

}
