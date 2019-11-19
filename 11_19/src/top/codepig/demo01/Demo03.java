package top.codepig.demo01;

public class Demo03 {
    public static void main(String[] args) {
        method1(10,20);
        System.out.println("-------------");
        method2();
    }
    public static void method1(int a,int b){//有参数
        System.out.println("结果是：" + a*b);
    }
    public static void method2(){//无参数
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!" + i);
        }
    }
}
