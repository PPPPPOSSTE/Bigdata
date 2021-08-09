package com.ftrue.day12.en.demo02;

/**
 * @ClassName Sex
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月12日 11时13分
 * @Version 1.0
 */
public enum Sex  {
	boy("李雷",18),girl("韩梅梅",18);

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private Sex (String name,int age) {
		this.name = name;
		this.age = age;
	}

}
