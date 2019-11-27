package top.codepig.Demo01;

import java.util.Objects;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    /*
    我们需要重写equals方法
    但是有一个问题：
    这个时候涉及到多态问题
    多态的弊端：无法使用该子类特殊有的方法属性
    结局方法：我们可以通过向下转型（强制类型转换）
    Person p = (Person)obj;
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass() 使用反射技术，判断o是否是Person类型，等效于o instanceof Person
        //// 如果参数为空，或者类型信息不一样，则认为不同
        if (o == null || getClass() != o.getClass()) return false;
        //// 转换为当前类型
        Person person = (Person) o;
        //要求基本类型相等，并且将引用类型交给java.util.Objects类的equals静态方法取用结果
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    /*public boolean equals(Object obj){
            //增加一次判断，传递的参数obj如果是this本身，直接返回true，提高程序效率
            if(obj==this){
                return true;
            }
            //增加一次判断，传递的参数obj如果是null，直接返回false，直接返回false，提高程序效率
            if(obj==null){
                return false;
            }
            //增加一次判断，防止类型转换异常ClassCastException
            if(obj instanceof Person){
                Person p = (Person)obj;
                //比较两个对象的属性this(p1),另外一个是obj（p2）
                boolean b =  this.name.equals(p.name) && this.age == p.age;
            }

           return false;
        }*/
        @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public Person() {
    }
}
