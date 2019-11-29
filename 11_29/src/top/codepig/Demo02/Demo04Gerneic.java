package top.codepig.Demo02;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo04Gerneic {
    public static void main(String[] args) {
       // demo01();
        demo02();
    }
   public static void demo01(){
       ArrayList list = new ArrayList();
       list.add("a");
       list.add(1);
       Iterator it = list.iterator();
       while(it.hasNext()){
           Object obj = it.next();
           System.out.println(obj);
           //想要使用String的length方法：不能只使用多态Object obj = "a";
           //需要向下转型
           String str = (String)obj;//Integer转为String时会出现异常ClassCastException
           System.out.println(str.length());
       }
   }
   public static void demo02(){
       ArrayList<String> list = new ArrayList();
       list.add("a");
       list.add("b");
       /*for(String i:list){
           System.out.println(i);
       }*/
       Iterator<String> it = list.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
   }
}

