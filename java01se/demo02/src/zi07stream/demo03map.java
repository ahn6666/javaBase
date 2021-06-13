package zi07stream;

import java.io.Serializable;
import java.util.stream.Stream;

public class demo03map {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3", "4", "5");
        Stream<Integer> integerStream = stringStream.map((String one) -> {
            return Integer.parseInt(one);
        });
        integerStream.forEach(one-> System.out.print(one));
        System.out.println();
        Stream<Integer> one = Stream.of(1, 2, 3, 4);
        Stream<String> a = Stream.of("a", "c", "f");
        Stream<? extends Serializable> concat = Stream.concat(one, a);
        concat.forEach(name-> System.out.print(name));


    }


}
