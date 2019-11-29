package top.codepig.Demo02;

public class GerneicClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
    /*
    创建含有泛型的成员方法
    格式：
    修饰符 <泛型> 返回类型 方法名称（参数列表<使用泛型>）{
        //方法体
    }
     */
    public <M> void Method(M m){
        System.out.println(m);
    }

    /*创建含有泛型的静态方法
    格式：
    修饰符 <泛型> 返回类型 方法名称（参数列表<使用泛型>）{
        //方法体
    }
     */
    public static <S> void MethodStatic(S s){
        System.out.println(s);
    }
}
