package com.ftrue.day01;

/**
 * @ClassName: BasicDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/26 19:30
 * @Version: 1.0
 */
/*
	注释:在程序中用于解释说明的文字

	分类:
		单行注释
			//注释内容
		多行注释
			/*注释内容* /
			注意事项:
				以/*作为开头,以遇到的第一个* /作为结尾
		文档注释(了解)
			/**
				注释内容
			* /
*/

/*
	这是我们学习的第一个程序HelloWorld案例
	public class 类名 {

	}

*/
public class BasicDemo01 {
    /*
		这是main方法,也叫做主方法
		主方法是程序的执行入口,如果运行程序,JVM自动识别主方法
		主方法里面可以没有内容,只不过没有实际意义
	*/
    public static void main (String[] args) {
        //输出语句,负责用来输出内容,语句必须定义在方法中,否则编译报错
        System.out.println("HelloWorld");
    }
}
