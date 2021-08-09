package com.ftrue.day22exam.exercise02;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 8:34
 * @Version: 1.0
 */
//简单编程题  3题  5分/题
public class Exercise02 {
    //1、用循环控制语句打印输出：1+3+5+...+99=?的结果
    @Test
    public void test01() {
        /*//方法1：
        int sum = 0;
        for (int i = 1; i < 100; i += 2) {
            sum += i;
        }
        System.out.println("sum = " + sum);*/


        //方法2：
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }

    //2、请写一个冒泡排序，实现{5,7,3,9,2}从小到大排序
    @Test
    public void test02() {
        int[] arr = {5, 7, 3, 9, 2};

        //方法1：从左往右冒泡
        /*for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }*/

        //方法2：从右往左冒泡
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //3、编写方法实现：求某年某月某日是这一年的第几天
    //提示：闰年（1）能被 4整除不能被 100整除（2）能被 400整除
    @Test
    public void test03() throws ParseException {

        int sum = test003(2021, 7, 24);
        System.out.println("sum = " + sum);  //205


        /*String str1 = "2021年07月24日";
        String str2 = "2021-07-24";

        //TODO Date类可以实现题目的需求吗？
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(str1);

        //LocalDate类：public static LocalDate parse(CharSequence text)
        //此方法字符串参数格式有要求（）：yyyy-MM-dd     例如：2007-12-03
        LocalDate localDate = LocalDate.parse(str2);
        int dayOfYear = localDate.getDayOfYear();
        System.out.println(dayOfYear);  //205

        //LocalDate类：public static LocalDate parse(CharSequence text, DateTimeFormatter formatter)
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate1 = LocalDate.parse(str2, dateTimeFormatter1);
        int dayOfYear1 = localDate1.getDayOfYear();
        System.out.println(dayOfYear1);  //205

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate localDate2 = LocalDate.parse(str1, dateTimeFormatter2);
        int dayOfYear2 = localDate1.getDayOfYear();
        System.out.println(dayOfYear2);  //205


        //LocalDateTime类：public static LocalDateTime parse(CharSequence text)
        //此方法字符串参数格式有要求（）：yyyy-MM-ddThh:mm:ss     例如：2007-12-03T10:15:30
        String str3 = "2021-07-24T10:15:30";
        LocalDateTime parse = LocalDateTime.parse(str3);
        int dayOfYear3 = parse.getDayOfYear();
        System.out.println(dayOfYear3);  //205

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd T HH-mm-ss");
        LocalDateTime localDateTime = LocalDateTime.parse(str3, dateTimeFormatter);
        int dayOfYear4 = localDateTime.getDayOfYear();
        System.out.println(dayOfYear4);*/

    }

    public int test003(int year, int month, int day) {
        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = day;
        for (int i = 0; i < month - 1; i++) {
            sum += daysOfMonth[i];
        }

        if (month > 2) {
            if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
                sum++;
            }
        }

        return sum;
    }

    //4、通项公式如下：f(n)=n + (n-1) + (n-2) + .... + 1，其中n是大于等于5并且小于10000的整数，例如：f(5) = 5 + 4 + 3 + 2 + 1，f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，请用非递归的方式完成方法long f( int n)的方法体。
    @Test
    public void test04() {
        System.out.println(f(5));  //15
        System.out.println(f(10));  //55
    }

    public long f(int n) {
        int sum = 0;
        if (n % 2 == 0) {
            sum = (n + 1) * (n / 2);
        } else {
            sum = (n + 2) * (n / 2) + 1;
        }
        return sum;
    }

    //5、求1+2！+3！+...+20！的和
    @Test
    public void test05() {
        //方法1：
        /*long sum = 0;
        for (int i = 1; i < 20; i++) {
            sum += method05(i);
        }
        System.out.println(sum);  //128425485935180313*/

        //方法2：
        long sum = 0;
        for (int i = 1; i < 20; i++) {
            long temp = 1;
            for (int j = 1; j <= i; j++) {
                temp *= j;
            }
            sum += temp;
        }
        System.out.println("sum = " + sum);
    }

    public long method05(int n) {
        if (n == 1) {
            return 1L;
        } else {
            return n * method05(n - 1);
        }
    }

    //6、输出一个如下图形，一共有n行，第n行有2n-1个*，完成方法public void printStar(int n)的方法体
    @Test
    public void test06() {
        printStar(5);
    }

    public void printStar(int n) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //7、请编写代码使用把一个字符串反转，例如：hello1234，反转后：4321olleh。
    @Test
    public void test07() {
        //方法1：
        String str = "hello1234";

        StringBuilder stringBuilder = new StringBuilder(str);

        StringBuilder reverse = stringBuilder.reverse();

        System.out.println(reverse.toString());
    }

    //8、编写代码实现，从一个标准url里取出文件的扩展名，尽可能高效。
    public void test08() {

    }

    //9、有一个字符串String abc = “342567891”，请写程序将字符串abc进行升序，可以使用JDK API中的现有的功能方法。
    @Test
    public void test09() {
        String abc = "342567891";

        char[] chars = abc.toCharArray();

        Arrays.sort(chars);

        String str = String.valueOf(chars);

        System.out.println(str);
    }

    //10、编写一个懒汉式单例设计模式
    @Test
    public void test10() {

    }


    //11、请编写一个饿汉式单例设计模式
    public void test11() {

    }

    //12、补充如下枚举类型的代码，使得如下代码达到运行效果
    //单词提示：monday,tuesday,wednesday,thursday,friday,saturday,sunday
    @Test
    public void test12() {

    }

    //13、写一段代码实现在遍历ArrayList时移除一个元素，例如：”java”？
    @Test
    public void test13() {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("java");


        /*ListIterator<String> listIt = list.listIterator();
        while (listIt.hasNext()) {
            String str = listIt.next();
            System.out.println(str);
            if ("java".equals(str)) {
                listIt.remove();
            }
        }*/
        //System.out.println(list);
        System.out.println("==================");


        /*Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
            if ("java".equals(str)) {
                it.remove();
            }
        }
        System.out.println(list);*/
        System.out.println("==================");

    }

    //14、把如下信息添加到Map中，并遍历显示，请正确指定泛型
    @Test
    public void test14() {
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("北京市", Arrays.asList("北京市"));
        map.put("海南省", Arrays.asList("海口市", "三亚市"));
        map.put("浙江省", Arrays.asList("绍兴市", "温州市", "湖州市", "嘉兴市", "台州市"));

        //遍历方式1：
        Set<String> set = map.keySet();
        for (String str : set) {
            List<String> list = map.get(str);
            System.out.println(str + ":");
            for (String s : list) {
                System.out.println("\t" + s);
            }
        }
        System.out.println("=================================");

        //遍历方式2：
        Set<Map.Entry<String, List<String>>> entrySet = map.entrySet();
        for (Map.Entry<String, List<String>> entry : entrySet) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println(key + ":");
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }
    }

    //15、完成在如下Map中查询城市信息
    public void test15() {

    }

    //16、请编写代码读取一个项目根目录下info.properties文件
    //里面的内容有user=atguigu等，请获取user的value中，并在控制台打印
    @Test
    public void test16() throws IOException {
        //方法1：通过Properties类的load方法实现
        Properties properties = new Properties();
        properties.load(new FileInputStream("file\\pro.properties"));
        String user = properties.getProperty("user");
        System.out.println("user = " + user);
        System.out.println("===========================");

        //方法2：通过ClassLoader类的实例方法getResourceAsStream()
        //文件相对路径：与此类所在包的根包目录同层级，此案例是与com目录同层级
        InputStream inputStream1 = ClassLoader.getSystemClassLoader().getResourceAsStream("pro.properties");
        properties.load(inputStream1);
        String user1 = properties.getProperty("user");
        System.out.println("user1 = " + user1);
        System.out.println("================================");

        //方法3：通过Class类的实例方法getResourceAsStream()
        //文件相对路径：与此类所在包的目录同层级，此案例是与exercise02目录同层级
        InputStream inputStream2 = Exercise02.class.getResourceAsStream("pro.properties");
        properties.load(inputStream2);
        String user2 = properties.getProperty("user");
        System.out.println("user2 = " + user2);
        System.out.println("================================");

        //方法4：通过Class类的静态方法getSystemResourceAsStream()
        //文件相对路径：与此类所在包的目录同层级，此案例是与exercise02目录同层级
        InputStream inputStream3 = ClassLoader.getSystemResourceAsStream("pro.properties");
        properties.load(inputStream3);
        String user3 = properties.getProperty("user");
        System.out.println("user3 = " + user3);
        System.out.println("================================");
    }

    //17、请编写代码把一个GBK的文本文件内容读取后存储到一个UTF-8的文本文件中。
    public void test17() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("file\\gbk.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("file\\utf-8.txt"), "UTF-8");

        int len;
        char[] chars = new char[8192];
        while ((len = isr.read(chars)) != -1) {
            osw.write(chars, 0, len);
        }

        osw.close();
        isr.close();
    }

    //18、用实现Runnable接口的方式，启动一个线程完成在线程中打印1-100的数字
    @Test
    public void test18() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.print(i + " ");
                }

            }
        };

        Thread t = new Thread(run);

        t.start();
    }

}
