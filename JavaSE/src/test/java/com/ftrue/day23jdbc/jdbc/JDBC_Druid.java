package com.ftrue.day23jdbc.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.SQLException;

public class JDBC_Druid {
    public static void main(String[] args) {
        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName("com.mysql.jdbc.Driver");
        dds.setUrl("jdbc:mysql://localhost:3306/jdbc_test");
        dds.setUsername("root");
        dds.setPassword("123456");
        dds.setMaxActive(30);
        dds.setMaxWait(5000);

        //进行连接获取
        try {
            for (int i = 0; i < 100; i++) {
                DruidPooledConnection connection = dds.getConnection();
                System.out.println(i + connection.toString());
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("当前网络阻塞，请充值后再试");
        }
    }
}
