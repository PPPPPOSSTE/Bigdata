package com.ftrue.day18io.io.file;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: FileDemo02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/19 16:49
 * @Version: 1.0
 */
/**
 *
 * 文件的续写:
 *
 */
public class Demo02FileOutputStream {
    public static void main(String[] args) throws IOException {
        //FileOutputStream fos = new FileOutputStream("file\\a.txt");
        FileOutputStream fos = new FileOutputStream("file\\a.txt", true);

        fos.write("尚".getBytes());
        fos.write("硅".getBytes());

        //关闭资源
        fos.close();
    }
}
