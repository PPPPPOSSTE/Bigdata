package com.ftrue.day18io.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @ClassName: Demo02Object
 * @Description:
 * @Author: zhiqi zhang on 2021/7/20 15:27
 * @Version: 1.0
 */
/**
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
 *
 * =====================================================================
 * Demo02
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
 *
 */
public class Demo02Object {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));

        //读取对象
        Object obj = ois.readObject();
        System.out.println(obj);

        //关闭资源
        ois.close();
    }
}
