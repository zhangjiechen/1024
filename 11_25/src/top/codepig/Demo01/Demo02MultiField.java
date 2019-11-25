package top.codepig.Demo01;
/*
访问成员变量的两种方式：

1、直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上查找
2、间接通过成员方法访问成员变量：看该方法属于谁，优先用水，没有则向上查找
 */
public class Demo02MultiField {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);//看等号左边是谁，优先用谁
        Zi zi = new Zi();
        System.out.println(zi.num);//看等号左边是谁，优先用谁
        System.out.println("============");
        zi.methodShow();//看该方法属于谁，优先用水
        obj.methodShow();
    }
}
