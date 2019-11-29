package top.codepig.Demo02;

import java.util.ArrayList;
import java.util.Collection;

/*

集合按照其存储结构可以分为两大类，分别是单列集合`java.util.Collection`和双列集合`java.util.Map`

**Collection**：单列集合类的根接口，用于存储一系列符合某种规则的元素，它有两个重要的子接口，分别是`java.util.List`和`java.util.Set`。其中，`List`的特点是元素有序、元素可重复。`Set`的特点是元素无序，而且不可重复。
* `List`接口的主要实现类有`java.util.ArrayList`和`java.util.LinkedList`，
* `Set`接口的主要实现类有`java.util.HashSet`和`java.util.TreeSet`。
java.util.Collection
Collection是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合。方法如下：

* `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
* `public void clear()` :清空集合中所有的元素。
* `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
* `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
* `public boolean isEmpty()`: 判断当前集合是否为空。
* `public int size()`: 返回集合中元素的个数。
* `public Object[] toArray()`: 把集合中的元素，存储到数组中。
 */
public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();//多态，左父右子
        System.out.println(col);//重写了toString方法
        col.add("zzz");
        col.add("zzz");
        col.add("zzz");
        System.out.println(col);
        col.clear();
        System.out.println(col);
        col.add("zzz");
        col.add("jjj");
        col.add("ccc");
        col.add("zzz");
        col.add("zzz");
        col.remove("zzz");
        System.out.println(col);
        System.out.println(col.remove("111"));
        System.out.println(col.contains("zzz"));
        System.out.println(col.isEmpty());
        System.out.println(col.size());
        Object[] array = col.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }
}
