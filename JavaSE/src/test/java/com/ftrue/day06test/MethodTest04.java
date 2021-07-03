package com.ftrue.day06test;

/**
 * @ClassName: MethodTest04
 * @Description:
 * @Author: zhangzhiqi on 2021/7/2 21:11
 * @Version: 1.0
 */
public class MethodTest04 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        System.out.print("添加前:");
        printArr(arr);
        System.out.print("添加后:");
        int[] addArr = add(arr, 44);
        printArr(addArr);
        System.out.print("删除前:");
        printArr(arr);
        System.out.print("删除后:");
        int[] removeArr = remove(arr, 2);
        printArr(removeArr);
        System.out.print("插入前:");
        printArr(arr);
        int[] insertArr = insert(arr, 2, 44);
        System.out.print("插入后:");
        printArr(insertArr);
    }

    /*
    在数组指定索引位置插入一个元素
    两个明确:
    返回值类型: int[]
    形参列表:
    int[] arr 待插入的数组
    int index 待插入数组的索引位置
    int num 待插入数组中的元素
    */
    public static int[] insert(int[] arr, int index, int num) {
        // 为了防止空指针异常,针对数组进行非空判断
        if (arr == null) {
            return arr;
        }
        if (index < 0 || index >= arr.length) {
            System.out.println("非法索引,无法插入");
            return arr;
        }
        if (arr.length == 0) { //{}
            int[] newArr = {num};
            return newArr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i + 1] = arr[i];
            }
        }
        newArr[index] = num;
        return newArr;
    }

    /*
    删除指定索引位置上的元素
    两个明确:
    返回值类型: int[]
    形参列表: int[] arr 待删除的数组
    int index 待删除索引位置
    */
    public static int[] remove(int[] arr, int index) {
        // 为了防止空指针异常,针对数组进行非空判断
        if (arr == null) {
            return arr;
        }
        // 如果数组的长度为0
        if (arr.length == 0) {
            System.out.println("数组长度为0,无法删除元素");
            return arr;
        }
        if (index < 0 || index >= arr.length) {
            System.out.println("非法索引,无法删除");
            return arr;
        }
        // 如果数组的长度为1
        if (arr.length == 1) {
            return new int[]{};
        }
        //创建一个新数组
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        return newArr;
    }

    /*
    数组的扩容:
    两个明确:
    返回值类型: int[]
    形参列表: int[] arr 待添加的数组
    int num 待添加到数组的元素
    */
    public static int[] add(int[] arr, int num) {
        // 为了防止空指针异常,针对数组进行非空判断
        if (arr == null) {
            return null;
        }
        // 创建新数组,新数组的长度比参数数组长度+1
        int[] newArr = new int[arr.length + 1];

        // 为了防止索引越界异常,遍历旧数组
        for (int i = 0; i < arr.length; i++) {
            // 将参数数组里面的数据复制到新的数组里面
            newArr[i] = arr[i];
        }
        // 将参数num添加到新数组的最后一位
        newArr[newArr.length - 1] = num;
        // 将新数组返回给main方法
        return newArr;
    }

    public static void printArr(int... arr) {
        // 为了防止空指针异常,针对数组进行非空判断
        if (arr == null) {
            return;
        }
        // 如果数组的长度为0的话,下面代码不执行
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
