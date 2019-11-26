package top.codepig.Demo02;

public class Body {
    private String name;
    //内部类
    public class Heart{
        //内部类方法
        public void beat(){
            System.out.println("我叫：" +name);
        }
    }
    //外部类方法
    public void methodBody(){
        System.out.println("外部类的方法");
        //匿名对象
        new Heart().beat();
    }
}
