package top.codepig.Demo02;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(10)+1;
            System.out.println("随机数是："+ num);
        }


    }

}
