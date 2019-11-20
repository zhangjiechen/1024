package top.codepig.Demo04;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("=================");
        one.brand = "小米";
        one.price = 2999.0;
        one.color = "彩色";
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("=================");
        one.call("刘依林");
        one.sendMessgae();

    }
}
