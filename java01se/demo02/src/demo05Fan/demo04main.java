package demo05Fan;

import java.util.ArrayList;
import java.util.Collection;

public class demo04main {
    public static void main(String[] args) {
        Collection<Integer> list1=new ArrayList<Integer>();
        Collection<String> list2=new ArrayList<String>();
        Collection<Number> list3=new ArrayList<Number>();
        Collection<Object> list4=new ArrayList<Object>();

        getMonthon(list1);
//        getMonthon(list2);//报错
        getMonthon(list3);
//        getMonthon(list4);//报错
        System.out.println("========");
//        getMonthon1(list1);//报错
//        getMonthon1(list2);//报错
        getMonthon1(list3);
        getMonthon1(list4);
    }
    public static void getMonthon(Collection<? extends Number> coll){}
    public static void getMonthon1(Collection<? super Number> coll){}
}
