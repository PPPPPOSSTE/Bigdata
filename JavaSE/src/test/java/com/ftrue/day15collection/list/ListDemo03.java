package com.ftrue.day15collection.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName: ListDemo03
 * @Description:
 * @Author: zhiqi zhang on 2021/7/17 8:58
 * @Version: 1.0
 */
/**
 * 需求:现在钱包里面有360元(3张100元,1张50元,1张10元),需要花费300元买个键盘,求钱包里面剩余钱数
 *
 * 解决方案:
 *      1.如果删除成功,需要将索引往前移动一位
 *      2.倒序遍历删除
 *      3.迭代器中的删除方法
 *
 *
 */
public class ListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("100元");
        list.add("100元");
        list.add("100元");
        list.add("100元");
        list.add(null);
        list.add("50元");
        list.add("10元");

        //检查钱包里面的钱数
        //System.out.println(list);

        //
        for (int i = 0; i < list.size(); i++) {
            //if (list.get(i).equals("100元")) { //注意事项：今后equals(), 用常量进行调用或者值确定的变量
            /*if ("100元".equals(list.get(i))) {
                list.remove(i);
                //[100元, 100元, null, 50元, 10元]
            }*/
            /*if ("100元".equals(list.get(i))) {
                list.remove("100元");
                //[100元, 100元, null, 50元, 10元]
            }*/
            /*if ("100元".equals(list.get(i))) {
                list.remove(i);
                i--;
            }
            //[null, 50元, 10元]*/
        }


        /*for (int i = list.size() - 1; i >= 0; i--) {
            if ("100元".equals(list.get(i))) {
                list.remove(i);
                //[null, 50元, 10元]
            }
        }*/


        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if ("100元".equals(str)) {
                //ConcurrentModificationException
                list.remove(str);
                //注意：通过list对象删除不可以，但是通过迭代器对象却可以
                //it.remove();
                //[null, 50元, 10元]
            }
        }
        System.out.println(list);
        System.out.println("================================");

        Iterator<String> it1 = list.iterator();
        it1.forEachRemaining(System.out::println);

    }
}
