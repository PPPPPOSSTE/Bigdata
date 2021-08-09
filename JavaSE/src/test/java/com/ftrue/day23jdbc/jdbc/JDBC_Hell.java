package com.ftrue.day23jdbc.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JDBC_Hell {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        query();
        update();
    }

    private static void query() throws ClassNotFoundException, SQLException {
        DriverManager.registerDriver(new Driver());
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //获取预编译对象
        // String sql = "select * from student where id=?";
        String sql = "select * from student where id=2";
        PreparedStatement ppst = connection.prepareStatement(sql);
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("请输入查询人的id");
        //String id = scanner.nextLine();
        //注入值
        //ppst.setString(1,id);
        //执行查询
        ResultSet rs = ppst.executeQuery();
        //遍历结果集
        while (rs.next()) {
            int ids = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println(ids + "\t" + name + "\t" + age);
        }
        //资源关闭
        rs.close();
        ppst.close();
        connection.close();
    }

    private static void update() throws SQLException {
        DriverManager.registerDriver(new Driver());
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //获取预编译对象
        String sql = "insert into student values(null,?,?)";
        PreparedStatement ppst = connection.prepareStatement(sql);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入添加人的姓名");
        String name = scanner.nextLine();
        System.out.println("请输入你要添加人的年龄");
        String age = scanner.nextLine();
        ppst.setString(1, name);
        ppst.setString(2, age);
        //执行
        ppst.executeUpdate();
        //关闭资源
        ppst.close();
        connection.close();
    }
}
