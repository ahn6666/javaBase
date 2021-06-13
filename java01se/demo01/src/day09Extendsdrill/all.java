package day09Extendsdrill;

import java.util.ArrayList;

public class all {
    public static void main(String[] args) {
        message boss=new message("老板",100);
        menber one=new menber("A",0);
        menber two=new menber("B",0);
        menber three=new menber("C",0);
        boss.show();
        one.show();
        two.show();
        three.show();
        System.out.println("====");
        ArrayList<Integer> redList=boss.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        boss.show();
        one.show();
        two.show();
        three.show();

    }
}
