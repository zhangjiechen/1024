package top.codepig.Demo01;
/*
从Java 9开始，接口当中允许定义私有方法。
 */
public class Demo04Interface {
    public static void main(String[] args) {
        MyInterfacePrivateAImpl impl = new MyInterfacePrivateAImpl();
        impl.methodDefault1();
        impl.methodDefault2();
        System.out.println("====================");
        MyInterfacePrivateB.methodDefault1();
        MyInterfacePrivateB.methodDefault2();

    }
}
