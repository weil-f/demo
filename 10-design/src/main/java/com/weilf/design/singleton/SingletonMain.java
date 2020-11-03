package com.weilf.design.singleton;

public class SingletonMain {
    public static void main(String[] args) {

    }

    public static void xxStudentTest(){
        XXStudent instant = XXStudent.getInstant();
        XXStudent instant1 = XXStudent.getInstant();
        System.out.println(instant.toString());
        System.out.println(instant1.toString());
    }
}
