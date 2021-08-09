package com.ftrue.day18.io.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @ClassName ObjectDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 15时27分
 * @Version 1.0
 *
 * 对象输入流(反序列化)ObjectInputStream
 *      类的特点
 *          ObjectInputStream 对以前使用 ObjectOutputStream 写入的基本数据和对象进行反序列化。
 *      类的位置
 *          java.io
 *      类的构造器
 *          public ObjectInputStream(InputStream in)
 *              创建从指定 InputStream 读取的 ObjectInputStream。
 *      类的方法
 *          public void close()
 *              关闭输入流。
 *          public final Object readObject()
 *              从 ObjectInputStream 读取对象。
 *
 */
public class ObjectDemo02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//创建对象输入流对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));

		//读取对象
		Object o = ois.readObject();

		System.out.println(o);

		//关闭资源
		ois.close();

	}
}
