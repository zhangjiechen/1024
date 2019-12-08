package top.codepig.MapTest;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一段字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //创建HashMap集合，key是字符，value是字符的个数
        HashMap<Character,Integer> map = new HashMap<>();
        for(char s:str.toCharArray()){
            if(map.containsKey(s)){
                //key存在
                Integer value = map.get(s);
                value++;
                map.put(s,value);
            }else{
                //key不存在
                map.put(s,1);
            }

        }
        for(Character key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"->"+value);
        }
    }
}
