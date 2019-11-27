package top.codepig.Demo01;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.equals(s2));
        System.out.println("==========");
        String s3 = "abc";
        String s4 = null;
  //      System.out.println(s4.equals(s3));NullPointerException null是不能调用方法的，会抛出空指针异常
        System.out.println(s3.equals(s4));
        /*
        Objects类的equals方法：防止空指针异常
        源码：
        public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }
         */
        System.out.println(Objects.equals(129,123));
        System.out.println(Objects.equals(s4,s3));
    }
}
