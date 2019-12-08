package top.codepig.Demo01Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
public Set<K> keySet()`: 获取Map集合中所有的键，存储到Set集合中。
第一种遍历集合：通过键找值
    第一步：通过map中的keyset方法把map中的key值找出来放在set集合中
    第二步：遍历set集合，获取map集合中的每一个key
    第三步：通过map集合中的get(key)方法，通过key找到value
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");
        Set<String> set = new HashSet<>();
        set = map.keySet();
        //增强for循环遍历
        /*for(String i :set){
            System.out.println(i);
            System.out.println(map.get(i));
        }*/
        //使用迭代器遍历
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String  i = it.next();
            System.out.println(i+" -> " +map.get(i));

        }
    }
}
