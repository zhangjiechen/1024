package top.codepig.Demo03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
    哈希值：是一个十进制整数，有系统随即给出（就是对象的地址值，不是真是的物理地址，而是一个逻辑地址）
    在Object类有一个方法，可以获取对象的哈希值
     int hashCode() 返回对象的哈希值
     hashCode方法的源码：
            public native int hashCode();
            native:代表方法调用的是本地操作系统的方法
 */
public class HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);//460141958

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);//1163157884
        /*
            toString方法的源码：
                return getClass().getName() + "@" + Integer.toHexString(hashCode())；
    }
         */
        System.out.println(p1);//top.codepig.Demo03.Person@1b6d3586  就是hashcode的16进制表示形式
        System.out.println(p2);//top.codepig.Demo03.Person@4554617c
        System.out.println(p1==p2);//实际的物理地址是不相等的
        /*
        String重写Object中的hashCode方法
        public int hashCode() {
        int h = hash;
        if (h == 0 && value.length > 0) {
            char val[] = value;

            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
            }
            hash = h;
        }
        return h;
    }
         */
        String str1 = new String("aaaa");
        String str2 = new String("aaaa");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        System.out.println("重地"==("通话"));



    }
}
