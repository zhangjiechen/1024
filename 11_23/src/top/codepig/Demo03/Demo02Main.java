package top.codepig.Demo03;
/*
如何使用抽象类和抽象方法：
1. 不能直接创建new抽象类对象
2. 必须用一个子类类继承抽象父类
3. 子类必须覆盖重写抽象父类当中所有的抽象方法。
覆盖重写（实现）：子类去掉抽象方法的abstract关键字，然后补上方法体
4.创建子类对象进行使用


 */
public class Demo02Main {
    public static void main(String[] args) {
//        Demo01Animal animal = new Demo01Animal();错误写法
        new Cat().eat();
          Cat cat = new Cat();
         cat.eat();
        System.out.println("=======================");
         Dog dog = new Dog();
         dog.eat();
    }
}
