package com.ftrue.day16.set.demo08;

import java.util.Comparator;

/**
 * @ClassName MyComparator
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月17日 16时59分
 * @Version 1.0
 */
public class MyComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getId() - s2.getId();
	}
}
