package top.codepig.Demo02HashMap;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.HashTable<K,V>集合 implements Map<K,V>接口

    HashTable：底层是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
    HashMap: 底层是一个哈希表，是一个线程不安全的集合，是多线程集合，速度快

    HashMap集合(之前所学的所有集合)，可以存储null值和null键
    HashTable集合，不能存储null值，不能存储null键
 */
public class Demo03HashTable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("a",null);
        map.put(null,null);
        System.out.println(map);//{null=null, a=null}
        Hashtable<String,String> table = new Hashtable<>();
        //table.put(null,"a");//NullPointerException
       // table.put("a",null);//NullPointerException
        //table.put(null,null);//NullPointerException
    }
}
