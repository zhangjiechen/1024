package top.codepig.Demo01;
/*
`java.util.List`接口继承自`Collection`接口，是单列集合的一个重要分支

List接口特点：

1. 它是一个元素存取有序的集合。例如，存元素的顺序是11、22、33。那么集合中，元素的存储就是按照11、22、33的顺序完成的）。
2. 它是一个带有索引的集合，通过索引就可以精确的操作集合中的元素（与数组的索引是一个道理）。
3. 集合中可以有重复的元素，通过元素的equals方法，来比较是否为重复的元素。
List作为Collection集合的子接口，不但继承了Collection接口中的全部方法，
而且还增加了一些根据元素索引来操作集合的特有方法，如下：
- `public void add(int index, E element)`: 将指定的元素，添加到该集合中的指定位置上。
- `public E get(int index)`:返回集合中指定位置的元素。
- `public E remove(int index)`: 移除列表中指定位置的元素, 返回的是被移除的元素。
- `public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
    注意：操作索引的时候，一定要注意越界异常
    IndexOutOfBoundsException  索引越界异常
    ArrayIndexOutOfBoundsException  数组索引越界异常
    StringIndexOutOfBoundsException  字符串索引越界异常
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//多态
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("11");
        System.out.println(list);//输出的不是地址，所以重写了toString
        //public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上
        list.add(1,"aaa");
        System.out.println(list);
        //public E remove(int index): 移除列表中指定位置的元素，返回的是被移除的元素。
        String str = list.remove(1);
        System.out.println(str);
        System.out.println(list);
        //list.remove(11);//   IndexOutOfBoundsException  索引越界异常
        //public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元素
        list.set(0,"aaa");
        System.out.println(list);
        //public E get(int index)`:返回集合中指定位置的元素。
        System.out.println("======================");
        //普通的for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("======================");
        //迭代器输出
        Iterator<String> it =list.iterator();
        while(it.hasNext()){
            String str1 = it.next();
            System.out.println(str1);
        }
        System.out.println("======================");
        //增强for循环
        for(String str2:list){
            System.out.println(str2);
        }
    }
}
