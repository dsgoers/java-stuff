package pig.roge;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class Java8Stuff {
    private static final String ROGE = "Roge";
    private static final List<String> PIGS_LIST = Lists.newArrayList(ROGE, "Daisy", "Satu");

    public static void main(String [] args) {
        PIGS_LIST.forEach(System.out::print);
        System.out.println();

        PIGS_LIST.forEach((pig) -> {
            String newPig = pig.concat("mode");
            System.out.print(newPig + " ");
        });
        System.out.println();

        List<String> filteredPigsList = PIGS_LIST.stream().filter((pig) -> {
            if(pig.equals(ROGE)) {
                return false;
            } else {
                return true;
            }
        }).collect(Collectors.toList());
        System.out.println(filteredPigsList);
    }
}
