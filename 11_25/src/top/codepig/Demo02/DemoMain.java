package top.codepig.Demo02;
/*
向上转型一定是安全的
对象一旦向上转型为父类，就无法调用子类原本的特有方法

解决方案：用对象向下转型【还原】
 */
public class DemoMain {
    public static void main(String[] args) {
        //对象向上转型。就是父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();
//        animal.catchMouse();
        //Cat cat = new Cat();
       /* cat.catchMouse();
        cat.eat();*/
       Cat cat = (Cat)animal;
       cat.eat();
       cat.catchMouse();
        System.out.println("=================");
        //ClassCastException:类转换报错
        Dog dog =(Dog)animal;
        int num = (int)1.5;
    }
}
