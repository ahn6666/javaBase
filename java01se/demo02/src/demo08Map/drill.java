package demo08Map;

import java.util.HashMap;
import java.util.Scanner;

//题目：获取一个字符串对象
// 创建一个Map集合 键代表字符 值代表次数/*
// 遍历字符串得到每个字符
// 判断Map中是否有该键
// 如果没有 第一次出现 存储的次数为1 如果有 则说明已经出现 获取到对应的值在进行++在此存储
// 最后打印*/
public class drill {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("请输入字符");
        String ob=obj.next();
        methon(ob);
    }

    private static void methon(String ob) {
        HashMap<Character,Integer> obj=new HashMap<>();
        char[] chars = ob.toCharArray();
        for (char aChar : chars) {
            if(obj.containsKey(aChar))
            {
                Integer value=obj.get(aChar);
                value++;
                obj.put(aChar,value);
            }else {
                obj.put(aChar,1);
            }
        }
        for (Character character : obj.keySet()) {
            Integer integer = obj.get(character);
            System.out.println(character +"="+integer);
        }
    }
}
