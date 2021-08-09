package com.ftrue.day23jdbc.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JDBC_Hard {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // update();  //sql拼接存在麻烦
        query();   //sql注入有问题 没有进行裁剪和类型判断
    }

    private static void query() throws ClassNotFoundException, SQLException {
        DriverManager.registerDriver(new Driver());
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //使用connection 获取statement对象
        Statement statement = connection.createStatement();
        //使用scanner对象进行id的传入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入查询人的id");
        String id = scanner.nextLine();
        String sql = "select * from student where id=" + id;
        System.out.println("sql = " + sql);
        ResultSet resultSet = statement.executeQuery(sql);
        //遍历结果集
        while (resultSet.next()) {
            int ids = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            System.out.println(ids + "\t" + name + "\t" + age);
        }
        //关闭资源
        resultSet.close();
        statement.close();
        connection.close();
    }

    private static void update() throws SQLException {
        DriverManager.registerDriver(new Driver());
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //使用connection 获取statement对象
        Statement statement = connection.createStatement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入添加人的姓名");
        String name = scanner.nextLine();
        System.out.println("请输入你要添加人的年龄");
        String age = scanner.nextLine();
        //进行sql拼接
        String sql = "insert into student values(null,'" + name + "'," + age + ")";
        statement.executeUpdate(sql);
        //关闭资源
        statement.close();
        connection.close();
    }
}
