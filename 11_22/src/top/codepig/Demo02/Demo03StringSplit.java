package top.codepig.Demo02;
/*
public String[] split(String regex):按照参数的规则，将字符串分成为若干部分
 注意事项：
 split方法的参数其实是一个“正则表达式”

 */
public class Demo03StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,";
        String[] array = str1.split(",");
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==============");
        String str2 = "aaa bbb ccc ' aa ccc";
        String[] array01 = str2.split(" ");
        for (int i = 0; i < array01.length; i++) {
            System.out.println(array01[i]);
        }
        System.out.println("==============");
        str2 = "aaa.vvv.ccc";
        array = str2.split(".");
        System.out.println(array.length);
        String[] arr = {};
        System.out.println(arr.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
