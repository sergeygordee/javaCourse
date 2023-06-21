package streamapipackege;

import java.util.stream.IntStream;

public class Program2 {
    public static void main(String[] args) {
        long count = IntStream.of(1,2,3,5,7,4,3,345,53,3)
                .filter(i -> i%2 ==0)
                .count();
        System.out.println(count);
    }
}
