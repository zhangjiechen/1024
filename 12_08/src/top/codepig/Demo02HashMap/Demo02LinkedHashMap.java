package top.codepig.Demo02HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo02LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("b","c");
        map.put("a","b");
        map.put("c","d");
        map.put("a","e");
        System.out.println(map);//key不允许重复，无序{a=e, b=c, c=d}
        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("b","c");
        linked.put("a","b");
        linked.put("c","d");
        linked.put("a","e");
        System.out.println(linked);//key不允许重复，有序{b=c, a=e, c=d}
    }
}
