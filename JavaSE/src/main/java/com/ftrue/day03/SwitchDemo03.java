package com.ftrue.day03;

import javax.sound.sampled.SourceDataLine;

/**
 * @ClassName: SwitchTest01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 9:25
 * @Version: 1.0
 */
/*
  需求：定义一个月份，输出该月份对应的季节。
  		一年有四季
  		3,4,5	春季
  		6,7,8	夏季
  		9,10,11	秋季
  		12,1,2	冬季

  分析：
  		A:指定一个月份
  		B:判断该月份是几月,根据月份输出对应的季节
  			if
  			switch
*/
public class SwitchDemo03 {
    public static void main(String[] args) {
        //声明初始化月份变量
        int month = 6;

        //以月份角度完成需求
		/*
		if (month == 1) {
			System.out.println("冬季");
		} else if (month == 2) {
			System.out.println("冬季");
		} else if (month == 3) {
			System.out.println("春季");
		} else if (month == 4) {
			System.out.println("春季");
		} else if (month == 5) {
			System.out.println("春季");
		} else if (month == 6) {
			System.out.println("夏季");
		} else if (month == 7) {
			System.out.println("夏季");
		} else if (month == 8) {
			System.out.println("夏季");
		} else if (month == 9) {
			System.out.println("秋季");
		} else if (month == 10) {
			System.out.println("秋季");
		} else if (month == 11) {
			System.out.println("秋季");
		} else if (month == 12) {
			System.out.println("冬季");
		} else {
			System.out.println("月份有误");
		}
		*/

        //以季节角度完成需求
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("春季");
        } else if (month >= 6 & month <= 8 ) {
            System.out.println("夏季");
        } else if (month >= 9 & month <= 11 ) {
            System.out.println("秋季");
        } else if (month == 1 || month == 2 || month == 12 ) {
            System.out.println("冬季");
        } else {
            System.out.println("月份有误");
        }
    }
}
