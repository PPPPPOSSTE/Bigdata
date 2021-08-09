package com.ftrue.day23jdbc.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_BATCH {
    public static void main(String[] args) throws SQLException {
        long start = System.currentTimeMillis();
        // update(); //38843
        updateBatch(); //1792
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void updateBatch() throws SQLException {
        DriverManager.registerDriver(new Driver());
        String url = "jdbc:mysql://localhost:3306/jdbc_test?rewriteBatchedStatements=true";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //获取预编译对象
        String sql = "insert into student values(null,?,?)";
        PreparedStatement ppst = connection.prepareStatement(sql);
        for (int i = 0; i < 100000; i++) {
            ppst.setString(1, "atguigu");
            ppst.setInt(2, 18);
            //添加批数据
            ppst.addBatch();
            if (i % 10000 == 0) {
                ppst.executeBatch();
            }
        }
        //执行批数据
        ppst.executeBatch();
        //关闭资源
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
        for (int i = 0; i < 1000; i++) {
            ppst.setString(1, "atguigu");
            ppst.setInt(2, 20);
            ppst.executeUpdate();
        }
        //资源关闭
        ppst.close();
        connection.close();
    }
}
