package com.ftrue.day21.reflect.demo12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName ReflectDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月24日 14时17分
 * @Version 1.0
 *
 * 通过反射的方式完成属性集文件内容获取
 *
 *
 * 注意事项:
 *      1.如果不通过获取属性集文件的话,路径是相对路径,相对于项目而言
 *      2.如果通过反射的形式(Class的getResourceAsStream()),配置文件路径也是相对路径,相对于当前文件夹路径
 *      3.如果通过反射的形式(ClassLoader的getResourceAsStream()或getSystemResourceAsStream(),配置文件路径也是相对路径,相对于src对象
 */
public class ReflectDemo09 {
	public static void main(String[] args) throws IOException {
		//使用匿名对象的方式进行简化
		//method01();
		//使用Class对象进行简化
		//method02();
		//使用CLassLoader对象进行获取
		//method03();
		//使用CLassLoader对象进行获取
		method04();
	}

	private static void method04() throws IOException {
		//1.创建属性集文件,文件后缀名是什么格式都可以,一般情况下该文件以.properties结尾
		//2.创建属性集对象
		Properties pro = new Properties();
		//3.以输入流为参数进行加载
		pro.load(ClassLoader.getSystemResourceAsStream("com/atguigu/reflect/demo09/pro.properties"));
		//4.获取属性集的键集
		Set<String> keys = pro.stringPropertyNames();
		//5.遍历集合,通过键找值
		for (String key : keys) {
			System.out.println(key + "=" + pro.getProperty(key));
		}
	}

	private static void method03() throws IOException {
		//1.创建属性集文件,文件后缀名是什么格式都可以,一般情况下该文件以.properties结尾
		//2.创建属性集对象
		Properties pro = new Properties();
		//3.以输入流为参数进行加载
		pro.load(ClassLoader.getSystemClassLoader().getResourceAsStream("com/atguigu/reflect/demo09/pro.properties"));
		//4.获取属性集的键集
		Set<String> keys = pro.stringPropertyNames();
		//5.遍历集合,通过键找值
		for (String key : keys) {
			System.out.println(key + "=" + pro.getProperty(key));
		}
	}

	private static void method02() throws IOException {
		//1.创建属性集文件,文件后缀名是什么格式都可以,一般情况下该文件以.properties结尾
		//2.创建属性集对象
		Properties pro = new Properties();
		//3.以输入流为参数进行加载
		pro.load(ReflectDemo09.class.getResourceAsStream("com/atguigu/reflect/demo09/pro.properties"));
		//4.获取属性集的键集
		Set<String> keys = pro.stringPropertyNames();
		//5.遍历集合,通过键找值
		for (String key : keys) {
			System.out.println(key + "=" + pro.getProperty(key));
		}

	}

	private static void method01() throws IOException {
		//1.创建属性集文件,文件后缀名是什么格式都可以,一般情况下该文件以.properties结尾
		//2.创建属性集对象
		Properties pro = new Properties();
		//3.通过IO流进行读取该配置文件
		//FileInputStream fis = new FileInputStream("pro.properties");
		//4.以输入流为参数进行加载
		pro.load(new FileInputStream("com/atguigu/reflect/demo09/pro.properties"));
		//5.获取属性集的键集
		Set<String> keys = pro.stringPropertyNames();
		//6.遍历集合,通过键找值
		for (String key : keys) {
			System.out.println(key + "=" + pro.getProperty(key));
		}
		//7.关闭资源
		//fis.close();
	}
}
