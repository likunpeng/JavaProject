package com.lkp.study.annotation;

public @interface MyAnno {
    int age();
    String name();
    String hobby() default "basketball";
//    String show2();
    TestEnum te();
    MyAnno2 anno2();
    String[] str2();
}
