package pig.roge;

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

    public static boolean hasTwoOrMoreUnequalSmallerValuesAhead(
            final int index, final int[] array) {
        int value = array[index];
        int smallerValueAhead = -1;

        for (int x = index + 1; x < array.length; x++) {
            int valueAtIndex = array[x];

            if (valueAtIndex < value) {
                if (smallerValueAhead == -1) {
                    smallerValueAhead = valueAtIndex;
                } else if (smallerValueAhead != valueAtIndex) {
                    return true;
                }

            }
        }

        return false;
    }
}
