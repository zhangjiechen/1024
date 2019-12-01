package top.codepig.Demo01;

import java.util.LinkedList;

/*
`java.util.ArrayList`集合数据存储的结构是数组结构。元素增删慢，查找快，由于日常开发中使用最多的功能为查询数据、遍历数据，所以`ArrayList`是最常用的集合。
许多程序员开发时非常随意地使用ArrayList完成任何需求，并不严谨，这种用法是不提倡的。


java.util.LinkedList implements List接口
java.util.LinkedList集合数据存储的结构是链表结构。方便元素添加、删除的集合。
注意事项：不能使用多态创建
    特点：底层是一个链表结构。增删快，查询慢
    方法：
    * `public void addFirst(E e)`:将指定元素插入此列表的开头。
    * `public void addLast(E e)`:将指定元素添加到此列表的结尾。
    * `public E getFirst()`:返回此列表的第一个元素。
    * `public E getLast()`:返回此列表的最后一个元素。
    * `public E removeFirst()`:移除并返回此列表的第一个元素。
    * `public E removeLast()`:移除并返回此列表的最后一个元素。
    * `public E pop()`:从此列表所表示的堆栈处弹出一个元素。
    * `public void push(E e)`:将元素推入此列表所表示的堆栈。
    * `public boolean isEmpty()`：如果列表不包含元素，则返回true。
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
       // demo01();
        // demo02();
        demo03();

    }

    private static void demo03() {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //public E removeFirst()`:移除并返回此列表的第一个元素。
        String s = list.removeFirst();
        System.out.println(s);
        //public E removeLast()`:移除并返回此列表的最后一个元素。
        String s1 = list.removeLast();
        System.out.println(s1);
        //public E pop()`:从此列表所表示的堆栈处弹出一个元素。
        String pop = list.pop();//该方法相当于removeFirst
        System.out.println(pop);
    }

    private static void demo02() {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");
        list.clear();// 再次使用getFirst时会发生NoSuchElementException
        if(!list.isEmpty()){
            //public E getFirst():返回此列表的第一个元素。
            String first = list.getFirst();
            System.out.println(first);
            //public E getLast():返回此列表的最后一个元素。
            String last = list.getLast();
            System.out.println(last);
        }

    }

    public static void demo01(){
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");
        //public void addFirst(E e)`:将指定元素插入此列表的开头。
        System.out.println(list);
        list.addFirst("zzz");
        System.out.println(list);
        //public void addLast(E e)`:将指定元素添加到此列表的结尾。
        list.addLast("jjj");
        System.out.println(list);
        //public void push(E e)`:将元素推入此列表所表示的堆栈。
        list.push("DDD"); //相当于addFirst
        System.out.println(list);
    }
}
