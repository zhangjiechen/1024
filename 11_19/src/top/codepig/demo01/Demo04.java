package top.codepig.demo01;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(20,20));

    }
    public static boolean isSame(int a,int b){
       /* boolean same;
        if(a == b){
            same = true;
        }else{
            same = false;
        }*/
       /*boolean same = a ==b ? true:false;
        return same;*/
       return a==b;
    }
}
