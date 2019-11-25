package top.codepig.Demo01;
/*
从Java 8开始，接口允许定义默认方法
格式：
public default 返回值类型 方法名称（参数列表）{
    方法体
}

备注：接口当中的默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault {
    public abstract void MethodAbs();
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
