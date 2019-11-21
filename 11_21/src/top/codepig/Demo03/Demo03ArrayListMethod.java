package top.codepig.Demo03;

import java.util.ArrayList;

/*
ArrayList当中的常用方法：

public boolean add(E e):向集合当中添加元素，参数类型和泛型一致 (返回值代表是否添加成功)
public E get(int index):向集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
public E remove(int index)；向集合当中删除元素，参数是索引编号，返回值就是被删除的元素
publci int size():获取集合的尺寸长度，返回值是集合中包含的元素个数。
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        boolean bool = list.add("无极剑圣");
        System.out.println("添加的动作是否成功："+bool);
        System.out.println(list);
        list.add("盲僧");
        list.add("铁憨憨");
        list.add("盖伦");
        list.add("赵信");
        list.add("艾克");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list);
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list);
        //获取集合的长度尺寸，也就是其中元素的个数[.size()] // 获取数组的长度[.length]
        System.out.println(list.size());
        System.out.println("==================");
        //遍历ArrayList集合
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}
