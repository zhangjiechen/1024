package top.codepig.Demo05;
/*
private关键字：
一旦使用private进行修饰，只能在本类中随意访问，【超出本类范围就不能再直接访问】
【间接访问private成员变量】，定义一对Getter和Setter方法
必须命名为setXxx或者是getXxx
对于Setter来说，不能有返回值，参数类型和成员变量对应
对于Getter来说，不能有参数，返回值类型和成员变量对应


对于基本类型中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变
 */
public class Person {
    //成员变量
    String name;
    private int age;
    private boolean male;
    public void getMale(boolean num){
        male = num;
    }
    public boolean isMale(){
        return male;
    }
    //这个成员方法，专门用于设置数据age
    public void setAge(int num){
        if(num>0&&num<100){
            age = num;
        }else{
            System.out.println("数据错误！");
        }
    }
    //这个成员方法，专门用于获取数据age
    public int getAge(){
        return age;
    }
    //成员方法
    public void show(){
        System.out.println("我叫" + name + "年龄："+ age);
    }
}
