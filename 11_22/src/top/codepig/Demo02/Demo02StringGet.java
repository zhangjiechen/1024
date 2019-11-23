package top.codepig.Demo02;
/*
String当中与获取相关的常用方法：
public int length():获取字符串当中含有的字符个数，返回字符串长度
public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串
public char charAt(int index):获取指定索引位置的单个字符（索引从0开始）
public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引值，如果没有返回值为-1
public String substring(int begin,int end):截取从begin开始，一直到end结尾的字符串

String当中与转换有关的方法
public char[] toCharArray():将当前字符串拆分成字符数组进行返回
public byte[] getBytes():获得当前字符串底层的字节数组
public String replace(CharSequence OldString,CharSequence NewString):将所有老的字符串替换成新的字符串，返回替换之后新的字符串
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串长度
        int length = "dafafafxaxca".length();
        System.out.println("字符串的长度是："+length);
        System.out.println("=============");
        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3);
        System.out.println("=============");
        //获取指定索引位置的单个字符
        char ch  = "Hello".charAt(1);
        System.out.println("在1号索引位置的是：" + ch);
        System.out.println("=============");
        String str4 = "HelloWorld";
        int index = str4.indexOf("el");
        System.out.println(index);
        System.out.println("=============");
        String str5 = "Helloworld";
        String str6 = str5.substring(5);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str5.substring(4,7));
        System.out.println("=============");
        /*
        下面这种写法，字符串内容是没有发生改变的
        下面有两个字符串
        strA中保存的是地址值
        本来地址值是"Hello"的0x666
        后来地址值变成"World"的0x999
         */
        String strA = "Hello";
        System.out.println(strA);
        strA = "World";
        System.out.println(strA);
        System.out.println("=============");
        //转换成字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("=============");
        //转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=============");
        //替换
        String strC = "会不会玩游戏，你大爷的！你大爷的！你大爷的！你大爷的！";
        String StrD = strC.replace("你大爷的","***");
        System.out.println(StrD);
    }
}
