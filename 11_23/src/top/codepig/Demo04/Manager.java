package top.codepig.Demo04;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
       // super(name, money);
        super(name,money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        //看群主有多少钱
        int leftMoney = super.getMoney();
        if(totalMoney>leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        // 扣钱
        super.setMoney(leftMoney-totalMoney);
        int avg = totalMoney/count;
        int mod = totalMoney%count; //余数
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last = avg+mod;
        redList.add(last);
        return redList;
    }
}
