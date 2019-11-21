package top.codepig.Demo03;

import java.util.ArrayList;
/*
如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”
基本类型     包装类(引用类型，包装类都位于Java.lang包下，所以不用import)
byte          Byte
short         Short
int           Integer  【特殊】
long          Long
float         Float
double        Double
char          Character  【特殊】
boolean       Boolean

从JDK1.5开始，支持自动装箱、自动拆箱
自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
 */
public class Demo04ArrayListBasic {
    //ArrayList<int> list = new ArrayList<>();错误写法！泛型只能是引用类型，不能是基本类型
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println(list);
        System.out.println("第0号元素是："+list.get(0));
    }
}
