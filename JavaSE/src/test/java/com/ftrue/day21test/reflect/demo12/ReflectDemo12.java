package com.ftrue.day21test.reflect.demo12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: ReflectDemo12
 * @Description:
 * @Author: zhiqi zhang on 2021/7/24 14:17
 * @Version: 1.0
 */

/**
 *
 * 通过反射的方式完成属性集文件内容获取
 *
 *
 * 注意事项:
 *      1.如果不通过获取属性集文件的话,路径是相对路径,相对于项目而言
 *      2.如果通过反射的形式(Class的getResourceAsStream()),配置文件路径也是相对路径,相对于当前文件夹路径
 *      3.如果通过反射的形式(ClassLoader的getResourceAsStream()或getSystemResourceAsStream(),配置文件路径也是相对路径,相对于src对象
 */
public class ReflectDemo12 {
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

    //ClassLoader类的静态方法：getSystemResourceAsStream
    //文件的相对路径：与此类所在包的根包目录同层级
    private static void method04() throws IOException {
        Properties properties = new Properties();

        properties.load(ClassLoader.getSystemResourceAsStream("pro.properties"));

        Set<String> keys = properties.stringPropertyNames();

        for (String key : keys) {
            System.out.println(key + " : " + properties.getProperty(key));
        }
    }

    //ClassLoader类的实例方法：getResourceAsStream
    //文件的相对路径：与此类所在包的根包目录同层级
    private static void method03() throws IOException {
        Properties properties = new Properties();

        properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("pro.properties"));

        Set<String> keys = properties.stringPropertyNames();

        for (String key : keys) {
            System.out.println(key + " : " + properties.getProperty(key));
        }
    }

    //Class类的实例方法：public InputStream getResourceAsStream(String name)
    //文件的相对路径：与此类所在包的目录同层级
    private static void method02() throws IOException {
        //1.创建属性集文件,文件后缀名是什么格式都可以,一般情况下该文件以.properties结尾
        //2.创建属性集对象
        Properties properties = new Properties();

        //3.以输入流为参数进行加载
        properties.load(ReflectDemo12.class.getResourceAsStream("pro.properties"));

        //4.获取属性集的键集
        Set<String> keys = properties.stringPropertyNames();

        //5.遍历集合,通过键找值
        for (String key : keys) {
            System.out.println(key + " : " + properties.getProperty(key));
        }
    }

    private static void method01() throws IOException {
        //1.创建属性集文件,文件后缀名是什么格式都可以,一般情况下该文件以.properties结尾
        //2.创建属性集对象
        Properties pro = new Properties();

        //3.通过IO流进行读取该配置文件
        //FileInputStream fis = new FileInputStream("pro.properties");
        //4.以输入流为参数进行加载
        //文件字节流的相对路径：项目的根目录
        pro.load(new FileInputStream("file\\pro.properties"));

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
