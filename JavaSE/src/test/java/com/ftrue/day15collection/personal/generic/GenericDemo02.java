package com.ftrue.day15collection.personal.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName: GenericDemo02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 19:16
 * @Version: 1.0
 */
public class GenericDemo02 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        //list.add(5);  //当集合类型明确后，存放类型不一致就会编译报错
        //集合已经明确具体存放的元素类型，那么在使用迭代器的时候，迭代器也同样会知道具体遍历元素类型
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            //当使用Iterator<String>控制元素类型后，就不需要强转了。获取到的元素直接就是String类型
            System.out.println(str.length());
        }
    }

    //tips: 泛型是数据类型的一部分，我们将类名与泛型合并一起看作数据类型
}
