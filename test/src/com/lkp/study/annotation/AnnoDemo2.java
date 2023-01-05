package com.lkp.study.annotation;

@SuppressWarnings("all")  //压制警告
public class AnnoDemo2 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void  show1() {
        System.out.printf("过时了");
    }

    public void show2() {
        System.out.printf("代替show1");
    }


}
