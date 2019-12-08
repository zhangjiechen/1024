package top.codepig.Demo01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
`Map`中存放的是两种对象，一种称为**key**(键)，一种称为**value**(值)，它们在在`Map`中是一一对应关系，这一对对象又称做`Map`中的一个`Entry(项)`。
`Entry`将键值对的对应关系封装成了对象。即键值对对象，这样我们在遍历`Map`集合时，就可以从每一个键值对（`Entry`）对象中获取对应的键与对应的值。
* `public K getKey()`：获取Entry对象中的键。
* `public V getValue()`：获取Entry对象中的值。
* `public Set<Map.Entry<K,V>> entrySet()`: 获取到Map集合中所有的键值对对象的集合(Set集合)。

步骤：
1.  获取Map集合中，所有的键值对(Entry)对象，以Set集合形式返回。方法提示:`entrySet()`。
2.  遍历包含键值对(Entry)对象的Set集合，得到每一个键值对(Entry)对象。
3.  通过键值对(Entry)对象，获取Entry对象中的键与值。  方法提示:`getkey() getValue()`
 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");
        //1. 获取Map集合中，所有的键值对(Entry)对象，以Set集合形式返回。方法提示:`entrySet()`。
        Set<Map.Entry<String, String>> set = map.entrySet();
        //2.  遍历包含键值对(Entry)对象的Set集合，得到每一个键值对(Entry)对象。
        //使用迭代器遍历
        Iterator<Map.Entry<String,String>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            //3.  通过键值对(Entry)对象，获取Entry对象中的键与值。  方法提示:`getkey() getValue()`
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"->"+value);
        }
        for(Map.Entry<String,String> entry : set){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"的CP是:"+value);
        }

    }
}
