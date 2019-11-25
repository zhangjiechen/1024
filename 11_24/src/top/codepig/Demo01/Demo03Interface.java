package top.codepig.Demo01;
/*
注意事项：不能通过接口实现类的对象来调用接口中的静态方法
正确用法：通过接口名称，直接调用其中的静态方法。
格式：
接口名称.静态方法名（参数）；
 */
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

       // impl.methodStatic(); //错误写法
        MyInterfaceStatic.methodStatic();
    }

}
