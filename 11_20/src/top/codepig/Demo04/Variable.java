package top.codepig.Demo04;
/*
局部变量和成员变量
1. 定义的位置不一样
局部变量：在方法的内部
成员变量：在方法的外部，直接写在类当中
2. 作用范围不一样
局部变量：只有方法才当中可以使用，出了方法就不能再用
成员变量：整个类都可以通用
3. 默认值不一样
局部变量：没有默认值，如果要想使用，必须手动进行赋值
成员变量：如果没有赋值，会有默认值
4. 内存的位置不同
局部变量：位于栈当中
成员变量：位于堆当中（new对象）
5. 生命周期不同
局部变量：随着方法进栈而诞生，随着方法出栈而消失
成员变量：随着对象创建而诞生，随着对象对垃圾回收而消失
 */
public class Variable {
    String name;//成员变量
    public void methoneA(){
        int num = 20;//局部变量
        System.out.println(num);
        System.out.println(name);
    }
    public void methoneB(int param){//方法的参数就是局部变量
        System.out.println(param);//参数在被方法调用的时候，必然会被赋值
        int age;
//        System.out.println(age);//没有赋值的局部变量不能使用
//        System.out.println(num); //错误写法，局部变量出了方法就不能使用
        System.out.println(name);
    }
}
