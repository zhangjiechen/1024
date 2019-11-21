package top.codepig.Demo01;
import java.util.Scanner;
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("请输入你需要相加的两个数字：");
        System.out.println("结果是:"+(scr.nextInt()+scr.nextInt()));
    }
}
