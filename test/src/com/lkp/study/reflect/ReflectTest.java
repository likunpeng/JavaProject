package com.lkp.study.reflect;

import com.lkp.study.person.Person;
import com.lkp.study.person.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

//        Person p = new Person();
//        p.eat();
//
//        Student s = new Student();
//        s.sleep();

// 可以创建任意类的对象 可以执行任意方法
        // 1.加载配置文件
        Properties pro = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class cls = Class.forName(className);
        Object obj = cls.newInstance();

        Method method = cls.getMethod(methodName);
        method.invoke(obj);

    }
}
