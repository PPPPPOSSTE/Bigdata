package com.ftrue.day22exam.exercise05;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: Exercise05
 * @Description:
 * @Author: zhiqi zhang on 2021/7/26 8:51
 * @Version: 1.0
 */
//较难编程题  2题  8分/题
public class Exercise05 {

    //1.	判断101-200之间有多少个素数，并输出所有素数
    @Test
    public void test01() {
        System.out.print("101-200之间的素数有：");
        int sum = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum++;
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        System.out.println("素数总共有：" + sum + "个");
    }

    //2.	一个球从100米高度自由落下，每次落地后反跳回原高度的一半，再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
    @Test
    public void test02() {
        double height = 100;
        double distance = 0;
        int count = 10;
        for (int i = 1; i <= count; i++) {
            distance += height;
            height = height / 2;
            if (i != count) {
                distance += height;
            }
        }
        System.out.println("distance = " + distance);
        System.out.println("height = " + height);
    }

    //3.	用100元钱买100支笔，其中钢笔3元/支，圆珠笔2元/支，铅笔0.5元/支，问钢笔、圆珠笔和铅笔可以各买多少支？请写main方法打印需要买的数目。
    @Test
    public void test03() {
        //for (int = 1; pen < money / pPrice; pen++)
        //三层嵌套循环
        //第一层为钢笔  第二层为圆珠笔  第三层为铅笔
    }

    //4.	通项公式如下：f(n)=n + (n-1) + (n-2) + .... + 1，其中n是大于等于5并且小于10000的整数，例如：f(5) = 5 + 4 + 3 + 2 + 1，f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，请用递归的方式完成方法long f( int n)的方法体。
    @Test
    public void test04() {

    }

    //5.	求1+2！+3！+...+20！的和
    @Test
    public void test05() {

    }

    //6.	第一个人10，第2个比第1个人大2岁，以此类推，请用递归方式计算出第8个人多大？
    @Test
    public void test06() {

    }

    //7.	有n步台阶，一次只能上1步或2步，共有多少种走法？
    //思路：试探递归规律, 得出: f(n) = f(n-1) + f(n-2)
    @Test
    public void test07() {

    }

    //8.	输入整型数98765，输出是56789
    @Test
    public void test08() {
        int num = 98765;
        StringBuilder sb = new StringBuilder(num + "");
        String s = sb.reverse().toString();
//        Integer result = Integer.valueOf(s);
        int result = Integer.parseInt(s);
        System.out.println(result);
    }

    //9.	有一个字符串，其中包含中文字符、英文字符和数字字符，请统计和打印出各个字符的字数。
    //举例说明：String content = "中中国55kkfff";
    @Test
    public void test09() {
        String content = "中中国55kkfff";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Set<Character> set = map.keySet();
        for (Character key : set) {
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }

    }

    //10.	斐波纳契数列（Fibonacci Sequence），又称黄金分割数列。
    //一列数的规则如下：1、1、2、3、5、8、13、21、34....求第n位数是多少？
    //在数学上，斐波纳契数列以如下被以递归的方法定义：F0=0，F1=1，Fn=F(n-1)+F(n-2)（n>=2，n∈N*）在现代物理、准晶体结构、化学等领域，斐波纳契数列都有直接的应用
    @Test
    public void test10() {
        System.out.println(test100(6));
        System.out.println(test100(9));
    }

    public long test100(int n) {
        long result = 1;
        if (n > 2) {
            result = test100(n - 1) + test100(n - 2);
        }
        return result;
    }

    //11.	请使用二分查找算法查找字符数组{“a”,”b”,”c”,”d”,”e”,”f”,”g”,”h”}中”g”元素的位置？
    @Test
    public void test11() {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'z'};
        char c1 = 'g';
        char c2 = 'a';
        char c3 = 'c';
        char c4 = 'r';
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        int index4 = 0;

        index1 = test110(chars, c1);
        index2 = test110(chars, c2);
        index3 = test110(chars, c3);
        index4 = test110(chars, c4);

        System.out.println("字符" + c1 + "的索引位置是：" + index1);
        System.out.println("字符" + c2 + "的索引位置是：" + index2);
        System.out.println("字符" + c3 + "的索引位置是：" + index3);
        System.out.println("字符" + c4 + "的索引位置是：" + index4);

    }

    public static int test110(char[] chars, char c) {
        int start = 0;
        int medium = chars.length / 2;
        int end = chars.length - 1;
        int index = -1;

        while (true) {
            if (c == chars[medium]) {
                index = medium;
                break;
            } else {
                //用来处理字符不在字符数组中的情形
                if (medium == start) {
                    break;
                }

                if (c > chars[medium]) {
                    start = medium;
                } else {
                    end = medium;
                }
                medium = (start + end) / 2;
            }
        }

        return index;
    }

    //12.	消除下面集合中重复元素？
    //List list = Arrays.asList(1,2,3,3,4,4,5,5,6,1,9,3,25,4);
    @Test
    public void test12() {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 6, 1, 9, 3, 25, 4);
        //方法1：
        HashSet<Integer> set1 = new HashSet<>(list);

        //方法2：
        HashSet<Integer> set2 = new HashSet<>();
        set2.addAll(list);

        System.out.println(set1);
        System.out.println(set2);
    }

    //13.	请用wait()和notify()方法编写一个生产者消费者设计模式程序?
    @Test
    public void test13() {

    }


}
