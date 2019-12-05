package top.codepig.Demo01;

import java.util.Scanner;

/*
  给定两个32位整数a和b，返回a和b中较大的一个，不能使用比较判断
 */
public class Test01 {
    public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            int a = sc.nextInt();
            int b =sc.nextInt();
            System.out.println(getMax(a,b));

    }

    private static int getMax(int a, int b) {
        int c= a-b;
        int scA = sign(c);
        int scB = flip(scA);
        return a*scA + b*scB;
    }

    private static int sign(int n) {
        return flip((n>>31)&1);
    }

    private static int flip(int n) {
        return n^1;
    }
}
