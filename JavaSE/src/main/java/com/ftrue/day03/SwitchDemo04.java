package com.ftrue.day03;

/**
 * @ClassName: SwitchTest02
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 9:26
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

	在开发中,完成一个需求如果选择switch或者if语句?
		1.在实际开发中更倾向使用if语句
		2.在内存中switch语句执行效率比if语句高一点点,这个一点点在今天内存过剩的年代可以忽略不计
*/
public class SwitchDemo04 {
    public static void main(String[] args) {
        //声明初始化月份变量
        int month = 6;


        //以季节角度完成需求
        switch (month) {

            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;

            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;

            default:
                System.out.println("月份有误");
                break;
        }

        //以月份角度完成需求
		/*
		switch (month) {
			case 1:
				System.out.println("冬季");
				break;
			case 2:
				System.out.println("冬季");
				break;
			case 3:
				System.out.println("春季");
				break;
			case 4:
				System.out.println("春季");
				break;
			case 5:
				System.out.println("春季");
				break;
			case 6:
				System.out.println("夏季");
				break;
			case 7:
				System.out.println("夏季");
				break;
			case 8:
				System.out.println("夏季");
				break;
			case 9:
				System.out.println("秋季");
				break;
			case 10:
				System.out.println("秋季");
				break;
			case 11:
				System.out.println("秋季");
				break;
			case 12:
				System.out.println("冬季");
				break;
			default:
				System.out.println("月份有误");
				break;
		}
		*/
    }
}
