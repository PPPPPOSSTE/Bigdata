package com.ftrue.day03;

/**
 * @ClassName: SwitchDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 10:00
 * @Version: 1.0
 */
/*
	switch语句的基本格式:
		switch (数据值) {
			case 数据值1:
				语句体1;
				break;
			case 数据值2:
				语句体2;
				break;
			......
			case 数据值n:
				语句体n;
				break;
			default:
				语句体n+1;
				break;
		}

	执行流程:
		1.先确认switch()中的数据值是否多少
		2.选择switch语句中的数据值1和switch()中的数据值进行匹配,看是否匹配成功
		3.如果匹配成功,执行语句体1,执行break语句,switch语句结束;
		  如果匹配失败,选择switch语句中的数据值2和switch()中的数据值进行匹配,看是否匹配成功
		 ......
		4.当switch语句中的数据值都没有和switch()中的数据值匹配成功,执行default语句中的语句体n+1,执行break语句,switch语句结束

	需求:根据数据值匹配对应的星期
*/
public class SwitchDemo01 {
    public static void main(String[] args) {
        //声明初始化数据值
        int weekday = 9;

        switch (weekday) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("哥们你是火星来的吧,地球上没有这个星期");
                break;
        }
    }
}
