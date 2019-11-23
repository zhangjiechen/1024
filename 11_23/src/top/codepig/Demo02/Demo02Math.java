package top.codepig.Demo02;
/*
public static double abs(double num):获取绝对值
public static double ceil(double num):向上取整
public static double floor(double num):向下取整
public static long round(double num):四舍五入
 */
public class Demo02Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(3.14));//绝对值
        //向上取整
        System.out.println(Math.ceil(3.0));
        System.out.println(Math.ceil(3.1));
        //向下取整
        System.out.println(Math.floor(3.14));
        //四舍五入
        System.out.println(Math.round(3.4));
    }

}

