package com.ftrue.day23jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBC_Transaction {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String user = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement ppst = null;
        try {
            //关闭自动提交
            conn.setAutoCommit(false);
            String sql1 = "update account set balance=800 where id=1";
            ppst = conn.prepareStatement(sql1);
            ppst.executeUpdate();

            //异常1
            // System.out.println(1 / 0);

            String sql2 = "update account set balance=1500 where id=2";
            //异常2
            // String sql2 = "update account set balance=1500 where id=zzz2";
            ppst = conn.prepareStatement(sql2);
            ppst.executeUpdate();

            //如果成功进行提交
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            //如果失败回滚
            conn.rollback();
        } finally {
            //无论是否成功，资源都需要管理,将自动提交还原成之前样子
            ppst.close();
            conn.setAutoCommit(true);
            conn.close();
        }
    }
}
