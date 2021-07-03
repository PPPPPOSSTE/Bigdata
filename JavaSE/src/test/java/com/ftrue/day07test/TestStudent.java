package com.ftrue.day07test;

/**
 * @ClassName: TestStudent
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 20:24
 * @Version: 1.0
 */
public class TestStudent {
    public static void main(String[] args) {
        //无参构造使用
        Student s = new Student();
        s.setName("zzq");
        s.setAge(18);
        System.out.println(s.getName() + "---" + s.getAge());

        //带参构造使用
        Student s2 = new Student("lisi", 18);
        System.out.println(s2.getName() + "---" + s2.getAge());
    }
}
