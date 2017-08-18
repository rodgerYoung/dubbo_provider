package com.example.demo.dubbo.service.impl;

import com.example.demo.dubbo.service.TestService;

public class TestServiceImpl implements TestService {
    @Override
    public String str() {
        return "Test";
    }
}
