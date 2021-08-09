package com.ftrue.day13test.exception.demo07;

import java.io.IOException;

/**
 * @ClassName: SuperClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/13 11:54
 * @Version: 1.0
 */
public class SuperClass {
    public void method() {
        try {
            throw new IOException("自定义IO异常");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
