package zi07stream;

import java.util.stream.Stream;

public class demo02filter {
    public static void main(String[] args) {
        Stream<Integer> obj = Stream.of(1, 2, 3, 4, 5, 6, 7);
      /*  long count = obj.count();
        System.out.println(count);*/
        Stream<Integer> limit = obj.filter(one -> one > 3).skip(2).limit(1);
        limit.forEach(one1-> System.out.println(one1));
    }
}
