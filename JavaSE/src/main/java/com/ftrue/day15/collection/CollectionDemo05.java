package com.ftrue.day15.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月16日 13时55分
 * @Version 1.0
 *
 * 泛型:未知的,未确定的数据类型(类似于小学应用题中的设变量x)(JDK5.0)
 *
 * 特点:
 *      声明类,接口,方法时,需要用到一个未确定的数据类型,理论上可以直接使用Object,
 *          因为多态有弊端,无法调用子类或者实现类的特有方法,如果想调用,需要进行向下转型,
 *          并且加上判断条件,来保证程序不会运行报错,这样的过程过于麻烦,可以在声明类,接口,方法的时候,设一个类型,
 *          这个类型可以在类中,接口中,方法中直接进行使用,如果想在外界进行使用的时候,必须手动进行该类型的确认,
 *          如果没有确认该类型,JVM会自动帮我们进行确认,这个数据类型就是Object
 *
 *          今后如果遇到含有泛型的类,接口,方法,必须进行泛型的确认
 *
 * 如果确认含有泛型的集合?
 *      格式:
 *          集合类型名<确认的数据类型> 集合名 = new 集合类型名<确认的数据类型>();
 *          注意:
 *              前后<>中的数据类型必须一致
 *
 *      JDK7.0版本针对上述创建集合的步骤进行简化:
 *          集合类型名<确认的数据类型> 集合名 = new 集合类型名<>();
 *
 *      好处:
 *          将运行时可能发生异常,提前到编译时期,也避免了在集合使用的过程中强转的隐患
 */
public class CollectionDemo05 {
	public static void main(String[] args) {
		//使用多态的形式创建集合对象
		Collection<String> coll = new ArrayList<>();

		//添加元素
		coll.add("张小芳");
		coll.add("安小妮");
		//coll.add(123);
		coll.add("张小弛");
		coll.add("崔小荣");
		coll.add("李小朦");


		//获取所有人中姓张童鞋
		/*for (Object obj : coll) {
			//为了使用String类中的startWith(),将对象进行向下转型
			if (obj instanceof String) {
				String s = (String)obj;
				if (s.startsWith("张")) {
					System.out.println(s);
				}
			}
		}*/
		for (String name : coll) {
			if (name.startsWith("张")) {
				System.out.println(name);
			}
		}
	}
}
