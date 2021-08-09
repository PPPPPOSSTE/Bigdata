package com.ftrue.day23jdbc.jdbcdao;

public class JDBCDaoTest {
    public static void main(String[] args) {
        StudentDaoImp studentDaoImp = new StudentDaoImp();
        //添加
        //Student xiaozhang = new Student("xiaozhang", 19);
        //studentDaoImp.addStudent(xiaozhang);
        //更新
        Student mtll = new Student(2,"mtll", 20);
        studentDaoImp.updateStudent(mtll);
        //获取所有
        //List<Student> allStudent = studentDaoImp.getAllStudent();
        //for (Student student : allStudent) {
        //    System.out.println(student);
        //}
    }
}
