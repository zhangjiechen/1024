package top.codepig.Demo06;
/*
构造方法是专门用来创建对象的方法。当我们通过关键字new来创建对象时，其实就是在调用构造方法
格式：
public 类名称（参数列表）{
    方法体
}
注意事项：
1. 构造方法的名称必须和所在类名称完全一样，大小写也必须一样
2. 构造方法不要写返回值类型，连void都不写
3. 构造方法不能return一个具体的返回值
4. 如果没有编写任何构造方法，那么编译器将会默认一个构造方法。没有参数、方法体什么事情都不做
5. 一旦编写了至少一个构造方法，那么不在有默认的构造方法
6. 构造方法也可以进行重载
重载：方法名称相同，参数列表不同
*/
public class Student {
    //成员变量
    private String name;
    private int age;
    //无参数的构造方法
    public Student(){
        System.out.println("无参构造方法执行啦！");
    }
    //全参数构造方法
   public Student(String name,int age){
       this.name = name;
       this.age = age;
       System.out.println("全参构造方法执行啦！");
   }
   //Getter  Setter
   public void setName(String name){
        this.name = name;
   }
   public String getName(){
        return name;
   }
   public void setAge(int age){
        this.age = age;
   }
   public int getAge(){
        return age;
   }

}
