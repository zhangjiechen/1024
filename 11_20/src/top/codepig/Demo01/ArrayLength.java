package top.codepig.Demo01;
/*
获取数组的长度，
格式；数组名称.length
这将会得到一个int数字，代表数组的长度
数组一旦创建，程序运行期间。长度不可改变 ：new出来的对象
 */
public class ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA.length);
        int[] arrayB = {1,2,3,46,789,46,79,152,13,84,65416,415};
        System.out.println(arrayB.length);
        System.out.println("------------");
        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
