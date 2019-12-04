package top.codepig.Demo01;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        //demo01Arraycopy();
        //demo02CopyOf();
        demo03CopyOfRange();
    }

    private static void demo01Arraycopy() {
        /*  java.lang.System类中的arraycopy方法
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
            :从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
        src : 源数组
        srcPos: 源数组起始位置
        dest： 目标数组
        destPos： 目标数组起始位置
        length：复制的数组元素数量*/
        //System.arraycopy方法的缺点就是必须要提前创建好目的数组，而且要注意目的数组类型和长度
        int[] src = {7,8,9,10};
        int[] dest = {1,2,3,4};
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);//把scr数组下标从0开始依次复制到dest数组下标为0的位置，复制长度为3
        System.out.println(Arrays.toString(dest));
    }
    private static void demo02CopyOf() {
        /*java.util.Arrays类中copyOf方法
        public static boolean[] copyOf(boolean[] original, int newLength)
            :复制指定的数组，截取或用 false 填充（如有必要），以使副本具有指定的长度。
        该方法有返回值，返回值类型可以为8种基本类型数组或者引用类型数组，根据参数列表不同，调用不同的方法，实现了重载
            oringinal:原数组      newlength:复制数组的长度
        */
        //Arrays.copyOf方法的缺点就是必须要从原数组的起始位置开始复制
        int[] src = {1,2,3,4,5,6,7,8,9};
        int[] dest = Arrays.copyOf(src,7);//把数组src下标从0开始依次复制到新数组当中，复制长度为7
        System.out.println(Arrays.toString(dest));
    }
    private static void demo03CopyOfRange() {
        /*
       public static boolean[] copyOfRange(boolean[] original, int from, int to)
          :将指定数组的指定范围复制到一个新数组。
       该方法有返回值，返回值类型可以为8种基本类型数组或者引用类型数组，根据参数列表不同，调用不同的方法，实现了重载
                oringinal:原数组   from:起始位置  to:结束位置
              【注意事项】：包头不包尾
         */
        int[] src = {1,2,3,4,5,6,7,8,9};
        int[] dest = Arrays.copyOfRange(src,0,8);
        System.out.println(Arrays.toString(dest));
    }

}
