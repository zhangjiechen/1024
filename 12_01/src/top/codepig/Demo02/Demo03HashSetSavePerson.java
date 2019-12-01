package top.codepig.Demo02;

import com.sun.deploy.perf.PerfRollup;

import java.util.HashSet;

public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 =  new Person("zjc",18);
        Person p2 =  new Person("zjc",18);
        Person p3 =  new Person("zjc",19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));//没有重写，比较的是地址值
        System.out.println(p1==p2);
        System.out.println(set);


    }
}
