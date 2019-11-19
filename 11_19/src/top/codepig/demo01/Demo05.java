package top.codepig.demo01;

public class Demo05 {
    public static void main(String[] args) {
        System.out.println("总和是： "+getSum());
    }
    public static int getSum(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
