package com.ftrue.day06;

/**
 * @ClassName ArrayDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月03日 14时03分
 * @Version 1.0
 *
 * 数组的动态扩容,删除,插入
 *
 */
public class ArrayDemo08 {
	public static void main(String[] args) {
		int[] arr = {11,22,33};
		System.out.println("扩容前:" + printArr(arr));
		arr = add(arr,44);
		System.out.println("扩容后:" + printArr(arr));

		System.out.println("删除前:" + printArr(arr));
		arr = remove(arr,3);
		System.out.println("删除后:" + printArr(arr));

		System.out.println("插入前:" + printArr(arr));
		arr = insert(arr,1,44);
		System.out.println("插入后:" + printArr(arr));
	}

	/*
		动态插入:
		两个明确:
			返回值类型:int[]
			形参列表:int[] arr,int index,int num
	*/
	public static int[] insert (int[] oldArr, int index , int num) {
		//针对数组做非空校验
		if (oldArr == null) {
			return oldArr;
		}

		//针对索引做非法校验
		if (index < 0 || index > oldArr.length) {
			return oldArr;
		}

		//新建一个长度比原来数组长度+1的数组
		int[] newArr = new int[oldArr.length + 1];

		//数组的复制,遍历原来的数组
		for (int i = 0; i < oldArr.length; i++) {
			if (i < index) {
				newArr[i] = oldArr[i];
			} else{
				newArr[i+1] = oldArr[i];
			}
		}

		//将待添加元素num存储到index
		newArr[index] = num;

		return newArr;
	}

	/*
		动态删除:
		两个明确:
			返回值类型:int[]
			形参列表:int[] arr, int index
	*/
	public static int[] remove (int[] oldArr, int index) {
		//针对数组做非空校验
		if (oldArr == null) {
			return oldArr;
		}
		
		//针对索引做非法校验
		if (index < 0 || index >= oldArr.length) {
			return oldArr;
		}
		
		//根据原来的数组创建一个比原来长度-1的新数组
		int[] newArr = new int[oldArr.length - 1];
		
		//数组中元素的复制
		for (int i = 0; i < newArr.length; i++) {
			if (i < index) {
				newArr[i] = oldArr[i];
			} else {
				newArr[i] = oldArr[i+1];
			}
		}

		return newArr;
	}
	
	/*
		动态扩容:
		两个明确:
			返回值类型: int[]
			形参列表:int[] arr , int num
	*/
	public static int[] add (int[] oldArr, int num) {
		//针对数组做非空校验
		if (oldArr == null) {
			return oldArr;
		}

		//新建一个长度比原来数组长度+1的数组
		int[] newArr = new int[oldArr.length + 1];

		//数据的复制,为了防止数组索引越界异常,遍历长度较短的那个数组
		for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}

		//将待添加元素存储到新数组的最后一位
		newArr[newArr.length - 1] = num;

		//将数组进行返回
		return newArr;
	}

	public static String printArr (int[] arr) {
		//针对数组做非空校验
		if (arr == null) {
			return "[]";
		}

		if (arr.length == 0) {
			return "[]";
		}

		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				str += arr[i] + "]";
			} else {
				str += arr[i] + ", ";
			}
		}

		return str;
	}
}
