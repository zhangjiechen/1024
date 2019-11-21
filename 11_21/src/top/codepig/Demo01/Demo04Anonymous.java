package top.codepig.Demo01;
import java.util.Scanner;
public class Demo04Anonymous {
    public static void main(String[] args) {
       Scanner sc =  methodReturn();
        System.out.println("输入的是："+sc.nextInt());
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
