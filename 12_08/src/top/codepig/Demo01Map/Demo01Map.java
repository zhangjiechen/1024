package top.codepig.Demo01Map;

import java.util.HashMap;

/*
       java.util.Map<k,v>集合
       Map集合的特点：
        1.Map集合是一个双列集合，一个元素包含两个值（一个key一个value）
        2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
        3.Map集合中的元素，key是不可以重复的，value可以重复
        4.Map集合中的元素，key和value是一一对应的
        java.util.HashMap<K,V>集合 implements Map(K,V)接口
        HashMap集合的特点：
        1.HashMap的底层是哈希表
        2.HashMap集合是一个无序的集合
        java.util.LinkedHashMap<K,V>集合 extends Hashmap<K,V>集合
        LinkedHashMap集合的特点：
        1.LinkedHashMap是一个有序的集合
        Map接口的常用方法：
        *   public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中。
        * `public V remove(Object key)`: 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
        * `public V get(Object key)` 根据指定的键，在Map集合中获取对应的值。
        * `boolean containsKey(Object key)  ` 判断集合中是否包含指定的键。
        * `public Set<K> keySet()`: 获取Map集合中所有的键，存储到Set集合中。
        * `public Set<Map.Entry<K,V>> entrySet()`: 获取到Map集合中所有的键值对对象的集合(Set集合)。
 */
public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }

    private static void show04() {
       /* `boolean containsKey(Object key)  ` 判断集合中是否包含指定的键。*/
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");
        System.out.println(map.containsKey("邓超"));//判断集合中是否包含指定的键  true
        System.out.println(map.containsKey("邓超1"));//false
        System.out.println(map.containsValue("孙俪"));//判断集合中是否包含指定的值  true
        System.out.println(map.containsValue("孙俪1"));//false
    }


    private static void show01() {
        HashMap<String, String> map = new HashMap<String, String>();
        //添加元素到集合
        /*public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中。
        使用put方法时，若指定的键(key)在集合中没有，则没有这个键对应的值，返回null，并把指定的键值添加到集合中；*/
      String str =   map.put("黄晓明", "杨颖");
      String str1 = map.put("黄晓明","杨颖1");//如何key重复，那么value的值将会覆盖掉原来的value,返回的也是原来的value值
        System.out.println(str);//null
        System.out.println(str1);//杨颖
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");
        System.out.println(map);//{邓超=孙俪, 文章=马伊琍, 黄晓明=杨颖1}
    }


    private static void show02() {
       /* public V remove(Object key)`: 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。*/
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");
        String str = map.remove("黄晓明");
        System.out.println(str);//杨颖
        String str1 = map.remove("黄晓明1");
        System.out.println(str1);//null
        System.out.println(map);//{邓超=孙俪, 文章=马伊琍}
    }


    private static void show03() {
        /* public V get(Object key)` 根据指定的键，在Map集合中获取对应的值*/
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");
        String str = map.get("文章");
        System.out.println(str);//马伊琍
        String str1 = map.get("文章1");
        System.out.println(str1);//null
        System.out.println(map);//{邓超=孙俪, 文章=马伊琍, 黄晓明=杨颖}
    }
}
