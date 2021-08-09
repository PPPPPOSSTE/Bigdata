package com.ftrue.day21.reflect.demo11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName ReflectDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月24日 14时08分
 * @Version 1.0
 *
 * 回顾:属性集对象的使用
 *
 */
public class ReflectDemo08 {
	public static void main(String[] args) throws IOException {
		//1.创建属性集文件,文件后缀名是什么格式都可以,一般情况下该文件以.properties结尾
		//2.创建属性集对象
		Properties pro = new Properties();
		//3.通过IO流进行读取该配置文件
		FileInputStream fis = new FileInputStream("com/atguigu/reflect/demo09/pro.properties");
		//4.以输入流为参数进行加载
		pro.load(fis);
		//5.获取属性集的键集
		Set<String> keys = pro.stringPropertyNames();
		//6.遍历集合,通过键找值
		for (String key : keys) {
			System.out.println(key + "=" + pro.getProperty(key));
		}
		//7.关闭资源
		fis.close();
	}
}
