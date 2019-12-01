package top.codepig.Demo02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
java.util.Set接口和java.util.List接口一样，同样继承自Collection接口，它与`Collection`接口中的方法基本一致，并没有对`Collection`接口进行功能上的扩充，只是比`Collection`接口更加严格了。与`List`接口不同的是，`Set`接口中元素无序，并且都会以某种规则保证存入的元素不出现重复。

Set集合有多个子类，这里我们介绍其中的java.util.HashSet、java.util.LinkedHashSet这两个集合。
  java.util.set接口 extends Collection接口
  特点：
    1.不允许存储重复的元素
    2.没有索引，没有带索引的方法，不能使用普通for循环遍历

java.util.HashSet集合 implements set接口
    HashSet特点：
        1.不允许存储重复的元素
        2.没有索引，没有带索引的方法，不能使用普通for循环遍历
        3.是一个无序的集合，存储元素和取出元素顺序有可能不一致
        4.底层是一个哈希表结构（查询速度非常快）
 */
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();//多态
        set.add(111);
        set.add(222);
        set.add(333);
        set.add(111);

        //使用增强for循环遍历
        /*for(Integer int1: set){
            System.out.println(int1);
        }*/
        Iterator<Integer> it = set.iterator();
        //使用迭代器遍历
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }

    }
}
