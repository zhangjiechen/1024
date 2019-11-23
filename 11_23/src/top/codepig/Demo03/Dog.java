package top.codepig.Demo03;

public class Dog extends Demo01Animal{
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public Dog(){
        System.out.println("子类构造方法执行!");
    }
}
