package top.codepig.Demo01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
请使用日期时间相关的API，计算出一个人已经出生了多少天。

**思路：**

1.获取当前时间对应的毫秒值

2.获取自己出生日期对应的毫秒值

3.两个时间相减（当前时间– 出生日期）
 */
public class Test {
    public static void main(String[] args) throws Exception {
        function();
    }
    public static void function() throws Exception {
    /*    System.out.println("请输入出生日期 格式 YYYY-MM-dd");
        // 获取出生日期,键盘输入
        String birthdayString = new Scanner(System.in).next();

        // 将字符串日期,转成Date对象
        // 创建SimpleDateFormat对象,写日期模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 调用方法parse,字符串转成日期对象
        Date birthdayDate = sdf.parse(birthdayString);
        // 获取今天的日期对象
        Date todayDate = new Date();
        // 将两个日期转成毫秒值,Date类的方法getTime
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long secone = todaySecond-birthdaySecond;
        if (secone < 0){
            System.out.println("还没出生呢");
        } else {
            System.out.println(secone/1000/60/60/24);
        }*/
        System.out.println("请输入出生日期 格式 YYYY-MM-dd");
        Scanner sca = new Scanner(System.in);
        String birthday = sca.next();//接收输入字符
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);
        //将两个日期转成毫秒值,Date类的方法getTime
        long birthdayTime = date.getTime();
        long todayTime = new Date().getTime();
        long time = todayTime-birthdayTime;
        if(time<0){
            System.out.println("还没出生");
        }else{
            System.out.println("出生了"+time/1000/(24*60*60)+"天");//1s=1000ms
        }

    }
}
