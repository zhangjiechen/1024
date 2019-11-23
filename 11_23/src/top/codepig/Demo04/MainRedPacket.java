package top.codepig.Demo04;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("有钱人",1000);

        Member A = new Member("路人A",10);
        Member B = new Member("路人B",0);
        Member C = new Member("路人C",0);
        Member D = new Member("路人D",0);
        Member E = new Member("路人E",0);
        manager.show();
        A.show();
        B.show();
        C.show();
        D.show();
        E.show();
        System.out.println("=======================");
        ArrayList<Integer> redList = manager.send(621,5);
        A.receive(redList);
        B.receive(redList);
        C.receive(redList);
        D.receive(redList);
        E.receive(redList);
        manager.show();
        A.show();
        B.show();
        C.show();
        D.show();
        E.show();



    }
}
