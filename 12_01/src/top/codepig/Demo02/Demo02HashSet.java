package top.codepig.Demo02;

import java.util.HashSet;

/*
        哈希表：数组+链表/红黑树  (红黑树是java1.8以后加上的，链表长度超过阈值（8）时，将链表转换为红黑树，这样大大减少了查找时间。)

    set不能存储重复元素的原理。【前提：存储的元素必须重写了hashcode方法和equals方法】
    set集合在调用add方法的时候，add方法会调用元素的hascode方法和equals方法，判断元素是否重复
    当两个方法判断都为相同的时候，就不会把元素存储到集合当中。例如下面的："abc"和"abc"
    当hashcode值相同但是equals为false时，会认定两个元素不同，会把元素存储到集合当中。例如下面的：元素"通话"和"重地"
 */
public class Demo02HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("abc");
        System.out.println("abc".hashCode()=="abc".hashCode()); //hashCode方法返回值是int，所以可以通过==来判断是否相同
        System.out.println("abc".equals("abc"));
        System.out.println("======================");
        set.add("通话");
        set.add("重地");
        System.out.println("通话".hashCode()=="重地".hashCode());
        System.out.println("通话".equals("重地")); //hash值相等的元素equals不一定相等。
        set.add("abc");
        System.out.println(set);//重写了toString方法

    }
}
