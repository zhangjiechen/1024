package top.codepig.Demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colorS ={"♣","♦","♠","♥"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for(String color: colorS){
            for(String number: numbers){
               // System.out.println(color+number);
                poker.add(color+number);
            }
        }
       // System.out.println(poker);
        Collections.shuffle(poker);//洗牌
       // System.out.println(poker);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        //发牌
        for(int i=0;i<poker.size();i++){
           String p =  poker.get(i);
           if(i>=51){
               diPai.add(p);
           }else if(i%3==0){
               player1.add(p);
           }else if(i%3==1){
               player2.add(p);
           }else if(i%3==2){
               player3.add(p);
           }
        }
        //看牌
        System.out.println("周星驰："+player1);
        System.out.println("刘德华："+player2);
        System.out.println("周润发："+player3);
        System.out.println("底牌："+diPai);
    }
}
