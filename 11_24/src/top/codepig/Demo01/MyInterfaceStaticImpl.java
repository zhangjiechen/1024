package top.codepig.Demo01;

public class MyInterfaceStaticImpl implements MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是实现类静态方法"); //不是重写方法，静态方法不能重写
    }
}
