package com.ftrue.day09;

import java.util.Arrays;

/**
 * @ClassName CustomerList
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月07日 10时05分
 * @Version 1.0
 *
 * CustomerList类的设计
 *
 */
public class CustomerList {
	//用来保存客户对象的数组
	private Customer[] cs;
	//记录已保存客户对象的数量
	private int total = 0;


	/*用途：构造器，用来初始化cs数组
	参数：totalCustomer：指定customers数组的最大空间*/
	public CustomerList(int totalCustomer) {
		cs = new Customer[totalCustomer];
	}



	/*用途：将参数customer添加组中最后一个客户对象记录之后
	参数：customer指定要添加的客户对象
	返回：添加成功返回true；false表示数组已满，无法添加*/
	public boolean addCustomer(Customer customer) {
		//判断客户对象是否为null
		if (isNull(customer) == false) {
			return false;
		}

		//判断数组已满
		if (isArr()) {
			return false;
		}

		/*
			假设数组的长度为5,
				当total= 0, 添加前:[null,null,null,null,null],添加到索引0的位置,添加后:[客户,null,null,null,null]
				当total= 1, 添加前:[客户,null,null,null,null],添加到索引1的位置,添加后:[客户,客户,null,null,null]
				当total= 2, 添加前:[客户,客户,null,null,null],添加到索引2的位置,添加后:[客户,客户,客户,null,null]
				当total= 3, 添加前:[客户,客户,客户,null,null],添加到索引3的位置,添加后:[客户,客户,客户,客户,null]
				当total= 4, 添加前:[客户,客户,客户,客户,null],添加到索引4的位置,添加后:[客户,客户,客户,客户,客户]
		*/

		//将参数客户对象添加到指定的索引位置
		cs[total] = customer;

		//目前已经成功添加,针对total变量进行累加
		total++;

		//添加成功
		return true;
	}


	/*用途：用参数customer替换数组中由index指定的对象
	参数：customer指定替换的新客户对象
			index指定所替换对象在数组中的位置
	返回：替换成功返回true；false表示索引无效，无法替换*/
	public boolean replaceCustomer(int index, Customer cust) {
		//判断索引的合法性
		if (isIndex(index) == false) {
			return false;
		}

		//判断对象cust是否为null
		if (isNull(cust) == false) {
			return false;
		}

		//代码执行到这一行,说明索引合法,对象cust不为null
		cs[index] = cust;

		//替换成功
		return true;
	}


	/*用途：从数组中删除参数index指定索引位置的客户对象记录
	参数： index指定所删除对象在数组中的索引位置
	返回：删除成功返回true；false表示索引无效，无法删除*/
	public boolean deleteCustomer(int index) {
		//判断索引是否无效
		if (isIndex(index) == false) {
			return false;
		}

		/*
			假设数组的长度为5,total = 5,数组为:[客户1,客户2,客户3,客户4,客户5],待删除索引位置:1

			思路:将index索引后面的数据依次往前移动
			第一次移动:
				移动前:[客户1,客户2,客户3,客户4,客户5],移动后:[客户1,客户3,客户3,客户4,客户5]
				移动动作:cs[1] = cs[2];
			第二次移动:
				移动前:[客户1,客户3,客户3,客户4,客户5],移动后:[客户1,客户3,客户4,客户4,客户5]
				移动动作:cs[2] = cs[3];
			第三次移动:
				移动前:[客户1,客户3,客户4,客户4,客户5],移动后:[客户1,客户3,客户4,客户5,客户5]
				移动动作:cs[3] = cs[4];
			第四次移动:
				移动前:[客户1,客户3,客户4,客户5,客户5],移动后:[客户1,客户3,客户4,客户5,null]
				移动动作:cs[4] = null;
		*/
		for (int i = index ; i < total - 1; i++) {
			cs[i] = cs[i+1];
		}

		//将最后一个对象替换为null
		cs[total - 1] = null;

		//因为已经成功删除,真实客户数量已经减少
		total--;

		//删除成功
		return true;
	}


	/*用途：返回数组中记录的所有客户对象
	返回： Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同。*/
	public Customer[] getAllCustomers() {
		return Arrays.copyOf(cs,total);
	}


	/*用途：返回参数index指定索引位置的客户对象记录
	参数： index指定所要获取的客户对象在数组中的索引位置
	返回：封装了客户信息的Customer对象*/
	public Customer getCustomer(int index) {
		//判断索引是否非法
		if (isIndex(index) == false) {
			return null;
		}

		return cs[index];
	}



	//判断索引合法性
	public boolean isIndex (int index) {
		/*
			假设数组的长度为5,total = 4 , 当前数组为: [客户,客户,客户,客户,null]
				当index = 0,可以进行替换
				当index = 1,可以进行替换
				当index = 2,可以进行替换
				当index = 3,可以进行替换
				当index = 4,不可以进行替换

			当total = 4时,index的取值范围 0 - 3
		*/
		if (index < 0 || index >= total) {
			return false;
		}

		return true;
	}


	//判断客户对象是否为null
	public boolean isNull (Customer customer) {
		return customer != null;
	}

	//判断数组已满
	public boolean isArr () {
		if (total >= cs.length) {
			return true;
		}

		return false;
	}
}
