package top.codepig.Demo01;

public class Static {
    static int num ;
    String name ;
    static{
        System.out.println("静态代码块执行了！");
    }
    public Static(){
        System.out.println("构造方法执行！");
    }
    public Static(String name){
        this.name = name;
        System.out.println("构造方法执行！");

    }
}
