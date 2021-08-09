package com.ftrue.day16collection.personal.set;

import java.util.HashSet;

/**
 * @ClassName: HashSetDemo02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 20:10
 * @Version: 1.0
 */
public class HashSetDemo02 {
    public static void main(String[] args) {
        //创建集合对象 该集合中存储Student类型对象
        HashSet<Student> stuSet = new HashSet<>();
        //存储
        Student stu = new Student("于谦", 43);
        stuSet.add(stu);
        stuSet.add(new Student("郭麒麟", 23));
        stuSet.add(new Student("郭德纲", 44));
        stuSet.add(new Student("于谦", 43));
        stuSet.add(stu);

        for (Student student : stuSet) {
            System.out.println(student);
        }
    }
}
