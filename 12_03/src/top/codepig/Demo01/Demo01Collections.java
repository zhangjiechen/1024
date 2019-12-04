package top.codepig.Demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
java.utils.Collections`是集合工具类，用来对集合进行操作。部分方法如下：

public static <T> boolean addAll(Collection<T> c, T... elements)  `:往集合中添加一些元素。
public static void shuffle(List<?> list) 打乱顺序`:打乱集合顺序。
public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。
public static <T> void sort(List<T> list，Comparator<? super T> )`:将集合中元素按照指定规则排序。
 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        /*list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");*/
        //public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        Collections.addAll(list,"a","b","c","d");

        System.out.println(list);
       // public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
        Collections.shuffle(list);
        System.out.println(list);
       // public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。
        //注意事项：被排序的集合里面的元素必须实现Comparable,重写接口中的方法compareTo方法定义排序规则
        //自己（this）-参数  就是升序
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(new Person("zjc",14));
        list2.add(new Person("lyl",12));
        list2.add(new Person("gsq",23));
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
        Collections.sort(list2, new Comparator<Person>() {//匿名内部类
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge()-o1.getAge(); //降序
            }
        });
        System.out.println(list2);
        //public static <T> void sort(List<T> list，Comparator<? super T> )`:将集合中元素按照指定规则排序。
        //Comparator和Comparable的区别
        //Comparable：自己（this）和参数比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
        //Comparator：相当于找一个第三方裁判，比较  排序规则:o1-o2  升序
        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3,2,1,3);
        System.out.println(list3);
        //Collections.sort(list3);
        Collections.sort(list3, new Comparator<Integer>() {//匿名内部类
            //重写比较规则  int compare(T o1, T o2);
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(list3);


    }
}
