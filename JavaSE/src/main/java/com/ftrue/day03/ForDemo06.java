package com.ftrue.day03;

/**
 * @ClassName: ForTest06
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 13:49
 * @Version: 1.0
 */
// 练习：打印符合要求的数字
/* 
    分析以下需求，并用代码实现：
    (1)打印出四位数字中个位+百位=十位+千位并且个位数为偶数，千位数为奇数的数字,并打印符合条件的数字的个数 
    (2)符合条件的数字,每行显示5个,用空格隔开,打印格式如下:
        1012 1034 1056 1078 1100
        1122 1144 1166 1188 1210
        //.......
    符合条件的数字总共有: 165个
 */
public class ForDemo06 {
    public static void main(String[] args) {
        //声明并初始化计数器
        int count = 0;

        //遍历所有的四位数
        for (int i = 1000; i < 10000 ; i++ ) {
            //求出每个四位数的个位,十位,百位,千位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;

            //根据题意进行数据的筛选
            if ((ge + bai == shi + qian) && (ge % 2 == 0) && (qian % 2 == 1)) {
                //计数器累加
                count++;

                //针对符合要求的数字每5个进行换行
                if (count % 5 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }


        //打印计数器
        System.out.println("符合条件的数字总共有: " + count + "个");
    }
}
