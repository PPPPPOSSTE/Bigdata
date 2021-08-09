package com.ftrue.day07.demo03;

/**
 * @ClassName OOPDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月05日 11时11分
 * @Version 1.0
 *
 * 封装的好处:
 *      给数据带来一定的安全性
 *
 * 封装的体现:
 *      四种权限访问级别
 *
 *      四种权限访问级别从大到小的顺序:
 *          public > protected > 缺省(什么都不写) > private
 *
 *      封装就是给Java程序中的类名,接口名,变量,方法等添加不同的权限,从而让这些数据变得安全起来
 *
 *
 * private关键字:
 *      private关键字是封装思想的体现形式之一
 *
 *      含义:
 *          被private修饰的内容,只能在本类中有效,在外界无法访问
 *
 *      格式:
 *          private 数据类型 变量名;
 *
 * private关键字的步骤:
 *      1.在标准中需要将全部的成员变量进行私有化(全部被private进行修饰)
 *      2.每有一个成员变量被private进行修饰,就要对外提供一对的功能方法(get和set)
 *
 * 举例:你去银行去存钱取钱:
 *     你去银行存钱
 *          是否带钱回(返回值类型)
 *              不用
 *          是否带钱去(形参列表)
 *              用
 *     你去银行取钱:
 *          是否带钱回(返回值类型)
 *              用
 *          是否带钱去(形参列表)
 *              不用
 *
 *
 */
public class OOPDemo03 {
	public static void main(String[] args) {
		//创建学生对象
		Student s = new Student();

		//给学生属性进行赋值
		s.setName("张小芳");
		s.setAge(18);

		System.out.println(s.getName() + "=" + s.getAge());
	}
}
