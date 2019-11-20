package top.codepig.Demo01;
/*
数组反转：不能使用新数组
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"   ");
        }
        System.out.println();
        System.out.println("------------------------");
        int temp = 0;
        for(int i=0,j=array.length-1;array[i]<array[j]; i++,j--){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"   ");
        }
    }
}
