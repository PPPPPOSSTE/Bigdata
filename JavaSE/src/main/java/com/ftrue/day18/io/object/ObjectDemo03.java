package com.ftrue.day18.io.object;

import java.util.HashMap;

/**
 * @ClassName ObjectDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 15时44分
 * @Version 1.0
 *
 * 对象流的注意事项:
 *      1.只能将支持 java.io.Serializable 接口的对象写入流中
 *      2.如果在实际应用中,传递多个对象时候,推荐将多个对象存储到集合中,直接序列化集合对象
 *      3.实现序列化和反序列化的过程中,实现序列化接口的类不能发生任何改动,否则InvalidClassException
 *      4.实现序列化和反序列化的过程中,序列化文件不能发生任何改动,否则StreamCorruptedException
 *      5.transient关键字,瞬态的,有些对象的属性不想被实现序列化的时候,需要transient进行修饰
 *          格式:修饰符 transient 数据类型 变量名
 */
public class ObjectDemo03 {
	public static void main(String[] args) {

	}

}
