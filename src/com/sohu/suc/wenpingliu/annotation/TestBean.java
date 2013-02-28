package com.sohu.suc.wenpingliu.annotation;

/**
 * Created with IntelliJ IDEA.
 * User: wenpingliu
 * Date: 3/1/13
 * Time: 12:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestBean {


    public String name;

    public int age;

    @isTranslate("annotation")
    public String school;

    @isTranslate("hello")
    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
