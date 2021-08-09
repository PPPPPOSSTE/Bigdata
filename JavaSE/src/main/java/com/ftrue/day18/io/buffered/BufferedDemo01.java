package com.ftrue.day18.io.buffered;

import java.io.*;

/**
 * @ClassName BufferedDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 11时11分
 * @Version 1.0
 *
 * 缓冲流(高效流)
 *      缓冲流本身是不具备读写操作功能,针对另外一个流进行包装,让其具有更高的性能
 *
 * 缓冲字节流(了解)
 *      缓冲字节输入流BufferedInputStream
 *          类的特点
 *              BufferedInputStream 为另一个输入流添加一些功能,从而让这个流更加高效
 *          类的位置
 *              java.io
 *          类的构造器
 *              public BufferedInputStream(InputStream in)
 *                  创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 *          类的方法
 *
 *      缓冲字符输出流BufferedOutputStream
 *          类的特点
 *              BufferedOutputStream 为另一个输出流添加一些功能,从而让这个流更加高效
 *          类的位置
 *              java.io
 *          类的构造器
 *              public BufferedOutputStream(OutputStream out)
 *                  创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 *          类的方法
 *
 *
 * 需求:复制JDK文件
 *      方式1:以单个字节方式使用文件字节流进行读写文件
 *      方式2:以单个字节方式使用缓冲字节流进行读写文件
 *
 *      方式3:以长度为1024字节数组方式使用文件字节流进行读写文件
 *      方式4:以长度为1024字节数组方式使用缓冲字节流进行读写文件
 *
 *      方式5:以长度为8192字节数组方式使用文件字节流进行读写文件
 *      方式6:以长度为8192字节数组方式使用缓冲字节流进行读写文件
 *
 *
 * 注意事项:
 *      当文件字节流的数组长度达到8192的时候,缓冲流的效率和文件流的效率基本持平,在实际开发中推荐使用文件字节流以8192长度数组的方式
 */
public class BufferedDemo01 {
	public static void main(String[] args) throws IOException {
		long strat = System.currentTimeMillis();

		//方式1:以单个字节方式使用文件字节流进行读写文件
		//method01();//约为47分钟左右
		//方式2:以单个字节方式使用缓冲字节流进行读写文件
		//method02();//约10256毫秒
		//方式3:以长度为1024字节数组方式使用文件字节流进行读写文件
		//method03();//约4119毫秒
		//方式4:以长度为1024字节数组方式使用缓冲字节流进行读写文件
		//method04();//约860毫秒
		//方式5:以长度为8192字节数组方式使用文件字节流进行读写文件
		//method05();//约836毫秒
		//方式6:以长度为8192字节数组方式使用缓冲字节流进行读写文件
		method06();//约813毫秒

		
		long end = System.currentTimeMillis();
		System.out.println(end - strat);
	}

	private static void method06() throws IOException {
		//创建文件字节输入输出流对象
		FileInputStream fis = new FileInputStream("G:\\jdk.exe");
		FileOutputStream fos = new FileOutputStream("G:\\copy.exe");
		//创建缓冲字节输入输出流对象
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		//以单个字节方式进行读写文件
		int len;
		byte[] bytes = new byte[8192];
		while ((len = bis.read(bytes)) != -1) {
			bos.write(bytes,0,len);
		}

		//关闭资源
		bos.close();
		bis.close();
		fos.close();
		fis.close();
	}

	private static void method05() throws IOException {
		//创建文件字节输入输出流对象
		FileInputStream fis = new FileInputStream("G:\\jdk.exe");
		FileOutputStream fos = new FileOutputStream("G:\\copy.exe");

		//以单个字节方式进行读写文件
		int len;
		byte[] bytes = new byte[8192];
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes,0,len);
		}

		//关闭资源
		fos.close();
		fis.close();
	}

	private static void method04() throws IOException {
		//创建文件字节输入输出流对象
		FileInputStream fis = new FileInputStream("G:\\jdk.exe");
		FileOutputStream fos = new FileOutputStream("G:\\copy.exe");
		//创建缓冲字节输入输出流对象
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		//以单个字节方式进行读写文件
		int len;
		byte[] bytes = new byte[1024];
		while ((len = bis.read(bytes)) != -1) {
			bos.write(bytes,0,len);
		}

		//关闭资源
		bos.close();
		bis.close();
		fos.close();
		fis.close();
	}

	private static void method03() throws IOException {
		//创建文件字节输入输出流对象
		FileInputStream fis = new FileInputStream("G:\\jdk.exe");
		FileOutputStream fos = new FileOutputStream("G:\\copy.exe");

		//以单个字节方式进行读写文件
		int len;
		byte[] bytes = new byte[1024];
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes,0,len);
		}

		//关闭资源
		fos.close();
		fis.close();
	}

	private static void method02() throws IOException {
		//创建文件字节输入输出流对象
		FileInputStream fis = new FileInputStream("G:\\jdk.exe");
		FileOutputStream fos = new FileOutputStream("G:\\copy.exe");
		//创建缓冲字节输入输出流对象
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		//以单个字节方式进行读写文件
		int len;
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}

		//关闭资源
		bos.close();
		bis.close();
		fos.close();
		fis.close();
	}

	private static void method01() throws IOException {
		//创建文件字节输入输出流对象
		FileInputStream fis = new FileInputStream("G:\\jdk.exe");
		FileOutputStream fos = new FileOutputStream("G:\\copy.exe");

		//以单个字节方式进行读写文件
		int len;
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}

		//关闭资源
		fos.close();
		fis.close();
 	}
}
