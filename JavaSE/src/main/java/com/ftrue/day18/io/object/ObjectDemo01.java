package com.ftrue.day18.io.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @ClassName ObjectDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 15时10分
 * @Version 1.0
 *
 * 对象流:
 *      对象输入流(字节 ==> 对象,反序列化)
 *      对象输出流(对象 ==> 字节,序列化)
 *
 *
 * 对象输出流(序列化)ObjectOutputStream
 *      类的特点
 *          ObjectOutputStream 将 Java 对象的基本数据类型和图形写入 OutputStream。
 *      类的位置
 *          java.io
 *      类的构造器
 *          public ObjectOutputStream(OutputStream out)
 *              创建写入指定 OutputStream 的 ObjectOutputStream。
 *      类的方法
 *          public void close()
 *              关闭流
 *          public final void writeObject(Object obj)
 *              将指定的对象写入 ObjectOutputStream。
 *
 * 注意事项:
 *     只能将支持 java.io.Serializable 接口的对象写入流中
 *
 *
 * Serializable接口
 *     接口的特点
 *          类通过实现 java.io.Serializable 接口以启用其序列化功能
 *     接口的位置
 *          java.io
 *     接口的方法
 */
public class ObjectDemo01 {
	public static void main(String[] args) throws IOException {
		//创建对象输出流对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));

		//创建学生对象
		Student s = new Student("张三", 18);


		//写出对象
		oos.writeObject(s);


		//关闭资源
		oos.close();
	}
}
