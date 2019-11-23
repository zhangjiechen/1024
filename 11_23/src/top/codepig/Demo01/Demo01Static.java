package top.codepig.Demo01;

public class Demo01Static {
    public static void main(String[] args) {
        Static.num = 1;
        System.out.println(Static.num);
        Static s = new Static("zjc");
        System.out.println(Static.num + "  "+ s.name);
    }
}
