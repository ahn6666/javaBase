package day09Extendsdrill;

import java.util.ArrayList;

public class message extends base{
    public message() {
    }

    public message(String name, int num) {
        super(name, num);
    }
    public ArrayList<Integer> send(int allMoney,int count)
    {
        //首先需要一个集合，存放若干个红包
        ArrayList<Integer> redList =new ArrayList<>();
        //然后看下群主有多少钱
        int leftmoney=super.getNum();
        //判断一下余额
        if(leftmoney<allMoney)
        {
            System.out.println("余额不足");
            return redList;
        }
        else {
            //重新设置一下余额
            super.setNum(leftmoney-allMoney);
            int ave=allMoney/count;
            int yushu=allMoney%count;
            for (int i = 0; i < count-1; i++) {
                redList.add(ave);
            }
            int last=ave+yushu;
            redList.add(last);
            return redList;
        }

    }


}
