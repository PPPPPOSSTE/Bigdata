package com.ftrue.day10test.demo14;

/**
 * @ClassName: ExtendsDemo14
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 23:35
 * @Version: 1.0
 */
/**
 * 抽象的由来:
 *      1.父类是多个子类抽取出来共性属性和行为的集合,理论上这个类不能被外界所访问,实际上外界可以实例化对象
 *      2.当继承关系中的子类需要重写父类的方法时,最终执行的结果肯定是重写后的子类方法,
 *          理论上父类被重写的方法的方法体写出来没有任何意义,实际上如果不写编译报错
 *      3.当继承关系中的子类需要重写父类的方法时,多个子类都需要重复方法,但是难免忘记重写某个类中的方法,
 *          在执行的时候就会发生逻辑错误,理论上如果忘记重写某个类中的方法,最好编译报错提醒一下,实际上,想多了
 *
 * 抽象:
 *      抽象类和抽象方法
 *
 * 抽象类:抽象类也被称之为"加强版父类"
 *      格式:
 *          public abstract class 父类类名 {}
 *
 * 抽象方法:
 *      格式:
 *          修饰符 abstract 返回值类型 方法名 ();
 *
 * 抽象的注意事项(特点):
 *      1.抽象类不可以被实例化对象
 *      2.抽象类中可以含有构造器,但构造器不是用来实例化对象,而是创建子类对象时初始化父类成员的
 *      3.抽象类中可以没有抽象方法,但是含有抽象方法的类一定是抽象类
 *      4.抽象类的子类必须要重写抽象类中的所有抽象方法,除非该子类也是抽象类
 */
public class ExtendsDemo14 {
    public static void main(String[] args) {
        //创建猫对象
        Cat cat = new Cat("Tom", 2);
        cat.catchMouse();
        cat.eat();
        cat.sleep();

        System.out.println("==============================");

        //创建狗对象
		/*Dog dog = new Dog ("TwoHa",3);
		dog.lookHome();
		dog.eat();
		dog.sleep();*/

        System.out.println("==============================");

        //创建Animal对象
        //Animal animal = new Animal();
    }
}
