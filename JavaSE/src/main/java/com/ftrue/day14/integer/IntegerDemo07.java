package com.ftrue.day14.integer;

/**
 * @ClassName IntegerDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 16时34分
 * @Version 1.0
 *
 * 常量池的分类:
 *      字符串常量池:字符串字面值
 *      整数常量池:-128 ~ 127
 *      字符常量池:0 ~ 127
 *      布尔常量池:true,false
 *
 * 包装类笔试题3:
 *      分析内存存储过程
 */
public class IntegerDemo07 {
	public static void main(String[] args) {
		Double num01 = 0.0;
		Double num02 = 0.0;
		System.out.println(num01 == num02);//在常量池中不存在浮点常量池
		System.out.println("========================");

		Character num03 = 'a';
		Character num04 = 'a';
		System.out.println(num03 == num04);
		System.out.println("========================");

		Boolean num05 = true;
		Boolean num06 = true;
		System.out.println(num05 == num06);
		System.out.println("========================");

		System.out.println(true ? new Integer(200) : new Double(3.14));
		//System.out.println(true ? new Integer(200) : new Integer(300));
		//问题1:结果是什么?    200.0
		//问题2:调用的是哪个println()? double参数
		//问题3:内存计算过程
		/*
			1.装箱
				将int类型200装箱为Integer,将double类型3.14装箱为Double
			2.拆箱
				因为:两边都是包装类型,且数据类型不一致,一切从简,都自动拆箱为基本数据类型
				备注:如果不是包装类型,向上转型为Object 举例: System.out.println(true? true : "abc")
			3.统一数据类型
				因为double的取值范围比int类型大,最后的数据变为200.0 和 3.14
			4.执行三元运算符
				因为关系表达式的结果是true,执行结果1,在控制台上打印200.0
		*/


	}
}
