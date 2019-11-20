package top.codepig.Demo02;
/*
一个方格可以有0、1、多个参数；但是只能有0或者1个返回值，不能有多个返回值
使用一个数组作为返回值类型
任何数据类型都可以作为方法的参数类型或者返回值类型

数组作为方法的参数，传递进去的其实是数组的地址值
数组作为方法的返回值，返回的其实也是数组的地址值
 */
public class ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println("平均数："+result[1]);
        System.out.println("总和："+result[0]);
    }
    public static  int[]  calculate(int a,int b,int c){
        int sum = a+b+c;
        int avg = sum/3;
       /* int array = new int[2];
        array[0] = sum;
        array[1] = avg;
        return array;*/
       int[] array = {sum,avg};
       return array;
    }
}
