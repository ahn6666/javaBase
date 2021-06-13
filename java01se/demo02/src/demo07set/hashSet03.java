package demo07set;

import java.util.HashSet;

public class hashSet03 {
    public static void main(String[] args) {
        HashSet<person01Hash> obj=new HashSet<>();
        person01Hash p1=new person01Hash("迪丽热巴",18);
        person01Hash p2=new person01Hash("古力娜扎",20);
        person01Hash p3=new person01Hash("迪丽热巴",18);
        person01Hash p4=new person01Hash("马儿扎哈",30);
        System.out.println(p1.hashCode());//1967205423  添加hashcode 和equals2898343
        System.out.println(p3.hashCode());//42121758 添加hashcode 和equals2898343
        obj.add(p1);
        obj.add(p2);
        obj.add(p3);
        obj.add(p4);
        System.out.println(obj);//出现三个
    }
}
