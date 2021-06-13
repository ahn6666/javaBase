package demo07set;

import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        ArrayList<sort1per> obj=new ArrayList<>();
        obj.add(new sort1per("迪丽热巴",18));
        obj.add(new sort1per("古力娜扎",20));
        obj.add(new sort1per("马尔扎哈",21));
        obj.add(new sort1per("迪丽热巴",20));
        Collections.sort(obj);
        System.out.println(obj);
    }
}
