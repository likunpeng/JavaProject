package com.lkp.study.annotation.Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * 当主方法执行后 会自动执行被检测的所有方法（加了Chcek注解的方法）
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        // 1.创建计算器对象
        Calculator cal = new Calculator();
        // 2.获取字节码文件对象
        Class cls = cal.getClass();
        // 3.获取所有方法
        Method[] methods = cls.getMethods();
        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            // 4.判断方法上是否有Check注解
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    // 5.有 执行
                    method.invoke(cal);
                } catch (Exception e) {
                    number ++;
                    bw.write(method.getName() + "方法出现异常");
                    bw.newLine();
                    bw.write("异常的名字" + e.getClass().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因：" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-----------------------------------------");
                    bw.newLine();
                }
            }
        }

        bw.write("本次测试一共出现" + number + "次异常");
        bw.flush();
        bw.close();

    }

}
