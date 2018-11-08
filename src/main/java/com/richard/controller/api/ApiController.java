package com.richard.controller.api;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.richard.bean.Ad;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value = "/homead",method = RequestMethod.GET)
    public List<Object> homeAd() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String temp = "[{\"title\": \"暑假5折\",\"img\": \"http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191639092-2000037796.png\",\"link\": \"http://www.imooc.com/wap/index\"}]";
        return  mapper.readValue(temp, new TypeReference<List<Object>>(){});
    }
}
