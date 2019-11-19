/*
常量的分类:
1.字符串常量：双引号引起来
2.整数常量：
3.浮点数常量：有小数点直接写上的数字
4.字符常量：单引号引起来的单个字符
5.布尔常量：true、false
6.空常量：null
*/
public class HelloWorld{
    public static void main(String[] arg){
        //字符串常量
        System.out.println("ABC");
        System.out.println("");
        System.out.println("ABC");
        //整数
        System.out.println(500);
        System.out.println(-500);
        //浮点数
        System.out.println(3.14);
        System.out.println(-3.14);
        //字符常量
        System.out.println('a');
        //System.out.println('');单引号中间必须有且仅有一个字符，没有不行
        //System.out.println('ab');有两个也不行
        //布尔常量
        System.out.println(true);
        System.out.println(false);
        //空常量：不能直接用来打印输出
        //System.out.println(null);
		  /*
		  自动类型转换
			1.特点： 代码不需要特殊处理，自动完成
			2.规则：数据范围从小到大（与字节数不一定相关）例如:long num1 = 30.0F;
		  强制类型转换
		  */
		  /*
		  强制类型转换
		  */
        float num1 = 30L;
        int num = (int)100L;
        System.out.println(num1);
        System.out.println(num);
        int num2 = (int)6000000000L;
        System.out.println(num2); //1705032704 数据溢出
        num2 = (int)3.99;//精度损失 不是四舍五入
        System.out.println(num2);
        char zifu1 = 'A';
        System.out.println(zifu1 + ' ');
        System.out.println(zifu1 + 1); //66,大写字母A被当做65进行处理

    }
}
 /*基本数据类型
	整数型：byte  short int long
	浮点型：float double
	字符型：char
	布尔型：boolean
 引用数据类型
	：字符串、数组、类、接口、Lambda*/