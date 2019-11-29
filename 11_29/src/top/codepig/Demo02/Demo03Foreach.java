package top.codepig.Demo02;

import java.util.ArrayList;
import java.util.Collection;

/*
增加for循环：底层使用的是迭代器，使用for循环的格式，简化了迭代器的书写
DCollection<E> extends Iteravle<E>:所有单列集合都可以使用增强for
增强for循环：用来遍历集合和数组
格式：
for（集合/数组的数据类型 变量名：集合名/数据名）{
        sout(变量名)；
    }
 */
public class Demo03Foreach {
    public static void main(String[] args) {
       // demo01();
        demo02();
    }
    public static void demo02(){
        Collection<String> coll = new ArrayList<>();
        coll.add("1111");
        coll.add("2222");
        coll.add("3333");
        for(String i:coll){
            System.out.println(i);
        }

    }
    public static void demo01(){
        int[] arr = {1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }

    }
}
