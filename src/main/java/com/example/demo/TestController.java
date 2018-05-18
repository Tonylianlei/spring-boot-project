package com.example.demo;

import org.springframework.web.bind.annotation.*;

/**
 * 创建人:连磊
 * 日期: 2018/5/16. 9:24
 * 描述：
 */
@RestController
public class TestController {

    @RequestMapping(value = "/getName" , method = RequestMethod.GET)
    public String getName(){
        return "张三";
    }

}
