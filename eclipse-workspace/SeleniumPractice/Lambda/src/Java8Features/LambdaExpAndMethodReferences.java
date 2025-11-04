package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer; // ✅ required import

public class LambdaExpAndMethodReferences {

    public static void main(String[] args) {

        List<String> nameslist = Arrays.asList("Tom", "Jerry", "Arpit", "Simon");

        // 1. With Anonymous Class
        nameslist.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });

        // 2. Lambda Expression
        nameslist.forEach(str -> {
            System.out.println(str);
        });

        // 3. Method Reference
        nameslist.forEach(System.out::println);
    }
}
