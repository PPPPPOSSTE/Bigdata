package com.ftrue.day23jdbc.jdbcbean;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: JDBC_MKStudent
 * @Description:
 * @Author: zhiqi zhang on 2021/7/30 14:16
 * @Version: 1.0
 */
public class JDBC_MKStudent {
    public static void main(String[] args) throws SQLException {
        //测试 添加方法
        //Student sunzong = new Student("sunzong", 20);
        //Student dlrb = new Student("dlrb", 18);
        //Student mrzh = new Student("mrzh", 18);
        //addStudent(mrzh);
        //测试删除
        deleteStudent(1);
        // 获取所有的学生对象
        List<Student> allStudent = getAllStudent();
        System.out.println(allStudent);
    }

    public static void addStudent(Student s) throws ClassNotFoundException, SQLException {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String user = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, user, password);

        String sql = "insert into student values(null, ?, ?)";
        PreparedStatement ppst = conn.prepareStatement(sql);
        ppst.setString(1, s.getName());
        ppst.setInt(2, s.getAge());
        ppst.executeUpdate();

        ppst.close();
        conn.close();
    }

    public static void deleteStudent(int sid) throws SQLException {
        DriverManager.registerDriver(new Driver());
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //sql
        String sql = "delete from student where id =?";
        PreparedStatement ppst = connection.prepareStatement(sql);
        ppst.setInt(1, sid);
        //执行
        ppst.executeUpdate();
        //关闭资源
        ppst.close();
        connection.close();
    }

    public static List<Student> getAllStudent() throws SQLException {
        DriverManager.registerDriver(new Driver());
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //sql
        String sql = "select * from student";
        PreparedStatement ppst = connection.prepareStatement(sql);
        ResultSet rs = ppst.executeQuery();
        //定义集合进行添加学生对象
        ArrayList<Student> students = new ArrayList<>();
        //遍历结果集
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            Student student = new Student(id, name, age);
            students.add(student);
        }
        //资源关闭
        rs.close();
        ppst.close();
        connection.close();
        return students;
    }

}
