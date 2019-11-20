package top.codepig.Demo03;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                System.out.println(array[i]+"]");
            }else{
                System.out.print(array[i]+", ");
            }
        }
        System.out.println("-----------------------");
        /*
        找一个jdk给我们提供好的Arrays类
        其中有一个toString方法，直接就能把数组变成想要的格式的字符串
         */
        System.out.println(Arrays.toString(array));
    }
}
