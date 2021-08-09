package com.ftrue.day09test.project;

/**
 * @ClassName: Customer
 * @Description:
 * @Author: zhangzhiqi on 2021/7/7 9:37
 * @Version: 1.0
 */
public class Customer {
    private int id;
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    private static int num = 1;
    {
        this.id = num++;
    }


    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Customer.num = num;
    }
}
