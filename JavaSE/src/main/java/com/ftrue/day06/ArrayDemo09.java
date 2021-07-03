package com.ftrue.day06;

/**
 * @ClassName ArrayDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月03日 15时10分
 * @Version 1.0
 *
 * 一维数组:
 *      我们以前学习的数组就是一维数组,数组里面的元素是数据或者对象
 *
 * 二维数组:
 *      数组里面的元素另外一个数组的数组
 *
 * 二维数组的声明:
 *      数据类型[][] 数组名(推荐)
 *      数据类型 数组名[][]
 *      数据类型[] 数组名[]
 *
 * 二维数组的初始化:
 *      动态初始化
 *          格式1:
 *              数据类型[][] 数组名 = new 数据类型[x][y];
 *                  x : 二维数组中存在几个一维数组
 *                  y : 每个一维数组含有几个元素
 *          格式2:
 *              数据类型[][] 数组名 = new 数据类型[x][];
 *                  只初始化二维数组,不初始化里面的一维数组
 *      静态初始化
 *          标准版:
 *              数据类型[][] 数组名 = new 数据类型[][]{new 数据类型[]{元素1,元素2,......,元素n},new 数据类型[]{元素1,元素2,......,元素n},.....,new 数据类型[]{元素1,元素2,......,元素n}};
 *          简化版
 *              数据类型[][] 数组名 = {{元素1,元素2,......,元素n},{元素1,元素2,......,元素n},.....,{元素1,元素2,......,元素n}};
 *
 * 二维数组的访问
 *      数组名[x][y]
 *      x : 待访问元素所在二维数组中的索引
 *      y : 待访问元素所在一维数组中的索引
 *
 */
public class ArrayDemo09 {
	public static void main(String[] args) {
		//数据类型[][] 数据组 = new 数据类型[x][y];
		int[][] arr01 = new int[3][2];//含有4个数组(1个二维数组,3个一维数组)
		System.out.println(arr01);
		System.out.println(arr01[0]);
		System.out.println(arr01[1]);
		System.out.println(arr01[2]);
		System.out.println("==============================");
		//数据类型[][] 数组名 = new 数据类型[x][];
		int[][] arr02 = new int[3][];
		System.out.println(arr02);
		System.out.println(arr02[0]);
		System.out.println(arr02[1]);
		System.out.println(arr02[2]);

		//数据类型[][] 数组名 = new 数据类型[][]{new 数据类型[]{元素1,元素2,......,元素n},new 数据类型[]{元素1,元素2,......,元素n},.....,new 数据类型[]{元素1,元素2,......,元素n}};
		int[][] arr03 = new int[][]{new int[]{11,22,33},new int[]{44,55},new int[]{66,77,88,99}};


		//数据类型[][] 数组名 = {{元素1,元素2,......,元素n},{元素1,元素2,......,元素n},.....,{元素1,元素2,......,元素n}};
		int[][] arr04 = {{11,22,33},{44,55},{66,77,88,99}};

		System.out.println(arr04);
		System.out.println(arr04[0]);//{11,22,33}
		System.out.println(arr04[0][0]);
		System.out.println(arr04[0][1]);
		System.out.println(arr04[0][2]);
		System.out.println(arr04[1]);//{44,55}
		System.out.println(arr04[1][0]);
		System.out.println(arr04[1][1]);
		System.out.println(arr04[2]);//{66,77,88,99}
		System.out.println(arr04[2][0]);
		System.out.println(arr04[2][1]);
		System.out.println(arr04[2][2]);
		System.out.println(arr04[2][3]);

		System.out.println("===========================================");

		for (int i = 0; i < arr04.length; i++) {
			for (int j = 0; j < arr04[i].length; j++) {
				System.out.println(arr04[i][j]);
			}
		}
	}
}
