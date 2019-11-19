package top.codepig.demo01;

/*
方法就就是若干语句的功能集合
参数：进入方法的数据
返回值：方法中出来的数据
修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
    方法体
    return 返回值；
    }
 */
public class Demo02 {
    public static void main(String[] args) {
        //单独调用
        sum(2,3);
        System.out.println("============");
        //打印调用
        System.out.println(sum(2, 3));
        System.out.println("============");
        //赋值调用
        int number  = sum(10,20);
        System.out.println("变量的值: " + number);
    }

    public static int sum(int a, int b) {
        System.out.println("方法执行啦！！！");
        return a + b;
    }
}
