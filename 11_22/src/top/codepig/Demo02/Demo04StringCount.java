package top.codepig.Demo02;

import java.util.Scanner;

public class Demo04StringCount {
    public static void main(String[] args) {
        System.out.println("请输入你的字符：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] arr = str.toCharArray();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if('A'<= ch && ch <= 'Z'){
                countUpper++;
            }else if(ch>='a'&&ch <='z'){
                countLower++;
            }else if('0'<=ch&&ch<='9'){
                countNumber++;
            }else{
                countOther++;
            }

        }
        System.out.println("大写字符有："+countUpper);
        System.out.println("小写字符有："+countLower);
        System.out.println("数字字符有："+countNumber);
        System.out.println("其他字符有："+countOther);

    }
}
