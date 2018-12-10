package com.zzh.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzh.provider.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "zookeeper success!";
    }
}
