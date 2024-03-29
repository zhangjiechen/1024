package top.codepig.Demo01;
/*
接口定义抽象方法：
public abstract 返回值类型 方法名称（参数列表）；

注意事项：
1、接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2、关键字修饰符，可以选择性省略
3、方法的三要素，可以随意定义
 */
public interface MyInterfaceAbstract {
    public abstract void methodAbs1();
    abstract void methodAbs2();
    public  void methodAbs3();
    void methodAbs4();
}
