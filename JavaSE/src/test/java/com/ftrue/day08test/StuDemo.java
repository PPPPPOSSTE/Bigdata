package com.ftrue.day08test;

/**
 * @ClassName: StuDedmo
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 21:51
 * @Version: 1.0
 */
public class StuDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 23);
        Student s3 = new Student("王五", 23);
        Student s4 = new Student("赵六", 23);

        s1.show();
        s2.show();
        s3.show();
        s4.show();
    }
}
