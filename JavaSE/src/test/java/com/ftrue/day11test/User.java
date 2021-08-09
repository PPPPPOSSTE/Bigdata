package com.ftrue.day11test;

/**
 * @ClassName: User
 * @Description:
 * @Author: zhangzhiqi on 2021/7/5 19:19
 * @Version: 1.0
 */
public class User {
    final String USERNAME = "张三";
    private int age;
}

/*
public class User {
    final String USERNAME;
    private int age;

    public User(String userName, int age) {
        this.USERNAME = userName;
        this.age = age;
    }
}
*/

/*public class User {
    final String USERNAME;
    private int age;

    {
        USERNAME = "zhangsan";
    }
}*/


//错误的写法
/*
public class User {
    final String USERNAME;  //编译提示报错：Variable 'USERNAME' might not have been initialized
    private int age;
}
*/

