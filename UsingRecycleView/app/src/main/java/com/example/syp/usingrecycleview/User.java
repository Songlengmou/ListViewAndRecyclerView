package com.example.syp.usingrecycleview;

/**
 * Created by syp on 17-5-23.
 */

public class User {
    private String name;
    private int age;
    private String gendar;

    public User(String name, int age, String gendar) {
        this.name = name;
        this.age = age;
        this.gendar = gendar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }
}
