package top.codepig.Demo02;
/*
数组可以作为方法的参数
当调用方法的时候，向方法进行传参，传递进去的其实就是数组的地址值
 */
public class ArrayParam {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        printArray(array);// 传递进去的就是array保存的地址值
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"   ");
        }
    }
}
