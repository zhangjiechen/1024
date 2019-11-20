package top.codepig.Demo04;
/*
面向对象三大特性：封装、继承、多态
封装性在java中的体现：
1. 方法就是一种封装
2. 关键字pravite是一种封装

 */
public class Method {
    public static void main(String[] args) {
        int[] array = {5,4,68,979,1};
        System.out.println(getMax(array));
    }
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
