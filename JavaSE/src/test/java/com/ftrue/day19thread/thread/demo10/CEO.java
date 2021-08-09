package com.ftrue.day19thread.thread.demo10;

/**
 * @ClassName: CEO
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 16:08
 * @Version: 1.0
 */
public class CEO {
    private static CEO ceo;

    private CEO() {
    }

    public static CEO getCEO() {
        if (ceo == null) {
            ceo = new CEO();
        }
        return ceo;
    }
}
