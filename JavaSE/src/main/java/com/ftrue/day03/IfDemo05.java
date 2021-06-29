package com.ftrue.day03;

/**
 * @ClassName: IfDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 8:51
 * @Version: 1.0
 */
/*
	通过指定考试成绩，判断学生等级
		- 90-100      优秀
		- 80-89        好
		- 70-79        良
		- 60-69        及格
		- 60以下    不及格
*/
public class IfDemo05 {
    public static void main(String[] args) {
        //声明初始化考试成绩
        int score = 105;

        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score <= 89) {
            System.out.println("好");
        } else if (score >= 70 && score <= 79) {
            System.out.println("良");
        } else if (score >= 60 && score <= 69) {
            System.out.println("及格");
        } else if (score >= 0 && score <= 59) {
            System.out.println("不及格");
        } else {
            System.out.println("考试成绩非法");
        }
    }
}
