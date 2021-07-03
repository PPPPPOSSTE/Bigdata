package com.ftrue.suggestion151;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: sugg26
 * @Description:
 * @Author: zhangzhiqi on 2021/7/2 8:48
 * @Version: 1.0
 */
//建议26：提防包装类型的null值
//当对象是null值时，在调用方法时会报java.lang.NullPointerException异常
//解决办法：
//  包装类型参与运算时，要做null值校验
public class sugg26 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(null);
        System.out.println(f(list));
    }

    public static int f(List<Integer> list) {
        int count = 0;
        for (Integer i : list) {
            //count += i;  //运行时会报空指针错误
            count += (i != null) ? i : 0;  //进行null值校验
        }
        return count;
    }
}
