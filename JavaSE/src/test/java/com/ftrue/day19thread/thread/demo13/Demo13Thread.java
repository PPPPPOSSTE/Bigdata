package com.ftrue.day19thread.thread.demo13;

/**
 * @ClassName: Demo13Thread
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 23:34
 * @Version: 1.0
 */
/**

  线程状态:


  根据面向百度编程:5种(40%),6种(30%),7种(20%),其它(10%)
       当答案发生分歧的时候:以官方说的为准

  官方标准答案:6种
       NEW(新建):
           线程对象被创建,但是没有执行start()的状态
       RUNNABLE(运行)
           线程对象正在执行的状态
       BLOCKED(阻塞)
           线程对象遇到同步,没有抢夺到CPU资源,从而进入的状态
       WAITING(无限等待)
           线程对象被资源调用wait()的状态
       TIMED_WAITING(计时等待)
           线程对象被执行sleep()的状态
       TERMINATED(终止)
           线程对象执行完毕的状态

  转换关系:
       NEW(新建):
           转换关系:
               当线程对象被执行start()的时候,转换成"运行"状态
       RUNNABLE(运行)
           转换关系:
               当线程对象正常执行完毕,转换成"终止"状态
               当线程对象遇到了同步,没有抢夺到锁资源,转换成"阻塞"状态
               当线程对象被资源调用wait(),转换成"无限等待"状态
               当线程对象被执行sleep(),转换成"计时等待"状态
       BLOCKED(阻塞)
           转换关系:
               当线程对象抢夺到锁资源,转换成"运行"状态
       WAITING(无限等待)
           转换关系:
               当线程对象被执行notify()和notifyAll(),遇到同步并没有抢夺到锁资源,转换成"阻塞"转换
               当线程对象被执行notify()和notifyAll(),没有遇到同步或者遇到同步抢夺到锁资源,转换成"运行"转换
       TIMED_WAITING(计时等待)
           转换关系:
               当线程对象等待时间到,遇到同步并没有抢夺到锁资源,转换成"阻塞"转换
               当线程对象等待时间到,没有遇到同步或者遇到同步并抢夺到锁资源,转换成"运行"转换
       TERMINATED(终止)
           转换关系
               无


  聊聊网上普遍说的5种和7种说法怎么来的?
       7种说法由来:
           新建,就绪,运行,阻塞,无限等待,计时等待,终止
       5种说法由来:
           新建,就绪,运行,等待,终止

 */
public class Demo13Thread {
    public static void main(String[] args) {

    }
}
