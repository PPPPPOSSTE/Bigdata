package com.ftrue.day19.thread.demo09;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 15时18分
 * @Version 1.0
 */
public class Student implements Runnable{
	private BaoZi bz;

	public Student(BaoZi bz) {
		this.bz = bz;
	}

	@Override
	public void run () {
		while (true) {
			synchronized (bz) {
				//判断包子的状态
				if (bz.getFlag()) {
					//如果执行到这里,说明包子资源存在,学生购买包子
					String name = Thread.currentThread().getName();
					System.out.println(name + ":学生购买包子,开始吃包子,包子真好吃~~~");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					//学生购买包子,包子资源就会被消费掉,修改包子资源的状态
					bz.setFlag(false);

					//通知包子铺老板做包子
					bz.notifyAll();//学生在唤醒的时候必须保证唤醒生产者
				} else {
					//如果执行到这里,说明包子资源不存在,学生排队等待包子做好
					try {
						bz.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
