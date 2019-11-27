package top.codepig.Demo01;

import java.util.Calendar;
/*
Calendar是一个抽象类，不能直接创建对象，但是里面有一个静态的getInstance方法，返回类型为Calendar类的子类对象
static Calendar getInstance(){
    //...
}使用默认时期和语言环境获得一个日历


根据Calendar类的API文档，常用方法有：

public int get(int field)：返回给定日历字段的值。
public void set(int field, int value)：将给定的日历字段设置为给定值。
public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
 */
public class Demo06Calendar {
    public static void main(String[] args) {
      /*  Calendar c = Calendar.getInstance();//多态  日历格式
        System.out.println(c);*/
        Calendar c = Calendar.getInstance();
        //public int get(int field)：返回给定日历字段的值。
        System.out.println("现在的年份："+c.get(Calendar.YEAR));
        System.out.println("现在的月份："+(c.get(Calendar.MONTH)+1));//西方月份是0-11，所以要+1
        //public void set(int field, int value)：将给定的日历字段设置为给定值。
        c.set(Calendar.YEAR,2020);
        //同时设置年月日 利用了方法的重载
        c.set(2020,11,27);
        System.out.println("现在的年份："+c.get(Calendar.YEAR));
        System.out.println("现在的月份："+(c.get(Calendar.MONTH)));
        //public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        c.add(Calendar.MONTH,-2);
        c.add(Calendar.YEAR,-1);
        System.out.println("现在的年份："+c.get(Calendar.YEAR));
        System.out.println("现在的月份："+(c.get(Calendar.MONTH)));
       // public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
        System.out.println(c.getTime());//把日历转换为日期
    }


}
