package day09Extendsdrill;

import java.util.ArrayList;
import java.util.Random;

public class menber extends base {
    public menber() {
    }

    public menber(String name, int num) {
        super(name, num);
    }
    public void receive(ArrayList<Integer> list)
    {
        //随机找出一个人
        int index=new Random().nextInt(list.size());
        //根据索引移除
        int rightMoney=list.remove(index);
        //获取当前的钱
        int delta=rightMoney+super.getNum();
        //重新设置
        super.setNum(delta);
    }
}
