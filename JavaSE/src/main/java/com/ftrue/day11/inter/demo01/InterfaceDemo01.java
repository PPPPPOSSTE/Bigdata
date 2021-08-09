package com.ftrue.day11.inter.demo01;

/**
 * @ClassName InterfaceDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 09时18分
 * @Version 1.0
 *
 * 接口:
 *      声明一组"标准"和"行为"的集合
 *
 * 接口的好处:
 *      提高程序的扩展性
 *      提高代码的复用性,从而提高开发效率
 *      接口是学习多态思想的前提条件之一
 *      接口是学习匿名内部类的前提条件之一
 *
 * 接口的格式:
 *      public interface 接口的名字 {
 *          自定义常量
 *          抽象方法
 *          默认方法(JDK8.0)
 *          静态方法(JDK8.0)
 *          私有方法(JDK9.0)
 *          内部接口(内部类之一,暂不了解)
 *      }
 *
 *      public class 实现类名 implements 接口名1,接口名2,......,接口名3 {
 *
 *      }
 *
 *      实现接口的类称之为"实现类"
 *      接口和类之间的关系:多实现的关系
 *      实现关系其实和继承关系相似,当继承关系理解,如果涉及不相同的部分,在具体知识点中着重说明
 *
 *
 * 接口的成员:自定义常量和抽象方法
 *      []:里面的关键字可以省略不写的
 *      自定义常量
 *          [public] [static] [final] 数据类型 常量名 = 初始化值;
 *          调用方式:
 *              接口名.常量名;
 *
 *      抽象方法:
 *          [public] [abstract] 返回值类型 方法名();
 *
 *
 * 接口的使用步骤:
 *      1.创建接口的实现类
 *      2.重写接口中的抽象方法
 *      3.在测试类中创建接口实现类对象完成需求
 *
 */
public class InterfaceDemo01 {
	public static void main(String[] args) {
		//获取接口中的常量
		System.out.println(MyInterface.num);

		//创建接口的实现类对象
		MyInterfaceImpl my = new MyInterfaceImpl();
		my.print("HelloWorld");
	}
}
