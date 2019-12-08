package top.codepig.Demo02HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01HashMap {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        /*
         HashMap存储自定义类型
        key：Person
           Person必须重写hashcode方法和equals方法，可以保证键唯一
        Value：String类型
            可以重复
         */
        Map<Person,String> map = new HashMap<>();
        map.put(new Person("lyl",13),"重庆");
        map.put(new Person("zjc",15),"西安");
        map.put(new Person("zjc",15),"北京");
        //使用entrySet方法和迭代器遍历
        Set<Map.Entry<Person, String>> set = map.entrySet();
        Iterator<Map.Entry<Person, String>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Person,String> entry = it.next();
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"->"+value);
        }
    }

    private static void show01() {
        /*
        HashMap存储自定义类型
        key：String
           Sring重写hashcode方法和equals方法，可以保证键唯一
        Value：Person类型
            value可以重复
         */
        Map<String,Person> map = new HashMap<>();
        map.put("重庆",new Person("lyl",13));
        map.put("西安",new Person("zjc",15));
        map.put("西安",new Person("zjc",18));
        //使用keySet方法和增强for循环遍历
        Set<String> set = map.keySet();
        for(String str:set){
            Person value = map.get(str);
            System.out.println(str+"->"+value);
        }
       // System.out.println(map);
    }
}
