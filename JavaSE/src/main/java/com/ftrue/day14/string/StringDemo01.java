package com.ftrue.day14.string;


/**
 * @ClassName StringDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 09时59分
 * @Version 1.0
 *
 * String类
 *      类的特点
 *          1.在Java程序中,所有的字符串字面值常量都是字符串对象,""也是字符串对象
 *          2.在Java程序中,所有的字符串对象都是常量
 *              常量的特点:不可以改变的值
 *          3.在Java程序中,为什么字符串是常量,为什么字符串不可以改变?
 *              在String类的底层封装了一个被final关键字修饰的数组
 *          4.在String类的底层,被final关键字修饰的数组的数据类型是什么?
 *              JDK8.0(包含)以前:char[]
 *              JDK9.0(包含)以后:byte[]
 *          5.为什么在JDK9.0将char[]修改为byte[]?
 *              时间复杂度
 *                  如果是char[],先将char类型元素转换成字节数据,再将字节数据转换二进制
 *                  如果是byte[],直接将byte类型元素转换成二进制
 *              空间复杂度
 *                  内码:在源码中创建一个char类型变量,每个char类型变量占用2个字节
 *                  外码:程序员自己创建的char类型变量,每个char类型变量占用和字符集编码对应的字节
 *                      GBK编码规则:每个英文字符,占2个字节,每个中文字符,占2个字节
 *                      UTF8编码规则:每个英文字符,占1个字节,每个中文字符,占3个字节(默认开发的编码规则)
 *
 *                  如果是char[],
 *                      数组中存储abc三个字母,每个字母占用2个字节,共占用6个字节
 *                      数组中存储尚硅谷三个中文,每个中文占用2个字节,共占用6个字节
 *                  如果是byte[],直接和编码规则挂钩
 *                      数组中存储abc三个字母,每个字母占用1个字节,共占用3个字节
 *                      数组中存储尚硅谷三个中文,每个中文占用3个字节,共占用9个字节
 *          6.""和null区别:
 *              "":是长度为0的字符串对象,含有内存地址值,可以用来调用方法
 *              null,是字面值常量,是引用数据类型的默认值,没有所谓的内存地址值,如果调用直接空指针异常
 *          7.String类为什么可以存储"中文汉字"
 *              String 表示一个 UTF-16 格式的字符串
 *              UTF16也属于Unicode编码表
 *      类的位置
 *          java.lang
 *      类的构造器
 *          public String()
 *              初始化一个新创建的 String 对象，使其表示一个空字符序列。
 *          public String(byte[] bytes)
 *              通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
 *          public String(byte[] bytes,int offset,int length)
 *              通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。
 *          public String(char[] value)
 *              分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。
 *          public String(char[] value,int offset,int count)
 *              分配一个新的 String，它包含取自字符数组参数一个子数组的字符。
 *          public String(String original)
 *              初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；
 *          public String(StringBuffer buffer)
 *              分配一个新的字符串，它包含字符串缓冲区参数中当前包含的字符序列。
 *          public String(StringBuilder builder)
 *              分配一个新的字符串，它包含字符串生成器参数中当前包含的字符序列
 *      类的方法
 *          判断功能
 *          获取功能
 *          转换功能
 *          分割功能
 *
 *  创建String类型的对象的方式?
 *      1.直接赋值初始化
 *      2.通过构造器创建对象
 */
public class StringDemo01 {
	public static void main(String[] args) {
		//通过直接赋值初始化的方式创建字符串对象
		String str1 = "abcdefg";
		System.out.println("str1 = " + str1);
		//通过无参构造器创建字符串对象(长度为0的字符串)
		String str2 = new String();
		System.out.println("str2 = " + str2);//相似于String str = "",但是有本质的不同
		//通过字节数组创建字符串对象
		byte[] bytes = {97,98,99,100,101,102,103};
		String str3 = new String(bytes);
		System.out.println("str3 = " + str3);
		//通过字节数组的指定范围创建字符串对象
		String str4 = new String(bytes,3,3);
		System.out.println("str4 = " + str4);
		//通过字符数组创建字符串对象
		char[] chars = {97,98,99,100,101,102,103};
		String str5 = new String(chars);
		System.out.println("str5 = " + str5);
		//通过字符数组的指定范围创建字符串对象
		String str6 = new String(chars, 3, 3);
		System.out.println("str6 = " + str6);
		//通过字符串对象创建字符串对象
		String str7 = new String("abcdefg");
		System.out.println("str7 = " + str7);


	}
}