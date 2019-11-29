package top.codepig.Demo01;

public class Demo01Integer {
    public static void main(String[] args) {
        Integer integer = new Integer(1);
        Integer integer1 = new Integer("1");
        System.out.println(integer);
        System.out.println(integer1);
        Integer integer2 = Integer.valueOf(1);
        Integer integer3 = Integer.valueOf("1");
        System.out.println(integer2);
        System.out.println(integer3);
        //System.out.println(Integer.valueOf("a"));//NumberFormatException:数字转换异常
        int i = integer.intValue();//拆箱
        System.out.println(i);

    }

}
