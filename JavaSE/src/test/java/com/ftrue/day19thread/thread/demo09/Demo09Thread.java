package com.ftrue.day19thread.thread.demo09;

/**
 * @ClassName: Demo08Thread
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 15:01
 * @Version: 1.0
 */
public class Demo09Thread {
    public static void main(String[] args) {
        //创建统一资源对象
        BaoZi bz = new BaoZi();

        //创建生产者和消费者的执行动作对象
        Thread bzp = new Thread(new BaoZiPu(bz), "包子铺");
        Thread stu1 = new Thread(new Student(bz), "学生1");
        Thread stu2 = new Thread(new Student(bz), "学生2");
        Thread stu3 = new Thread(new Student(bz), "学生3");

        //开启线程
        bzp.start();
        stu1.start();
        stu2.start();
        stu3.start();
    }
}
