package top.codepig.Demo04;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {

    }

    public void receive(ArrayList<Integer> list){
        //随机获取一个集合的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合当中删除，并且得到被删除的红包，给自己
        Integer remove = list.remove(index);
        int money = super.getMoney();
        super.setMoney(money+remove);
    }
}
