package top.codepig.Demo02;
/*
计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
 */
public class Demo03MathPractise {
    public static void main(String[] args) {
        int count = 0;
        for(int i=(int)-10.8; i<5.9;i++){
            if(6<Math.abs(i) || Math.abs(i)<2.1){
                System.out.println(i);
                count ++;
            }
        }
        System.out.println("整数总共有" + count + "个");
    }
}
