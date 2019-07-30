package pig.roge;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class CodilityChallengeTwo {
    private CodilityChallengeTwo() { }

    public static void main(final String[] args) {
        int[] arrayA = {1, 5, 3, 3, 7};
        int[] arrayB = {1, 3, 5, 3, 4};
        int[] arrayC = {1, 3, 5};

        System.out.println(isSortableInOneSwapOrLess(arrayA));
        System.out.println(isSortableInOneSwapOrLess(arrayB));
        System.out.println(isSortableInOneSwapOrLess(arrayC));
    }

    public static boolean isSortableInOneSwapOrLess(final int[] array) {
        for (int x = 0; x < array.length; x++) {
            if (hasTwoOrMoreUnequalSmallerValuesAhead(x, array)) {
                return false;
            }
        }

        return true;
    }

    private static boolean hasTwoOrMoreUnequalSmallerValuesAhead(
            final int index, final int[] array) {
        int subjectValue = array[index];
        Integer smallerValueAhead = null;

        for (int aheadValue: Arrays.stream(array)
                .skip(index).boxed().collect(Collectors.toList())) {

            if (aheadValue < subjectValue) {
                if (smallerValueAhead == null) {
                    smallerValueAhead = aheadValue;

                } else if (smallerValueAhead != aheadValue) {
                    return true;
                }

            }
        }

        return false;
    }
}
