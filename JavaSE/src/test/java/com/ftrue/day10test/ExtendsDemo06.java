package com.ftrue.day10test;

/**
 * @ClassName: ExtendsDemo06
 * @Description:
 * @Author: zhangzhiqi on 2021/7/4 15:29
 * @Version: 1.0
 */
//方法覆写的注意事项：
//    1.必须保证父子类之间的方法名称相同，参数列表也相同。
//    2.子类方法的返回值类型 小于或等于 父类方法的返回值类型 （小于其实就是是它的子类）。
//    3.子类方法的权限必须 大于或等于 父类方法的权限修饰符。
//        public > protected > 缺省 > private

class Phone {
    public void sendMessage() {
        System.out.println("发短信");
    }

    public void call() {
        System.out.println("打电话");
    }

    public void showNum() {
        System.out.println("来电显示号码");
    }
}

//智能手机类
class NewPhone extends Phone {
    @Override
    public void sendMessage() {
        System.out.println("发短信");
        System.out.println("发彩信");
    }
}

public class ExtendsDemo06 {
    public static void main(String[] args) {
        // 创建子类对象
        NewPhone np = new NewPhone();
        // 调用父类继承而来的方法
        np.call();
        // 调用子类重写的方法
        np.showNum();

        np.sendMessage();
    }
}
