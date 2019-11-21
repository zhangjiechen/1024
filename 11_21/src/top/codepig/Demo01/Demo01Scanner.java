package top.codepig.Demo01;
import java.util.Scanner;//1.导包
/*
常用API
Scanner类的功能：可以实现键盘输入数据，到程序当中。
只有java.lang包下的内容不需要导包，其他的包都需要import语句
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //2.创建
        Scanner sc = new Scanner(System.in);//System.in表示从键盘输入
        //3.获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("输入的int数字是："+ num);

        //4.获取键盘输入的字符串
        String str = sc.next();
        System.out.println("输入的字符串数字是："+ str);

    }

}
