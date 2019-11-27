package top.codepig.Demo01;
/*
默认地址比较

如果没有覆盖重写equals方法，那么Object类中默认进行`==`运算符的对象地址比较，只要不是同一个对象，结果必然为false。
 */
public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴",15);
        Person p2 = new Person("迪丽热巴",15);
       /* boolean result = p1.equals(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(result);
        System.out.println("=================");
        p1=p2;
        result = p1.equals(p2);
        System.out.println(result);*/
        System.out.println("===================");
        //重写了equals方法
        System.out.println(p1.equals(p2));
    }
}
