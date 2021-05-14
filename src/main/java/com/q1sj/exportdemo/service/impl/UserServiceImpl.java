package com.q1sj.exportdemo.service.impl;

import com.q1sj.exportdemo.pojo.User;
import com.q1sj.exportdemo.service.UserService;
import com.q1sj.export.Export;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
class UserServiceImpl implements UserService, Export {

    @Override
    public String getCode() {
        return "user";
    }

    @Override
    public Class<?> getExportEntityClass() {
        return User.class;
    }

    @Override
    public List<?> getList(String conditions) {
        // 此处模拟 根据条件查询 返回结果集
        return Arrays.asList(new User("qsj", 18), new User("admin", 19));
    }
}
