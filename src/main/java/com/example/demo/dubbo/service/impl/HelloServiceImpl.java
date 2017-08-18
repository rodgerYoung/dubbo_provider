package com.example.demo.dubbo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.demo.dubbo.service.HelloService;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class HelloServiceImpl  implements HelloService{
    @Autowired
    IUserService userService;
    @Override
    public List<String> sayHelloThree(String str) {
        List<String> strings=new ArrayList<>();
        for (int i=0;i<3;i++){
            strings.add(str+i+userService.selectList(new EntityWrapper<>()).toString());
        }
        return strings;
    }
}
