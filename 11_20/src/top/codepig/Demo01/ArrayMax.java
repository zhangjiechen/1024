package top.codepig.Demo01;

/*public class ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,10000};
        int max = array[0];
        for(int i=1; i<array.length; i++)
        {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("最大的数字是："+ max);
    }
}*/
public class ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,-10,10000};
        int min = array[0];
        for(int i=1; i<array.length; i++)
        {
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("最小的数字是："+ min);
    }
}