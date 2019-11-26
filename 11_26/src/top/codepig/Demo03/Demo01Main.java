package top.codepig.Demo03;
/*
public > protected > (default) > private
定义一个类的时候，权限修饰符规则：
1.外部类: public  / (default)
2.成员内部类 public/protected/ (default)/private
3.局部内部类 什么都不能写
 */
public class Demo01Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.methodOuter();
    }
}
