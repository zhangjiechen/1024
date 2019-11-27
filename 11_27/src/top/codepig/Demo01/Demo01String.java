package top.codepig.Demo01;
/*

toString方法返回该对象的字符串表示，其实该字符串内容就是对象的类型+@+内存地址值。

由于toString方法返回的结果是内存地址，而在开发中，经常需要按照对象的属性得到相应的字符串表现形式，因此也需要重写它。
输出对象名的时候默认调用了toString方法
 */
public class Demo01String {
    public static void main(String[] args) {
        Person per = new Person("迪丽热巴",18);
        System.out.println(per);
        String aaa = "aaaaa";
        System.out.println(aaa);
    }
}
