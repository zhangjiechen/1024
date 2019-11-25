package top.codepig.Demo02;
/*
如何才能知道一个父类引用的对象，本来是什么子类
格式：
对象 instanceof 类名称
向下转型一定要进行instanceof判断，否则容易出现类转换异常ClassCastException
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        //animal.eat();
        System.out.println("===========");
        //如果希望调用子类特有方法，需要向下转型
        //判断一下父类引用animal本来是不是Dog
        /*if(animal instanceof Dog){
            Dog dog =(Dog)animal;
            dog.watchHouse();
        }
        if(animal instanceof Cat){
           Cat cat =(Cat)animal;
            cat.catchMouse();
        }*/
        giveMePet(new Dog());

    }
    public static void giveMePet(Animal animal){
        if(animal instanceof Dog){
            Dog dog =(Dog)animal;
            dog.watchHouse();
        }
        if(animal instanceof Cat){
            Cat cat =(Cat)animal;
            cat.catchMouse();
        }
    }
}
