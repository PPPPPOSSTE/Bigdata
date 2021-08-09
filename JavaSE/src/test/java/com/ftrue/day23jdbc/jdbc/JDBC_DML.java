package com.ftrue.day23jdbc.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 一.导入别人写好的jar
 *   在当前模块下面,创建一个目录 lib/libs
 *   将jar包拖入进去
 *   右键-》add as libary ->就可以使用了
 * 二.四部曲
 *    1.注册驱动 显示声明 当前java链接数据库是哪一个
 *    2.获取连接
 *    3.发送sql执行
 *    4.关闭连接
 *
 */
public class JDBC_DML {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册驱动
        // new Driver();
        // DriverManager.registerDriver(new Driver());
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        //url 协议+主机号+端口号   主协议+自协议+主机名+端口号+库
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String user = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, user, password);
        //3.定义sql语句
        Statement statement = conn.createStatement();
        // String sql = "create table student(id int, name varchar(25), age int)";
        // String sql = "insert into student values(1, '孙总', 20)";
        // String sql = "insert into student values(2, '校长', 38)";
        // String sql = "update student set age=22 where id=1";
        String sql = "delete from student where id=2";
        //executeUpdate方法 可以用来执行 DDL DML语句
        //只要大于0就成功
        statement.executeUpdate(sql);

        //关闭资源
        statement.close();
        conn.close();
    }
}
