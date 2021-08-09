package com.ftrue.day23jdbc.until;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 1.工具类
 *   私有化构造器
 * 2.提供连接 德鲁伊的连接池创建
 *            连接的获取
 * 3.关闭所有资源 连接对象 statement resultset
 */
public class JDBCTools {
    //定义私有的连接池对象
    private static DataSource ds;

    private JDBCTools() {
    }

    static {
        Properties properties = new Properties();
        try {
            properties.load(JDBCTools.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException("德鲁伊连接池初始化失败");
        }
    }

    //对外提供一个获取公共连接的方法
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = ds.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("连接对象获取失败");
        }
        return connection;
    }

    //关闭资源 connection
    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException("连接对象关闭失败");
            }
        }
    }

    //关闭资源 connection statement
    public static void close(Statement statement, Connection connection) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("编译对象关闭失败");
        } finally {
            close(connection);
        }
    }

    //关闭资源 Connection Statement ResultSet
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("结果集对象关闭失败");
        } finally {
            close(statement, connection);
        }
    }
}
