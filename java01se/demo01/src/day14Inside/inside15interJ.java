package day14Inside;

import java.util.ArrayList;
import java.util.List;

//接口用作参数
public class inside15interJ {
    public static void main(String[] args) {
        //左边是接口名称 右边是实现类 多态写法
        List<String> string=new ArrayList<>();
        List<String> res=use(string);
        for (int i = 0; i < string.size(); i++) {
            System.out.println(res.get(i));
        }
    }
    public static List<String> use(List<String> string)
    {
        string.add("迪丽热巴");
        string.add("迪丽热");
        string.add("迪丽");
        string.add("迪");
        return string;
    }
}
