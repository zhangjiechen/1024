package top.codepig.Demo02;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
java.util.LinkedHashSet集合 extends HashSet集合
LinkedHashSet集合特点：
        底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("zzz");
        set.add("aaa");
        set.add("jjj");
        set.add("aaa");
        System.out.println(set);//[aaa, zzz, jjj]

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("zzz");
        linked.add("aaa");
        linked.add("jjj");
        linked.add("aaa");
        System.out.println(linked);//[zzz, aaa, jjj] 有序的，不允许重复
    }
}