package com.ftrue.day14test.integer;

/**
 * @ClassName: IntegerDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 8:51
 * @Version: 1.0
 */
/*
 *
 * 包装类:
 *      其实就是八种基本数据类型对应的引用数据类型的形式
 *
 * 基本数据类型
 *      byte,short,int,long,float,double,boolean,char
 * 引用数据类型
 *      Byte,Short,Integer,Long,Float,Double,Boolean,Character
 *
 * 学习包装类的目的:
 *      1.类型转换
 *          基本数据类型和对应的包装类型之间的转换
 *          基本数据类型和字符串类型之间的转换
 *      2.笔试题
 *
 * =================================================================
 *
 * 基本数据类型和对应的包装类型之间的转换(以Integer为例)
 *      将基本数据类型转换为对应的包装类型(装箱)
 *          1.包装类型的构造器
 *          2.包装类型的静态方法valueOf(基本数据类型数据)
 *          3.自动装箱(稍后)
 *      将包装类型转换为对应的基本数据类型(拆箱)
 *          1.包装类型的实例方法xxxValue(),备注:xxx就是基本数据类型
 *          2.自动拆箱(稍后)
 * ==================================================================
 *
 * 自动装箱和自动拆箱(JDK5.0)
 *      自动装箱:JVM可以将基本数据类型的数据直接转换为对应包装类型的数据
 *      自动拆箱:JVM可以将包装类型的数据直接转换为对应基本数据类型的数据
 *
 * =====================================================================
 *
 * 基本数据类型和字符串类型之间的转换
 *      将基本数据类型的数据转换成字符串类型的对象
 *          1.字符串连接符
 *          2.包装类型的实例方法toString()
 *          3.包装类型的静态方法toString(基本数据类型的数据)
 *          4.字符串String的静态方法valueOf(基本数据类型的数据)(推荐)
 *      将字符串类型的对象转换成基本数据类型的数据(Character除外)
 *          1.包装类型的构造器,再进行自动拆箱
 *          2.包装类型的静态方法parseXxx(字符串类型的对象) 备注:Xxx就是对应的基本数据,首字母大写 (推荐)
 *
 * ==============================================================================
 * Demo05
 *
 * 包装类的笔试题1:
 *
 * ===============================================================================
 * Demo06
 *
 * 包装类的笔试题2:
 *      包装类型不可以做数学运算,需要将该类型对象自动拆箱为基本数据类型才可以做数学运算
 *
 * ================================================================================
 * Demo07
 *
 * 常量池的分类:
 *      字符串常量池:字符串字面值
 *      整数常量池:-128 ~ 127
 *      字符常量池:0 ~ 127
 *      布尔常量池:true,false
 *
 * 包装类笔试题3:
 *      分析内存存储过程
 *
 *
 * */
public class IntegerDemo07 {
    public static void main(String[] args) {
        Double num01 = 0.0;
        Double num02 = 0.0;
        System.out.println(num01 == num02);  //false //在常量池中不存在浮点常量池
        System.out.println("========================");

        Short num001 = 100;
        Short num002 = 100;
        System.out.println(num001 == num002);  //true
        System.out.println("========================");

        Short num0001 = 128;
        Short num0002 = 128;
        System.out.println(num0001 == num0002);  //false
        System.out.println("========================");

        Character num03 = 'a';
        Character num04 = 'a';
        System.out.println(num03 == num04);  //true
        System.out.println("========================");

        Boolean num05 = true;
        Boolean num06 = true;
        System.out.println(num05 == num06);  //true
        System.out.println("========================");

        //ctrl + q : println(double x)
        System.out.println(true ? new Integer(200) : new Double(3.14));
        //System.out.println(true ? new Integer(200) : new Integer(300));
        //问题1:结果是什么?    200.0
        //问题2:调用的是哪个println()? double参数
        //问题3:内存计算过程
		/*
			1.装箱
				将int类型200装箱为Integer,将double类型3.14装箱为Double
			2.拆箱
				因为:两边都是包装类型,且数据类型不一致,一切从简,都自动拆箱为基本数据类型
				备注:如果不是包装类型,向上转型为Object 举例: System.out.println(true? true : "abc")
			3.统一数据类型
				因为double的取值范围比int类型大,最后的数据变为200.0 和 3.14
			4.执行三元运算符
				因为关系表达式的结果是true,执行结果1,在控制台上打印200.0
		*/

        //ctrl + q : println(Object x)
        System.out.println(true ? true : "abc");
    }
}
