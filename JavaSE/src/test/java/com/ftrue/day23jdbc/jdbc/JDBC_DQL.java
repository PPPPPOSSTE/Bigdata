package com.ftrue.day23jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 对于DQL
 *    1.注册驱动 显示声明 当前java链接数据库是哪一个
 *    2.获取连接
 *    3.发送sql执行
 *    4.获取返回结果集
 *    5.关闭连接
 */
public class JDBC_DQL {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String user = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, user, password);
        //使用connection 获取statement对象
        Statement statement = conn.createStatement();
        String sql = "select * from student";
        //获取结果集对象
        ResultSet resultSet = statement.executeQuery(sql);
        //遍历结果集
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int age = resultSet.getInt(3);
            System.out.println(id + "\t" + name + "\t" + age);
        }

        //关闭资源
        resultSet.close();
        statement.close();
        conn.close();
    }
}
