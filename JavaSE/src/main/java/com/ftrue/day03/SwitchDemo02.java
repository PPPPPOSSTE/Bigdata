package com.ftrue.day03;

/**
 * @ClassName: SwitchDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 10:00
 * @Version: 1.0
 */
/*
	switch语句的注意事项:
		1.switch语句()中数据值的数据类型
			JDK4.0(包含)以前:
				int,同时还支持byte,short,char,但是内存中都会将其提成int类型
			JDK5.0(包含)以后,JDK6.0(包含)以前:
				枚举enum
			JDK7.0(包含)以后:
				字符串String
		2.switch语句中的default语句和if语句第三种格式中的else语句一样，都可以省略不写，但推荐写上
		3.switch语句中的case语句和default语句的位置可以随意调换，且不影响执行流程
		4.switch语句中的break关键字可以省略不写，但如果省略不写会出现case穿透的效果
*/
public class SwitchDemo02 {
    public static void main(String[] args) {
        int num = 5;

        switch (num) {
            default:
                System.out.println("他好,我也好");
                //break;
            case 1:
                System.out.println("你好");
                //break;
            case 2:
                System.out.println("我好");
                //break;
            case 3:
                System.out.println("大家好");
                //break;

        }
    }
}
