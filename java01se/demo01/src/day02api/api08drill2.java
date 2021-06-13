package day02api;

import java.util.ArrayList;

//题目：自定义4个学生对象 添加到集合中 并遍历
public class api08drill2 {
    public static void main(String[] args) {
        ArrayList<api05student> stu=new ArrayList<>();
        api05student one=new api05student("迪丽热巴",18);
        api05student two=new api05student("古力娜扎",18);
        api05student three=new api05student("易烊千玺",18);
        api05student four=new api05student("秦牛正位",18);
        stu.add(one);
        stu.add(two);
        stu.add(three);
        stu.add(four);
        for (int i = 0; i < stu.size(); i++) {
            System.out.println(stu.get(i).getName()+stu.get(i).getAge());
        }
    }
}
