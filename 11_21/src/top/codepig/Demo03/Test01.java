package top.codepig.Demo03;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person one = new Person("zjc",21);
        Person two = new Person("mdl",22);
        Person three = new Person("gsq",20);
        list.add(one);
        list.add(two);
        list.add(three);
        for (int i = 0; i < list.size(); i++) {
           Person per =  list.get(i);
            System.out.println("姓名是：" + per.getName() + "年龄是：" + per.getAge());
        }
    }


}
