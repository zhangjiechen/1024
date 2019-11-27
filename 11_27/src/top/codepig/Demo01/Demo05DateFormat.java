package top.codepig.Demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DataFormat:是日期/时间格式化子类的抽象类
作用:
    格式化(日期 -> 文本）、解析（文本-> 日期）和标准化
    DateFormat是一个抽象类，不能直接创建对象,可以使用DateFormate的子类
成员方法：
      public final String format(Date date):将一个 Date 格式化为日期/时间字符串。
     使用步骤：
     1.创建SimpleDateFormat对象，构造方法中传递指定的模式
     2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定格式，把Date日期格式化为符合模式的字符串
      public Date parse(String source): 从给定字符串的开始解析文本，以生成一个日期。该方法不使用给定字符串的整个文本。
      使用步骤：
      1.创建SimpleDateFormat对象，构造方法中传递指定的模式
      2.调用SimpleDateFormat对象中的方法parse，把符合模式的字符串，解析为Date日期
      注意：
      public Date parse(String souce) throws ParseException
子类：SimpleDateFormat
SimpleDateFormat(String pattern)
          用给定的模式和默认语言环境的日期格式符号构造
 */
public class Demo05DateFormat {
    public static void main(String[] args) throws ParseException {
        //1、创建SimpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        System.out.println(date);//Wed Nov 27 13:47:15 CST 2019
        //2、调用SimpleDateFormat对象中的方法format，按照构造方法中指定格式，把Date日期格式化为符合模式的字符串
        System.out.println(sdf.format(date));//2019年11月27日 13时47分15秒
 //       System.out.println(new SimpleDateFormat("yyyy年MM月DD日 HH时mm分ss秒").format(new Date()));通过匿名对象转换
        System.out.println("====================");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date1 = sdf1.parse("2019年11月27日 14时03分35秒");
        System.out.println(date1);
    }
}
