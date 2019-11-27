package top.codepig.Demo01;

import java.util.Arrays;

/*
`java.lang.System`类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：

- `public static long currentTimeMillis()`：返回以毫秒为单位的当前时间。
- `public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`：将数组中指定的数据拷贝到另一个数组中。
    src : 源数组
    srcPos: 源数组起始位置
    dest： 目标数组
    destPos： 目标数组起始位置
    length：复制的数组元素数量
 */
public class Demo07System {
    public static void main(String[] args) {
        /*long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时毫秒：" + (end - start));*/
        int[] src = {7,8,9};
        int[] dest = {1,2,3};
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }
}
