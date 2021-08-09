package com.ftrue.day13test.exception.demo05;

import java.io.IOException;

/**
 * @ClassName: SuperClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/13 10:26
 * @Version: 1.0
 */
public class SuperClass {
    public void method() throws IOException {
        throw new IOException("自定义IO异常");
    }

    public void method2() {
    }
}
