package top.codepig.Demo02;

public class Demo05GerneicClass {
    public static void main(String[] args) {
        //不写泛型默认为Object类型
        GerneicClass ger1 = new GerneicClass();
        //泛型使用String
        GerneicClass<String> ger2 = new GerneicClass<>();
        ger2.setName("zzz");
        System.out.println(ger2.getName());
        //泛型使用Integer
        GerneicClass<Integer> ger3 = new GerneicClass<>();
        ger3.setName(111);
        System.out.println(ger3.getName());

        ger1.Method(111);
        ger1.MethodStatic("静态方法，不建议创建对象使用");
        new GerneicClass().MethodStatic("静态方法");


    }
}
