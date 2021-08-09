package com.ftrue.day22exam.exercise06;

import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: Exercise06
 * @Description:
 * @Author: zhiqi zhang on 2021/7/26 19:30
 * @Version: 1.0
 */
public class Exercise06 {
    //1、编写代码完成如下功能
    //public static String replace(String text, String target, String replace){
    //....
    //}
    //示例：replace(“aabbccbb”, “bb”, “dd”);  结果：aaddccdd
    //注意：不能使用String及StringBuffer等类的replace等现成的替换API方法。
    @Test
    public void test01() {
        String str = "aabbccbb";

        String result = test010(str, "bb", "dd");

        System.out.println("result = " + result);
    }

    public static String test010(String text, String target, String replace) {
        return Pattern.compile(target, Pattern.LITERAL).matcher(text).replaceAll(Matcher.quoteReplacement(replace));
    }

    //2、1个字符串中可能包含a-z中的多个字符，字符也可能重复，例如：String data = “aabcexmkduyruieiopxzkkkkasdfjxjdsds”;写一个程序，对于给定一个这样的字符串求出字符串出现次数最多的那个字母以及出现的次数（若次数最多的字母有多个，则全部求出）
    @Test
    public void test02() {
        String data = "aabcexmkduyruieiopxzkkkkasdfjxjdsds";
        String data1 = "abcdefgcde";

        test020(data);
        System.out.println("=====================");
        test020(data1);
    }

    private void test020(String data) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Collection<Integer> values = map.values();
        Integer max = Collections.max(values);

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Integer value = entry.getValue();
            if (max.equals(value)) {
                Character key = entry.getKey();
                System.out.println("出现次数最多的字母是：" + key + ", 总计出现的次数是：" + max);
            }
        }
    }

    //3、假设日期段用两个6位长度的正整数表示，例如：(201401，201406)用来表示2014年1月到2014年6月，求两个日期段的重叠月份数。例如：输入：201401和201406，201403和201409，输出：4
    //解释：重叠月份：3,4,5,6月共4个月
    @Test
    public void test03() {

    }

    //4、入参为一个整型数组（Integer[] input），要求对入参(input)按奇偶数分成两个数组，要求启动两个线程，分别将入参(input)中的奇数和偶数输出到一个文件中，需要偶数线程每打印10个偶数以后，就将奇数线程打印10个奇数，如此交替进行。同时需要记录输出进度，每完成1000个数就在控制台中打印当前完成数量，并在所有线程结束后，在控制台打印“Done”
    @Test
    public void test04() {

    }

    //5、编程实现单向链表，并实现单向链表的反转。比如一个链表是这样的：1->2->3->4->5，通过反转后成为5->4->3->2->1，注：即实现单向链表类，在该类中提供一个单向链表的反转方法reverse，请写出完整代码
    @Test
    public void test05() {

    }

    //6、找出数组中一个值，使其左侧值的加和等于右侧值的加和，例如：1,2,5,3,2,4,2，结果为：第4个值
    @Test
    public void test06() {

    }

    //7、编程实现：线程A向队列Q中不停写入数据，线程B从队列Q中不停读取数据（只要Q中有数据）
    @Test
    public void test07() {

    }

    //8、写一个排序算法1-100随机数字，进行排序，要求效率（例如：冒泡、选择、快排.....等）
    @Test
    public void test08() {

    }
}
