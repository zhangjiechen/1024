package top.codepig.Demo02;

import top.codepig.Demo03.MyOuter;

/*
注意：内用外，随意访问；外用内，需要内部类对象
分类：
1、成员内部类
2、局部内部类（）
使用成员内部类
1.间接方法：在外部类的方法当中，使用内部类
2.直接方法：
【外部类名称.内部类名称 对象名 = new 外部类名称（）.new 内部类名称（）;】
 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        /*Body body = new Body();
        //通过外部类的对象，调用外部类的方法，里面间接使用内部类Heart
        body.methodBody();
        System.out.println("==============");
        Body.Heart heart = new Body().new Heart();
        heart.beat();*/
        /*Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();*/
        MyOuter outer = new MyOuter();
        outer.methodOuter();
    }
}
