package com.ftrue.day13test.exception.demo10;

/**
 * @ClassName: MyException
 * @Description:
 * @Author: zhiqi zhang on 2021/7/13 14:25
 * @Version: 1.0
 */
public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
