package com.ftrue.day18.io.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName SystemDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 16时15分
 * @Version 1.0
 *
 * 标准流:
 *      标准输入流:System.in
 *      标准输出流:System.out
 *
 * 标准输入流:System.in
 *      第二种键盘录入方式
 */
public class SystemDemo01 {
	public static void main(String[] args) throws IOException {
		//System.out.println(System.in);
		//第二种键盘录入方式
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请键盘录入字符串");
		String s = br.readLine();
		System.out.println(s);

		//关闭资源
		br.close();
	}
}
