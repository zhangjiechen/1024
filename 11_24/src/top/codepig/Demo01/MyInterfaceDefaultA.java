package top.codepig.Demo01;
/*
从Java 8开始，接口允许定义默认方法
格式：
public default 返回值类型 方法名称（参数列表）{
    方法体
}

备注：接口当中的默认方法，可以解决接口升级的问题
 */
public  class MyInterfaceDefaultA implements MyInterfaceDefault {
    @Override
    public  void MethodAbs(){
        System.out.println("实现了抽象方法：AAA");
    }
}
