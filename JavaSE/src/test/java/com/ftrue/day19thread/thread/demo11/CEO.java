package com.ftrue.day19thread.thread.demo11;

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
            //线程1 线程2 线程3
            synchronized (CEO.class) {
                if (ceo == null) {
                    ceo = new CEO();
                }
            }
        }
        return ceo;
    }
}
