package com.ftrue.day18.io.change;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName ChangeDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 14时01分
 * @Version 1.0
 *
 * 转换流:
 *      转换输入流
 *      转换输出流
 *
 * 编码和解码
 *      编码:看懂的(中文) ==> 看不懂的(字节)
 *      解码:看不懂的(字节) ==> 看懂的(中文)
 *
 * 乱码现象:
 *      指的就是编码的规则和解码的规则不一致的情况下
 *
 * 编码和解码规则:字符集(比喻为某一本书籍)
 *      ASCII字符集
 *          ASCII字符编码1(0-127):支持大小写英文字母,数字,符号等
 *              所有的内容都以单个字节方式进行存储
 *          ASCII字符编码2(0-255):除了支持上述128个,还支持一些北约国家符号
 *      Unicode字符集
 *          UTF-8:全球程序员默认开发环境
 *          UTF-16:
 *          UTF-32:
 *
 *          ASCII中的内容占1个字节
 *          拉丁字符:每个字符占2个字节
 *          中文字符:每个字符占3个字节
 *          其它字符:每个字符占4个字节
 *
 *      GB字符集
 *          GB2312:7000多汉字
 *          GBK:21003个汉字,除了汉字,数字,字母,日文,韩文,繁体中文
 *          GB18030:70244个汉字,除了汉字,数字,字母,日文,韩文,繁体中文,少数民族文字
 *
 *          每个字符在内存中占2个字节,包括英文,标点符号等
 *      ISO-8859字符集
 *          欧洲的码表
 *          ISO-8859-1
 *          ISO-8859-2
 *          ISO-8859-3
 *          ......
 *          ISO-8859-15
 */
public class ChangeDemo01 {
	public static void main(String[] args) throws IOException {
		//创建文件字符流对象
		FileReader fr = new FileReader("G:\\a.txt");
		FileWriter fw = new FileWriter("b.txt");

		//进行文件读写操作
		int len;
		while ((len = fr.read()) != -1) {
			fw.write(len);
		}

		//关闭资源
		fw.close();
		fr.close();
	}
}
