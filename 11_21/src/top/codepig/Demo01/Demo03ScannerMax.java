package top.codepig.Demo01;
import java.util.Scanner;
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        int num3 = scr.nextInt();
        System.out.println(num1 > num2 ? (num1 > num3 ? num1 : num3): (num2 > num3 ? num2 : num3 ));
    }
}
