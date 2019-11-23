package top.codepig.Demo01;
/*
字符串常量池：程序当中直接写上双引号字符串，就在字符串常量池中

对于基本类型来说，==是进行数值的比较。
对于引用类型来说，==时进行【地址值】的比较
双引号直接写的在字符串常量池当中（堆），new的不在池当中
 */
public class Demo01StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        //System.out.println(str1.length());
        char[] charArray = {'a','b','c'};
        //System.out.println(charArray.length);
        String str3 = new String(charArray);
        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false
        System.out.println(str2==str3); //false
    }


}
