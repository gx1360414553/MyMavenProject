package com.gx.test.dynamicproxy;

public class Xiaoming implements Hose{

    private Integer age;
    private String name;

    public void buy(){
        System.out.println("我要卖房子...");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
