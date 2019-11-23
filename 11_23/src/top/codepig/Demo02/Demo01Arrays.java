package top.codepig.Demo02;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        String str = "adf65a4geghq4e6hrh4";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for(int i=chars.length-1; i>=0; i--){
            System.out.println(chars[i]);
        }
    }
}
