package demo06list;

import java.util.LinkedList;

public class list02LinkedList {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<>();
        obj.add("A");
        obj.add("d");
        obj.add("c");
        obj.add("b");
        obj.add("e");
        System.out.println(obj);//[A, d, c, b, e]
        obj.addFirst("a");
        System.out.println(obj);//[a, A, d, c, b, e]
        obj.addLast("hi");
        System.out.println(obj);//[a, A, d, c, b, e]
        obj.push("hello");
        System.out.println(obj);//[hello, a, A, d, c, b, e, hi]
        String first = obj.getFirst();
        System.out.println(first);//hello
        String last = obj.getLast();
        System.out.println(last);//hello
        System.out.println("===========");
        System.out.println(obj);//[hello, a, A, d, c, b, e, hi]
        String s = obj.removeFirst();
        System.out.println(s);//hello
        System.out.println(obj);//[a, A, d, c, b, e, hi]
        System.out.println("========");
        String s1 = obj.removeLast();
        System.out.println(s1);//hi
        System.out.println(obj);//[a, A, d, c, b, e]
        System.out.println("========");
        String pop = obj.pop();
        System.out.println(pop);//a
        System.out.println(obj);//[A, d, c, b, e]

        boolean empty = obj.isEmpty();
        System.out.println(empty);//false
        obj.clear();
        boolean empty1 = obj.isEmpty();
        System.out.println(empty1);//true


    }
}
