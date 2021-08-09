package com.ftrue.day19.thread.demo09;

/**
 * @ClassName BaoZiPu
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 15时09分
 * @Version 1.0
 */
public class BaoZiPu implements Runnable{
	private BaoZi bz;

	public BaoZiPu(BaoZi bz) {
		this.bz = bz;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (bz) {
				//判断包子的状态
				if (bz.getFlag()) {
					//如果执行到这里,说明包子资源存在,包子铺休息
					try {
						bz.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					//如果执行到这里,说明包子资源不存在,包子铺做包子
					String name = Thread.currentThread().getName();
					System.out.println(name + ":开始做包子啦,包子做好啦,通知学生过来买包子");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					//需要将包子的资源修改为true
					bz.setFlag(true);

					//唤醒学生过来买包子
					bz.notify();
				}
			}
		}
	}
}
