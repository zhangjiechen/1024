package top.codepig.Demo02;

public class Main {
    public static void main(String[] args) {
        String name = "zjc";
        String name1 = "lyl";
        String name2 = "zjc"+"lyl";
        String name3 = name + name1;
        String name4 =new String(name+name1);
        System.out.println(name4==name3);
    }
}
