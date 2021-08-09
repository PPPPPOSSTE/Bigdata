package com.ftrue.day22exam.exercise03;

import org.junit.Test;

/**
 * @ClassName: Exercise03
 * @Description:
 * @Author: zhiqi zhang on 2021/7/25 18:50
 * @Version: 1.0
 */
//简单简答题   7题   5分/题
public class Exercise03 {

    //1、break、continue、return的区别？
    @Test
    public void test01() {
        /*
        * break：用于switch和循环，用于结束switch、结束当前循环
        * continue：用于循环，用于结束本次循环
        * return：用于结束当前方法，还可以用于return返回值，返回结果
        *
        * */
    }

    //2、请列出一些常用的类、接口、包，各至少5个
    @Test
    public void test02() {
        /*
         * 类：Object、String、Arrays、Math、System
         * 接口：Comparable、Comparator、Runnable、Serializable、Collection
         * 包；java.lang java.util java.io java.text java.lang.reflect
         *
         * */
    }

    //3、访问修饰符的作用范围由大到小，及各自的范围是什么？可以修饰什么？
    @Test
    public void test03() {
        /*
         * public protected 缺省 private
         * public：任何地方
         * protected：类内部 同一个包 子类
         * 缺省：类内部 同一个包
         * private：类内部
         *
         * 外部类只能使用public或者缺省
         * 如果是修饰类的成员，4种都可以
         * */
    }

    //4、请对public static void main(String[] args)的每一个单词做解释？
    @Test
    public void test04() {
        /*
         * public：公共的，用它修饰的类或成员在任意位置可见
         * static：静态的，用它修饰的方法，可以不用创建对象就可以调用
         * void：表示该方法没有返回值
         * main：Java的主方法名，JavaSE的程序入口
         * String[]: 字符串数组，这是main方法的形参类型，可以通过命令行参数传值
         * args：这是main方法的形参名，如果要在main种使用命令行参数，可以白能力该args数组
         *
         * */
    }

    //5、请解释Overload与Override的区别？
    @Test
    public void test05() {
        /*
         * Overload：是方法重载，指的是在同一个类中，方法名称相同，形参列表不同的两个或者多个方法，和返回值类型无关
         *
         * Override：是方法的重写，指的是子类继承父类时，当父类的方法体不适用于子类时，子类可以重写父类的方法。重写必须遵守方法名和形参列表与父类的被重写的方法相同，而返回值类型可以小于等于父类被重写的方法（如果是基本数据类型和void，则必须相同），权限修饰符可以大于等于父类被重写的方法，抛出的异常列表可以小于等于父类被重写的方法。
         *

         * */
    }

    //6、final、finalize、finally的区别？
    @Test
    public void test06() {
        /*
         * final：是表示最终的。是一个修饰符，修饰类时表示此类不能被继承；修饰方法时表示不能被子类重写；修饰属性和局部变量时表示值不能被修改，是个常量。
         *
         * finally：是表示最终块，是异常处理的一部分，和try catch一起使用，不管是否发生异常都要执行的代码放在finally块中
         *
         * finalize：是表示最终方法，是java.lang.Object类的一个方法，在对象被垃圾回收时调用。
         *
         * */
    }

    //7、面向对象的基本特征有哪些？并作出解释
    @Test
    public void test07() {
        /*
         * 封装：封装的好处就是安全，方便。封装隐藏了对象的具体实现，当要操纵对象时，只要调用其中的方法，而不用管方法的具体实现。属性的封装就是属性私有化并提供get/set方法，这样外界只能通过set/get方法操作属性，行为变得可控。
         *
         * 继承：继承的好处就是代码的复用和扩展。继承可以保留父类的属性和方法，同时子类又可以扩展自己的属性和方法。
         *
         * 多态：目的是实现代码的灵活性，多态体现在重载和重写方法，更多的时候指的是对象的多态性，即当父类的变量指向子类的对象时，那么调用子类重写的方法，运行的是子类重写过的代码，从而实现同一个父类的变量，因为赋值的子类对象不同而体现出不同的功能。应用主要体现在多态参数和多态数组中。
         *
         * */
    }

    //8、请解释String、StringBuilder、StringBuffer的区别？
    @Test
    public void test08() {
        /*
         * String：是不可变的字符序列，因此字符串常量存储在常量池中。而StringBuilder和StringBuffer是可变的字符序列。String对象是常量对象，因此一旦拼接和修改就会产生新的String对象。
         *
         * StringBuilder和StringBuffer 可以在原始对象上进行append、insert、delete、replace等修改。
         *
         * StringBuilder和StringBuffer 是完全兼容的API，但是StringBuilder是线程不安全的，StringBuffer是线程安全的
         * */
    }


    //9、如下关于String比较的代码的运行结果是什么
    @Test
    public void test09() {
        /*
         * 1 false
         * 2 true
         * 3 false
         * 4 true
         * 5 false
         * 6 false
         * 7 false
         * 8 true
         * 9 false
         * 10 true
         * */
    }

    //10、BigDecimal和float、double有什么区别？BigInteger和int、long有什么区别？
    @Test
    public void test10() {
        /*
         *
         *
         *
         *
         * */
    }
}
