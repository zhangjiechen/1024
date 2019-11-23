package top.codepig.Demo02;
/*
==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：

public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同的才会返回ture，否则返回false
注意事项：
1. 任何对象都能用Object进行接收
2. equals方法具有对称性，也就是a.eauals(b)和b.equals(a)效果一样
3 如果比较双方一个常量一个变量，推荐把常量字符串写在前面
"abc".equlas(str)

public boolean equalsIgnoreCase(String str):忽略大小写，进行内容比较
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] arr = {'H','e','l','l','o'};
        String str3 = new String(arr);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));//不推荐
        System.out.println("Hello".equals(str1));
        String str4 = "hello";
        //System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));
        String str = null;
        System.out.println("hello".equals(str));
       // System.out.println(str.equals("hello"));//不推荐 空指针异常NullPointerException
        //只有英文区分大小写，其他都不区分
        System.out.println("一".equalsIgnoreCase("壹"));

    }
}
