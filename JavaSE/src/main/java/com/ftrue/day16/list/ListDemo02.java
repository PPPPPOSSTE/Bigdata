package com.ftrue.day16.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月17日 08时58分
 * @Version 1.0
 *
 * 需求:现在钱包里面有360元(3张100元,1张50元,1张10元),需要花费300元买个键盘,求钱包里面剩余钱数
 *
 * 解决方案:
 *      1.如果删除成功,需要将索引往前移动一位
 *      2.倒序遍历删除
 *      3.迭代器中的删除方法
 *
 */
public class ListDemo02 {
	public static void main(String[] args) {
		//使用多态的形式创建存储人民币的集合对象
		List<String> list = new ArrayList<>();

		//添加元素
		list.add("100元");
		list.add("100元");
		list.add("100元");
		//list.add(null);
		list.add("50元");
		list.add("10元");

		//检查钱包里面的钱数
		System.out.println(list);

		//看中一款键盘,花费300元,已经钱包就有300元,将钱包中所有的100元进行删除
		for (int i = 0; i < list.size(); i++) {
			if ("100元".equals(list.get(i))) { //注意事项:今后equals(),用常量进行调用或者值确定的变量
				list.remove(i);
				i--;
			}
		}

		/*for (int i = list.size() - 1; i >= 0; i--) {
			if ("100元".equals(list.get(i))) { //注意事项:今后equals(),用常量进行调用或者值确定的变量
				list.remove(i);
			}
		}*/

		/*Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String str = it.next();

			if ("100元".equals(str)) { //注意事项:今后equals(),用常量进行调用或者值确定的变量
				it.remove();
			}
		}*/

		//检查钱包里面的钱数
		System.out.println(list);
	}
}
