package com.ftrue.day23jdbc.jdbcdao;

import java.util.List;

public interface StudentDao {
    //提供添加学生对象的方法
    void addStudent(Student s);

    //提供删除学生对象的方法
    void deleteStudent(int sid);

    //提供修改学生对象的方法
    void updateStudent(Student s);

    //提供查询所有学生的方法
    List<Student> getAllStudent();

    //提供通过指定ID查询学生的方法
    Student getStudent(int sid);
}
