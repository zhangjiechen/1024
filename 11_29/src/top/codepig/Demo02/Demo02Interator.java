package top.codepig.Demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
在程序开发中，经常需要遍历集合中的所有元素。针对这种需求，JDK专门提供了一个接口`java.util.Iterator`。
`Iterator`接口也是Java集合中的一员，但它与`Collection`、`Map`接口有所不同，`Collection`接口与`Map`接口主要用于存储元素，
而`Iterator`主要用于迭代访问（即遍历）`Collection`中的元素，因此`Iterator`对象也被称为迭代器。

* `public E next()`:返回迭代的下一个元素。
* `public boolean hasNext()`:如果仍有元素可以迭代，则返回 true。
* `public Iterator iterator()`: 获取集合对应的迭代器，用来遍历集合中的元素的。
 */
public class Demo02Interator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
       //多态，接口 = 实现类
       // System.out.println(iterator.hasNext());
        coll.add("zzz");
        coll.add("aaa");
        coll.add("ccc");
        coll.add("qqq");
        Iterator<String> iterator = coll.iterator();
/*        System.out.println(iterator.hasNext());
        String str = iterator.next();
        System.out.println(str);


        boolean b = iterator.hasNext();
        System.out.println(b);
        String next = iterator.next();
        System.out.println(next);

        boolean c = iterator.hasNext();
        System.out.println(c);
        String next1 = iterator.next();
        System.out.println(next1);

        boolean d = iterator.hasNext();
        System.out.println(d);
        String next2 = iterator.next();
        System.out.println(next2);

        boolean e = iterator.hasNext();//没有元素，返回false
        System.out.println(e);
        String next3 = iterator.next();
        System.out.println(next3);//没有元素继续取出会抛出异常：NoSuchElementException*/

       /* while(iterator.hasNext()){
            String e = iterator.next();
            System.out.println(e);
        }*/
        System.out.println("===========");
        for(;iterator.hasNext();){
            System.out.println(iterator.next());
        }




    }
}
