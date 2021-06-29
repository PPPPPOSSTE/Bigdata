package com.ftrue.day03;

/**
 * @ClassName: ForTest5
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 9:28
 * @Version: 1.0
 */
/*
 * 练习：打印所有的水仙花数并统计个数
 *
 * 分析：
 * 		什么是水仙花数呢?
 * 			所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
 *			举例：153就是一个水仙花数。
 *			153 = 1*1*1 + 5*5*5 + 3*3*3
 *
 *		1.三位数其实就告诉了我们水仙花数的范围
 *			100-999
 *		2.如何获取一个数据的每一个位上的数呢?
 *			举例：我有一个数据153，请问如何获取到个位，十位，百位
 *			个位：153%10 = 3;
 *			十位：153/10%10 = 5;
 *			百位：153/10/10%10 = 1;
 *			千位：...
 *			万位：...
 *		3.让每个位上的立方和相加，并和该数据进行比较，如果相等，就说明该数据是水仙花数，在控制台输出
 */
public class ForDemo05 {
    public static void main(String[] args) {
        //声明并初始化水仙花数的个数
        int count = 0;

        //遍历所有的三位数
        for (int i = 100; i < 1000 ; i++) {
            //获取每个三位的个位,十位,百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            //根据水仙花数的规则进行数据的筛选
            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                //如果判断为true
                //计数器累加
                count++;
                //打印符合要求的水仙花数
                System.out.println(i);
            }
        }

        //打印计数器
        System.out.println("count = " + count);
    }
}
