package com.ftrue.day19.thread.demo11;

/**
 * @ClassName CEO
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月21日 16时08分
 * @Version 1.0
 */
public class CEO {
	private static CEO ceo;

	private CEO() {}


	public static CEO getCEO() {


		if (ceo == null) {
			//线程1 线程2 线程3
			synchronized (CEO.class) {
				if (ceo == null) {
					ceo = new CEO();
				}
			}
		}

		return ceo;
	}
}
