package demo07set;

import java.util.ArrayList;
import java.util.Collections;

public class zzCollection {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<>();
        Collections.addAll(obj,"c","d","a","b","c","d");
        System.out.println(obj);
        Collections.shuffle(obj);
        System.out.println(obj);
    }
}
