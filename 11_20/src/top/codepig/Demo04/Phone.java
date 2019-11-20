package top.codepig.Demo04;

public class Phone {
    //属性 成员变量
    String brand;
    double price;
    String color;
    //行为  成员方法
    public void call(String who){
        System.out.println("给"+ who + "打电话");
    }
    public void sendMessgae(){
        System.out.println("群发短信");
    }
}
