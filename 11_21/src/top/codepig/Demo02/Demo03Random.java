package top.codepig.Demo02;

import java.util.Random;
import java.util.Scanner;

public class Demo03Random {
    public static void main(String[] args) {
        Random r =new Random();
        int randomNum = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        /*while(true){
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt();
            if(guessNum>randomNum){
                System.out.println("太大了，请重试");
            }else if(guessNum<randomNum){
                System.out.println("太小了，请重试");
            }else{
                System.out.println("恭喜你，猜中了！！！");
                break;
            }
        }*/
        for (int i = 0; i < 5; i++) {
            {
                System.out.println("请输入你猜测的数字：");
                int guessNum = sc.nextInt();
                if(guessNum>randomNum){
                    System.out.println("太大了，请重试");
                }else if(guessNum<randomNum){
                    System.out.println("太小了，请重试");
                }else{
                    System.out.println("恭喜你，猜中了！！！");
                    break;
                }
            }
        }
    }
}
