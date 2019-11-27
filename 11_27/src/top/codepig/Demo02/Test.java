package top.codepig.Demo02;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array1 = new int[array.length];
        for (int i = array.length-1,j = 0; i >= 0; i--,j++) {
           array1[j] = array[i];
        }
        System.out.println(Arrays.toString(array1));
    }
}
