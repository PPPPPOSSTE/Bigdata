package com.ftrue.day23jdbc.jdbcdao;

import com.ftrue.day23jdbc.until.JDBCTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp implements StudentDao {
    //更新 删除 增加  可以复用的代码
    public void updateStudent(String sql, Object... arr) {
        Connection connection = null;
        PreparedStatement ppst = null;
        try {
            connection = JDBCTools.getConnection();
            ppst = connection.prepareStatement(sql);
            for (int i = 0; i < arr.length; i++) {
                ppst.setObject(i + 1, arr[i]);
            }
            ppst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.close(ppst, connection);
        }
    }

    @Override
    public void addStudent(Student s) {
        //Connection connection =null;
        //PreparedStatement ppst=null;
        //try {
        //    connection = JDBCTools.getConnection();
        //    String sql="insert into student values(null,?,?)";
        //    ppst = connection.prepareStatement(sql);
        //    ppst.setString(1,s.getName());
        //    ppst.setInt(2,s.getAge());
        //    ppst.executeUpdate();
        //} catch (SQLException e) {
        //    e.printStackTrace();
        //}finally {
        //    JDBCTools.close(ppst,connection);
        //}
        String sql = "insert into student values(null,?,?)";
        updateStudent(sql, s.getName(), s.getAge());
    }

    @Override
    public void deleteStudent(int sid) {
        String sql = "delete from student where id=?";
        updateStudent(sql, sid);
    }

    @Override
    public void updateStudent(Student s) {
        //Connection connection =null;
        //PreparedStatement ppst=null;
        //try {
        //    connection = JDBCTools.getConnection();
        //    String sql="update student set name=?,age=? where id=?";
        //    ppst = connection.prepareStatement(sql);
        //    ppst.setString(1,s.getName());
        //    ppst.setInt(2,s.getAge());
        //    ppst.setInt(3,s.getId());
        //    ppst.executeUpdate();
        //} catch (SQLException e) {
        //    e.printStackTrace();
        //}finally {
        //    JDBCTools.close(ppst,connection);
        //}
        String sql = "update student set name=?,age=? where id=?";
        updateStudent(sql, s.getName(), s.getAge(), s.getId());
    }

    @Override
    public List<Student> getAllStudent() {
        Connection connection = null;
        PreparedStatement ppst = null;
        ArrayList<Student> students = new ArrayList<>();
        ResultSet rs = null;
        try {
            connection = JDBCTools.getConnection();
            String sql = "select * from student";
            ppst = connection.prepareStatement(sql);
            rs = ppst.executeQuery();
            //遍历 rs 并将结果每一行封装到集合中
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Student student = new Student(id, name, age);
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.close(rs, ppst, connection);
        }
        return students;
    }

    @Override
    public Student getStudent(int sid) {
        Connection connection = null;
        PreparedStatement ppst = null;
        Student student = new Student();
        ResultSet rs = null;
        try {
            connection = JDBCTools.getConnection();
            String sql = "select * from student where id=?";
            ppst = connection.prepareStatement(sql);
            ppst.setInt(1, sid);
            rs = ppst.executeQuery();
            //遍历 rs 并将结果每一行封装到集合中
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                student = new Student(id, name, age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.close(rs, ppst, connection);
        }
        return student;
    }
}
