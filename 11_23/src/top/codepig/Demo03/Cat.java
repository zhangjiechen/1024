package top.codepig.Demo03;
/*
必须覆盖重写父类当中的抽象方法
 */
public class Cat extends Demo01Animal {
    @Override
    public  void eat(){
        System.out.println("猫吃鱼");
    }
}
