package top.codepig.Demo02;


import java.util.Arrays;

/*
    java.lang.StringBuilder:字符串缓冲区，可以提高字符串的效率
    构造方法：
        StringBuilder()
          构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符
        StringBuilder(CharSequence seq)
          构造一个字符串生成器，它包含与指定的 CharSequence 相同的字符。
     常用方法：
        public  StringBuilder append():可以添加任意类型字符串，返回当前对象
          将 boolean 参数的字符串表示形式追加到序列。
        public  String toString():
          返回此序列中数据的字符串表示形式。
          String -> StringBuilder :可以通过调用StringBuilder的构造方法
          StringBuilder -> String ：可以通过toString方法
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        String str = "aaa";
        StringBuilder bu = new StringBuilder(str);
        bu.append("bbb");
        System.out.println("bu:"+bu);
        String s = bu.toString();
        System.out.println("s:"+s);
        //无参构造
   /*     StringBuilder str1 = new StringBuilder();
        System.out.println(str1);
        StringBuilder str2 = new StringBuilder("aaaa");
        System.out.println(str2);
        //append方法返回的是this
        System.out.println(str1.append("aaaa"));
        System.out.println(str1==str1.append("111"));
        System.out.println(str1==str1.append(true));
        System.out.println(str1==str1.append(1.1));
        System.out.println(str1==str1.append(111));
        System.out.println("aaaa".toUpperCase().toLowerCase());*/
   
    }
}
