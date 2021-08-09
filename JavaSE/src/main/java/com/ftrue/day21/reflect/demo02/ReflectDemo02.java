package com.ftrue.day21.reflect.demo02;

/**
 * @ClassName ReflectDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 16时11分
 * @Version 1.0
 *
 * ClassLoader类
 *      类的特点
 *          类加载器是负责加载类的对象
 *      类的位置
 *          java.lang
 *      类的构造器
 *          抽象类,无法实例化对象,通过静态方法和Class对象进行创建
 *      类的方法
 *          public InputStream getResourceAsStream(String name)
 *              返回读取指定资源的输入流
 *          public static InputStream getSystemResourceAsStream(String name)
 *              从用来加载类的搜索路径打开具有指定名称的资源，以读取该资源。
 *          public static ClassLoader getSystemClassLoader()
 *              返回委托的系统类加载器。
 *          public Class<?> loadClass(String name)
 *              使用指定的二进制名称来加载类。
 * Class类
 *      类的特点
 *          Class 类的实例表示正在运行的 Java 应用程序中的类和接口
 *      类的位置
 *          java.lang
 *      类的构造器
 *          构造器私有化,但获取Class对象共有四种方式
 *      类的方法
 *          public static Class<?> forName(String className)
 *              返回与带有给定字符串名的类或接口相关联的 Class 对象。
 *          public ClassLoader getClassLoader()
 *              返回该类的类加载器。
 *          public T newInstance()
 *              创建此 Class 对象所表示的类的一个新实例
 *          public InputStream getResourceAsStream(String name)
 *              查找具有给定名称的资源。
 *          public Constructor<T> getConstructor(Class<?>... parameterTypes)
 *              返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法
 *          public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
 *              返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法。
 *          public Field getField(String name)
 *              返回一个 Field 对象，它反映此 Class 对象所表示的类或接口的指定公共成员字段。
 *          public Field getDeclaredField(String name)
 *              返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段。
 *          public Method getMethod(String name,Class<?>... parameterTypes)
 *              返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法。
 *          public Method getDeclaredMethod(String name,Class<?>... parameterTypes)
 *              返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法。
 *
 *
 */
public class ReflectDemo02 {
}
