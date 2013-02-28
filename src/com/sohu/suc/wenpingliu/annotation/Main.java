package com.sohu.suc.wenpingliu.annotation;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        TestBean test = new TestBean();
        test.setAge(18);
        test.setName("sarowlwp");
        test.setSchool("QingHai");

        String testInfo = new Translater().translate(test);
        System.out.println(testInfo);


    }
}
