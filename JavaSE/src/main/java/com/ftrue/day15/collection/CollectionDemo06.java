package com.ftrue.day15.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月16日 14时28分
 * @Version 1.0
 *
 * 了解源码中泛型的格式
 *      泛型的基础应用
 *          类中含有泛型
 *          接口中含有泛型
 *          方法中含有泛型
 *      泛型的高级应用
 *          泛型的通配符
 *          泛型的上限和下限
 *
 * 泛型在类中,接口中,方法中如果进行使用的话,必须要进行泛型的声明
 *      泛型的声明格式:
 *          <未知数据类型>
 *
 * 含有泛型的类声明格式:
 *      public class 类名<未知数据类型> {}
 *
 *      确认泛型的时机:
 *          创建该类的对象的时候,需要给其指定数据类型,如果不指定,JVM默认为Object
 *
 * 含有泛型的接口声明格式:
 *      public interface 类名<未知数据类型> {}
 *
 *      确认泛型的时机:
 *          创建该接口的实现类对象的时候,需要给其指定数据类型,如果不指定,JVM默认为Object
 *
 * 含有泛型的方法声明格式:
 *      前提条件:方法中使用的泛型不是类或者接口声明的泛型,需要声明方法的同时声明泛型
 *
 *      修饰符 <未知数据类型> 返回值类型 方法名 () {}
 *
 *      确认泛型的时机:
 *          如果出现在形参列表中,给其传递的数据类型就是该类型的类型
 *          如果出现在返回值类型,用什么数据类型进行接口,泛型就是什么类型
 *
 * 泛型的通配符:
 *      针对含有泛型的方法的简化
 *      简化前:
 *          修饰符 <泛型类型> 返回值类型 方法名 (含有泛型的类名或者接口名<泛型类型> 对象名) {}
 *          举例:
 *              public <E> void method (Collection<E> coll) {}
 *
 *      简化后:
 *          修饰符 返回值类型 方法名 (含有泛型的类名或者接口名<?> 对象名) {}
 *          举例:
 *              public void method (Collection<?> coll) {}
 *
 *      确认泛型的时机:
 *          当调用方法时,集合中元素的数据类型是什么类型,该类型就是泛型的类型
 *
 * 泛型的受限: 上表示"父类或者父接口" 下表示"子类或者实现类"
 *      泛型的上限
 *          格式: <? extends 数据类型>
 *          特点:
 *              传递的类型是该类型本身或者该类型的子类类型
 *      泛型的下限
 *          格式: <? super 数据类型>
 *          特点:
 *              传递的类型是该类型本身或者该类型的父类类型
 *
 *     泛型受限的记忆小技巧:
 *          1.无论是上限还是下限该类型本身都可以
 *          2.记忆<? extends 数据类型>,这个格式和子类继承父类的格式相似,?处就是子类类型
 *              public class  子类类型  extends 父类类型 {}
 *
 */
public class CollectionDemo06 {
	public static void main(String[] args) {
		MyList<Integer> list = new MyList<>();

		//创建5种Collection集合对象
		Collection<String> a = new ArrayList<>();
		Collection<Object> b = new ArrayList<>();
		Collection<ClassA> c = new ArrayList<>();
		Collection<ClassB> d = new ArrayList<>();
		Collection<ClassC> e = new ArrayList<>();

		list.method(a);
		list.method(b);
		list.method(c);
		list.method(d);
		list.method(e);

		System.out.println("====================================");

		//list.show(e);


		list.change(c);
	}
}
