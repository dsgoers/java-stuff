package pig.roge;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;

public class CodingTest {
    public static void main(final String[] args) {
        CodingTest codingTest = new CodingTest();

        System.out.println(codingTest.sumLists(
                new ArrayList<>(asList(1, 2, 3)),
                new ArrayList<>(asList(3, 4, 5)))
        );

        System.out.println(codingTest.sharedChars("snowing", "snake"));

        System.out.println(codingTest.buildUppercase("thisIsCamelCase"));
    }

    /**
     * Given two lists of any lengths, return a single integer that is the sum
     * of the values in both lists
     * For example, list1 being [1, 2, 3] and list2 being [3, 4, 5] would
     * return 18
     * @param list1
     * @param list2
     */
    public int sumLists(final List<Integer> list1, final List<Integer> list2) {
        return list1.stream().reduce(0, (a, b) -> a += b)
                    + list2.stream().reduce(0, (a, b) -> a += b);
    }

    /**
     * Given two strings, return the number of indices that share the same
     * character
     * For example, string1 being 'LOREM' and string2 being 'IPSUM' would
     * return 1, string1 being 'Snake' and string2 being 'snowing' would
     * return 1
     * @param string1
     * @param string2
     * @return
     */
    public int sharedChars(final String string1, final String string2) {
        int sharedChars = 0;

        for (int x = 0; x < Math.min(string1.length(), string2.length()); x++) {
            if (string1.charAt(x) == string2.charAt(x)) {
                sharedChars++;
            }
        }

        return sharedChars;
    }

    /**
     * Given a string, build a new string with only the uppercase characters
     * of that string
     * For example, the input string 'thisIsCamelCase' would return 'ICC'
     * @param string
     * @return
     */
    public String buildUppercase(final String string) {
        StringBuilder uppercaseString = new StringBuilder();

        for (int y = 0; y < string.length(); y++) {
            char charAt = string.charAt(y);

            if (charAt >= 65 && charAt <= 90) {
                uppercaseString.append(charAt);
            }
        }

        return uppercaseString.toString();
    }
}
