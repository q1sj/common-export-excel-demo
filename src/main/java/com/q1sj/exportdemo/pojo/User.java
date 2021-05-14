package com.q1sj.exportdemo.pojo;

import com.alibaba.excel.annotation.ExcelProperty;

public class User{
    @ExcelProperty("用户名")
    private String username;
    @ExcelProperty("年龄")
    private int age;

    public User() {
    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
