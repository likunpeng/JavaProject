package com.lkp.study.annotation;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
@Pro(className = "com.lkp.study.annotation.TestPro", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 可以创建任意类的对象 可以执行任意方法
        // 1.解析注解
        // 1.1获取该类的注解码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        // 2.获取注解对象
        Pro annotation = reflectTestClass.getAnnotation(Pro.class);
        // 3.调用注解对象中定义的抽象方法 获取返回值
        String className = annotation.className();
        String methodName = annotation.methodName();
        System.out.println(className);
        System.out.println(methodName);
    }
}
