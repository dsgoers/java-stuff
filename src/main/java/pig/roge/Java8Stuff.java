package pig.roge;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class Java8Stuff {
    private Java8Stuff() { }

    private static final String ROGE = "Roge";
    private static final List<String> PIGS_LIST = Lists.newArrayList(
            ROGE, "Daisy", "Satu");

    public static void main(final String[] args) {
        PIGS_LIST.forEach(System.out::print);
        System.out.println();

        PIGS_LIST.forEach((pig) -> {
            String newPig = pig.concat("mode");
            System.out.print(newPig + " ");
        });
        System.out.println();

        List<String> filteredPigsList = PIGS_LIST.stream().filter((pig) -> {
            if (pig.equals(ROGE)) {
                System.out.println("Removed pig");
                return false;
            } else {
                return true;
            }
        }).collect(Collectors.toList());
        System.out.println(filteredPigsList);

        Function<String, Void> roge = pig -> {
            System.out.println(pig.toUpperCase());
            return null;
        };
        roge.apply("daisy");
    }
}
