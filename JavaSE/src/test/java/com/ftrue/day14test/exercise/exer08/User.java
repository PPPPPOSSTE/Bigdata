package com.ftrue.day14test.exercise.exer08;

/**
 * @ClassName: User
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 10:27
 * @Version: 1.0
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return userName + "-" + password;
    }
}
