package com.ftrue.day21test.reflect.demo11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: ReflectDemo11
 * @Description:
 * @Author: zhiqi zhang on 2021/7/24 14:09
 * @Version: 1.0
 */
public class ReflectDemo11 {
    public static void main(String[] args) throws IOException {
        //1.创建属性集文件,文件后缀名是什么格式都可以,一般情况下该文件以.properties结尾
        //2.创建属性集对象
        Properties properties = new Properties();

        //3.通过IO流进行读取该配置文件
        //4.以输入流为参数进行加载
        properties.load(new FileInputStream("file\\pro.properties"));

        //5.获取属性集的键集
        Set<String> keys = properties.stringPropertyNames();

        //6.遍历集合,通过键找值
        for (String key : keys) {
            System.out.println(key + " : " + properties.getProperty(key));
        }

    }
}
