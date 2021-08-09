package com.ftrue.day15.collection;

import java.util.Collection;

/**
 * @ClassName MyList
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月16日 14时30分
 * @Version 1.0
 */
public class MyList<A> {
	public void add (A a) {}


	/*public <E> E method (E e) {
		return null;
	}*/

	//public <E> void method (Collection<E> coll) {}

	public void method (Collection<?> coll) {}

	public void show (Collection<? extends ClassB> coll) {}

	public void change (Collection<? super ClassB> coll) {}
}
