package com.lkp.study;

import com.lkp.study.person.Person;

public class Study {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "lkp";
        p.age = 12;
        System.out.printf("p = " +  p.toString());

    }
}
