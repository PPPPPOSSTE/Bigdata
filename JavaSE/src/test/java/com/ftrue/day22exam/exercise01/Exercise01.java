package com.ftrue.day22exam.exercise01;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: Exercise01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/22 18:20
 * @Version: 1.0
 */
public class Exercise01 {
    //1.用最有效的的方法算出2称以8等于几
    @Test
    public void test01() {
        System.out.println(2 << 3);
    }

    //2.Math.round(11.5)和Math.round(-11.5)的值是多少？
    @Test
    public void test02() {
        long round = Math.round(11.5);
        System.out.println(round);  //12
        long round1 = Math.round(11.4);
        System.out.println(round1);  //11
        long round2 = Math.round(-11.5);
        System.out.println(round2);  //-11
        long round3 = Math.round(-11.4);
        System.out.println(round3);  //-11
        long round4 = Math.round(-11.6);
        System.out.println(round4);  //-12
    }

    //3.两个对象a和b，请问a==b和a.equals(b)有什么区别？
    @Test
    public void test03() {
        //a==b 比较的是地址值
        //a.equals(b) 如果没有重写过equals的方法，比较的是地址值。如果重写过，则按重写后的逻辑进行比较
    }

    //4.switch是否能作用在byte上，是否能作用在long上，是否能作用在String上？
    @Test
    public void test04() {
        //switch () 中可以使用的类型：(byte char short)(JVM自动提升为int) int enum类型(5.0) String(7.0)
    }

    //5.char型变量中是否可以存储一个汉字？
    @Test
    public void test05() {
        //可以
        char c = '张';
        System.out.println(c);
    }

    //6.float f=3.4;是否正确，表达式15/2*2的值是多少
    @Test
    public void test06() {
        //错误
        //float f = 3.4;
        System.out.println(15 / 2 * 2);  //14
    }

    //7.编写代码实现两个变量值交换，int m = 3, n =5;
    @Test
    public void test07() {
        int m = 3, n = 5;
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }

    //8.Java的基本数据类型有哪些？String是基本数据类型吗？
    @Test
    public void test08() {
        //基本数据类型：byte short int long float double char boolean
        //String 不是基本数据类型
    }

    //9.数组有没有length()方法？String有没有length()方法？File有没有length()方法？ArrayList有没有length()方法？
    @Test
    public void test09() {
        //没有
        //有
        //有
        //没有
    }

    //10.String str = new String(“hello”);创建了哪些对象？
    @Test
    public void test10() {
        //字符串常量池中有一个对象   堆中有一个字符串对象
    }

    //11.	如何将String类型转化Number类型？举例说明String str = “123”;
    @Test
    public void test11() {
        String str = "123";
        Integer integer = new Integer(str);
        int num = Integer.parseInt(str);
        Integer integer1 = Integer.valueOf(str); //推荐方式

    }

    //12.	以下代码的运行结果：
    @Test
    public void test12() {
        char x = 'x';
        int i = 10;
        System.out.println(true ? x : i);  //120
        System.out.println(true ? 'x' : 10);  //x
        System.out.println(true ? 'x' : 1000000);  //120
        System.out.println(true ? 'x' : 10.0);  //120
        /*
         * 如果其中有一个是变量，按照自动类型转换规则处理成一致的类型；
         * 如果都是常量，如果一个是char，如果另一个是[0~65535]之间的整数按char处理；
         * 			如果一个是char，另一个是其他，按照自动类型转换规则处理成一致的类型；
         */
    }

    //13.	以下代码的执行结果
    @Test
    public void test13() {
        int a = 8, b = 3;
        System.out.println(a >>> b);  //1
        System.out.println(a >>> b | 2);  //3   & | ^ !
    }

    //14.	下面程序片段的输出结果是？
    @Test
    public void test14() {
        /*int a = 3;
        int b = 1;
        //编译不通过
        if (a = b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }*/
    }

    //15.	执行如下代码后，c的值是多少？
    @Test
    public void test15() {
        int a = 0;
        int c = 0;
        do {
            --c;
            a = a - 1;
        } while (a >= 0);
        System.out.println("c = " + c);  //-1
    }

    //16.	以下代码的运行结果？
    @Test
    public void test16() {
        int i = 10;
        while (i > 0) {
            i = i + 1;
            if (i == 10) {
                break;
            }
        }
        System.out.println("i=" + i);
        //答案1：是一个负数，因为i一直累加会超过int的存储范围
        //答案2：死循环
    }

    //17.	以下代码的运行结果？
    /*下面是一段程序，目的是输出10个=，但是不小心代码写错了，现在需要修改代码，使得程序完成功能，但是只能“增加”或“修改”其中“一个”字符，很明显，将i--改为i++，可以完成功能，但是需要修改“两个”字符，所以并不是一个正确的答案？*/
    @Test
    public void test17() {
        int n = 10;
        for (int i = 0; i < n; i--) {  //i < n 改为 -i < n
            System.out.println("=");
        }
    }

    //18.	以下代码的运行结果是什么？
    @Test
    public void test18() {
        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;// 1 2
            foo('D');
        }
    }
    //ABDCBDCB

    public static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

    //19.	以下代码的执行结果是什么
    @Test
    public void test19() {
        int i = 0;
        change19(i);
        i = i++;
        System.out.println("i = " + i); //0
    }

    public static void change19(int i) {
        i++;
    }

    //20.	以下程序的运行结果：
    @Test
    public void test20() {
        String str = new String("world");
        char[] ch = new char[]{'h', 'e', 'l', 'l', 'o'};
        change20(str, ch);
        System.out.println(str);  //world
        System.out.println(String.valueOf(ch));  //abcde
    }

    public static void change20(String str, char[] arr) {
        str = "change";
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';
        arr[4] = 'e';
    }


    //21.	以下代码的运行结果是：
    @Test
    public void test21() {
        Integer i1 = 128;
        Integer i2 = 128;
        int i3 = 128;
        int i4 = 128;
        System.out.println(i1 == i2);  //false
        System.out.println(i3 == i4);  //true
        System.out.println(i1 == i3);  //true
    }
    /*Integer的i1和i2是对象，他们==比较的是地址。如果-128~127范围，那么使用缓存的常量对象，如果超过这个范围，是新new的对象，不是常量对象*/

    //22.	以下代码的运行结果
    @Test
    public void test22() {
        double a = 2.0;
        double b = 2.0;
        Double c = 2.0;
        Double d = 2.0;
        System.out.println(a == b);  //true
        System.out.println(c == d);  //false
        System.out.println(a == d);  //true
    }

    //23.	以下代码的运行结果是？
    @Test
    public void test23() {

    }


    //24.	以下代码的运行结果是？
    @Test
    public void test24() {

    }

    //25.	以下程序的运行结果是：
    @Test
    public void test25() {

    }

    //26.	如下代码是否可以编译通过，如果可以，运行结果是什么？
    @Test
    public void test26() {

    }

    //27.	以下代码的运行结果：
    @Test
    public void test27() {

    }

    //28.	以下代码的执行过程？
    @Test
    public void test28() {
        int test = test(3, 5);
        System.out.println(test);  //8
    }

    public static int test(int x, int y) {
        int result = x;
        try {
            if (x < 0 || y < 0) {
                return 0;
            }
            result = x + y;
            return result;
        } finally {
            result = x - y;
        }
    }

    //29.	以下代码的运行结果？
    @Test
    public void test29() {
        Integer[] datas = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(datas);
        //运行时异常：java.lang.UnsupportedOperationException
        list.add(5);
        System.out.println(list.size());
    }

    //30.	在{1}添加什么代码，可以保证如下代码输出100
    //提示：t.wait()  或  t.jion()  或 t.yield() 或  t.interrupt()？
    @Test
    public void test30() {

    }

    //31.	以下代码如何优化
    @Test
    public void test31() {

    }
}
