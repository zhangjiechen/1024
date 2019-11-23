package top.codepig.Demo03;
/*
抽象方法： 就是加上abstract杆件自，然后去掉大括号，直接分号结束
抽象类：抽象方法所在的类必须是抽象类。在class加上abstract
 */
public abstract class Demo01Animal {
    //这是一个抽象方法,抽象方法没有方法体
    public abstract void eat();
    //构造方法
    public Demo01Animal(){
        System.out.println("父类构造方法执行！");
    }
    //普通的成员方法
    public void normalMethod(){
        System.out.println("普通的成员方法");
    }
}
