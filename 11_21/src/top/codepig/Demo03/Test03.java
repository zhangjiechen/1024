package top.codepig.Demo03;

import java.util.ArrayList;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {


        ArrayList<Integer> bigList = new ArrayList<>();
        //Random r = new Random();
        for(int i=0; i<20; i++){
            //int num = r.nextInt(100)+1;
           // bigList.add(num);
            bigList.add(new Random().nextInt(100)+1);//也可以使用匿名对象类
        }
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("总共有"+smallList.size()+"个偶数");
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num%2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
