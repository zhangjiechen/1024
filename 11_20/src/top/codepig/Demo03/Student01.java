package top.codepig.Demo03;
/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象
1. 导包：也就是指出需要使用的类，在什么位置
import 包名称.类名称；
对于和当前类属于同一个包的情况，可以省略导包语句不写
2. 创建，格式
类名称 对象名 = 类名称（）；
3. 使用，分为两种情况；
使用成员变量： 对象名.成员变量名
使用成员方法： 对象名.成员方法名（参数）
注意事项：
如果成员变量没有进行复制，那么将会有一个默认值
 */
public class Student01 {
    public static void main(String[] args) {
        //1. 导包

        //2. 创建
        //根据Student类创建名为stu的对象
        Student stu = new Student();
        //3.使用
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("==============");
        stu.name = "张洁晨";
        stu.age = 22;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("==============");
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
