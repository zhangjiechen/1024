package top.codepig.Demo03;

import java.util.ArrayList;

/*
数组的长度不改变
但是ArrayList集合的长度是可以随意变化的

对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：也就是装在集合当中的所有元素，全部都是统一的类型
注意：泛型只能是引用类型，不能是基本类型

注意事项：
对与ArrayList集合来说，直接打印的不是地址值，而是内容
如果内容为空，得到的就是空的中括号。[]
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合名称是list，里面装的是String字符串类型的数据
        //备注：从JDK1.7 开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("迪丽热巴");
        System.out.println(list);
        list.add("古力娜扎");
        list.add("马尔扎哈");
        list.add("lyl");
        //list.add(100);错误写法！ 因为创建的时候尖括号泛型已经说明了是字符串类型，就不能添加任何其他类型
        System.out.println(list);
    }
}
