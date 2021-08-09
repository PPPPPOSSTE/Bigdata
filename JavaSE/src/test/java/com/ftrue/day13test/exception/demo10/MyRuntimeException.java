package com.ftrue.day13test.exception.demo10;

/**
 * @ClassName: MyRuntimeException
 * @Description:
 * @Author: zhiqi zhang on 2021/7/13 14:21
 * @Version: 1.0
 */
public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException() {
    }

    public MyRuntimeException(String message) {
        super(message);
    }
}
