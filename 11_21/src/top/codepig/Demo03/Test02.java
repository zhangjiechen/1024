package top.codepig.Demo03;
/*
要求输出格式为{@ @ @ }
 */
import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("丑八怪");
        list.add("薛之谦");
        list.add("刘亦菲");
        list.add("吴亦凡");
        //System.out.println(list);
        PrintArrayList(list);

    }
    public static void PrintArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.println(list.get(i)+"}");
            }else{
                System.out.print( list.get(i) + "@");
            }
        }
    }
}

