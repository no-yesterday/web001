package com.bean;

import java.util.Date;

public class Student {
    private int id;
    private int age;
    private String name;
    // 增加一个出生日期
    private Date birthday;
    // 是否是神
    private boolean isShen;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", isShen=" + isShen +
                '}';
    }

    public boolean isShen() {
        return isShen;
    }

    public void setShen(boolean shen) {
        isShen = shen;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
