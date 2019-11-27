package top.codepig.Demo01;

import java.util.Date;

/*
构造方法：
    public Date(long date)
          分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。
    public Date()
          分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
java.util.Date;表示日期和时间的类
类Date表示特定的瞬间，精确到毫秒
可以对时间和日期进行计算
时间原点：1970年1月1日 00:00:00
把毫秒转换为日期：
1天 = 86400000毫秒
中国属于东八区：1970年1月1日 08:00:00
常用方法：
    public long getTime()
          返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
 */
public class Demo04Date {
    public static void main(String[] args) {
 //         System.out.println(System.currentTimeMillis());//获取当前系统时间经历了多少毫秒
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(0L);
        System.out.println(date1);
        System.out.println(new Date().getTime());//相当于System.currentTimeMillis()

    }
}
