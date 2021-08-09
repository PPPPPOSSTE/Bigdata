package com.ftrue.day18io.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: Demo01Pro
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 8:45
 * @Version: 1.0
 */
/**
 *
 * 学习Properties类目的:
 *      实际开发中,有很多关于配置的信息,比如:数据库帐号,数据库密码,数据库的名字,.......
 *      这些配置信息如果出现在Java代码中,如果修改这些配置信息,实际项目中需要重启服务器
 *      将这些配置信息独立出来(不写在Java代码中),写在文本文件中,可以保证修改配置信息的时候,不需要重启服务器
 *
 * 计算机硬件
 *      机械硬盘:
 *          优势:可以持久存储,价格便宜
 *          劣势:读写速度慢
 *      固态硬盘:
 *          优势:在一段时间内可以持久存储,价格便宜,比机械硬盘略贵
 *          劣势:在一段时间内可以持久存储,读写速度比较慢
 *      内存:
 *          优势:读写效率高
 *          劣势:不可以持久存储
 *      显存:
 *          优势:读写效率更高
 *          劣势:价格真贵
 *
 * Properties类
 *      类的特点
 *          Properties 类表示了一个持久(硬盘)的属性集
 *      类的位置
 *          java.util
 *      类的构造器
 *          public Properties()
 *              创建一个无默认值的空属性列表。
 *      类的方法
 *          public String getProperty(String key)
 *              用指定的键在此属性列表中搜索属性。
 *          public void load(InputStream inStream)
 *              从输入流中读取属性列表（键和元素对）。
 *          public Set<String> stringPropertyNames()
 *              返回此属性列表中的键集，其中该键及其对应值是字符串，如果在主属性列表中未找到同名的键，则还包括默认属性列表中不同的键。其键或值不是 String 类型的属性被忽略。
 *
 *
 *
 */
public class Demo01Pro {
    public static void main(String[] args) throws IOException {
        //创建属性集对象（集合）
        Properties pro = new Properties();

        //创建文件字节输入流对象
        FileInputStream fis = new FileInputStream("file\\pro.properties");

        //将属性集对象再IO流中进行读取信息
        pro.load(fis);

        //System.out.println(pro);

        //通过方式1进行遍历：键找值   [不推荐]
        /*Set<Object> keys = pro.keySet();

        for (Object key : keys) {
            Object value = pro.get(key);
            System.out.println(key + "=" + value);
        }*/

        //通过属性集对象特有方法进行遍历：思路还是键找值
        Set<String> keys = pro.stringPropertyNames();
        for (String key : keys) {
            String value = pro.getProperty(key);
            System.out.println(key + "=" + value);
        }

        //关闭资源
        fis.close();
    }
}
