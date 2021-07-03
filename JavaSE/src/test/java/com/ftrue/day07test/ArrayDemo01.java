package com.ftrue.day07test;

/**
 * @ClassName: ArrayDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 20:32
 * @Version: 1.0
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //创建一个元素为int类的数组
        int[] arr01 = {11, 22, 33};

        //创建一个元素为String类型的数组
        String[] arr02 = {"abc", "def", "hig"};
        System.out.println(arr02);
        //创建一个元素为Student类型的数组
        Student s1 = new Student("迪丽热巴", 18);
        Student s2 = new Student("古力娜扎", 28);
        Student s3 = new Student("马尔扎哈", 38);
        Student[] arr03 = {s1, s2, s3};
        for (int i = 0; i < arr03.length; i++) {
            Student s = arr03[i];
            System.out.println(s.toString());
            System.out.println(s);
        }

        //[Ljava.lang.String;@1b6d3586
        //com.ftrue.day07test.Student@4554617c
        //com.ftrue.day07test.Student@4554617c
        //com.ftrue.day07test.Student@74a14482
        //com.ftrue.day07test.Student@74a14482
        //com.ftrue.day07test.Student@1540e19d
        //com.ftrue.day07test.Student@1540e19d
    }
}
