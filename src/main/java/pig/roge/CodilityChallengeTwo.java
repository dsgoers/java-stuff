package pig.roge;

public final class CodilityChallengeTwo {

    public static void main(final String[] args) {
        int[] A = {1, 5, 3, 3, 7};
        int[] B = {1, 3, 5, 3, 4};
        int[] C = {1, 3, 5};

        System.out.println(isSortableInOneSwapOrLess(A));
        System.out.println(isSortableInOneSwapOrLess(B));
        System.out.println(isSortableInOneSwapOrLess(C));
    }

    public static boolean isSortableInOneSwapOrLess(int[] array) {
        for(int x = 0; x < array.length; x++) {

            if(hasTwoOrMoreUnequalSmallerValuesAhead(x, array)) {
                return false;
            }
        }

        return true;
    }

    public static boolean hasTwoOrMoreUnequalSmallerValuesAhead(int index, int[] array) {
        int value = array[index];
        int smallerValueAhead = -1;

        for(int x = index + 1; x < array.length; x++) {
            int valueAtIndex = array[x];

            if(valueAtIndex < value) {
                if(smallerValueAhead == -1) {
                    smallerValueAhead = valueAtIndex;
                } else if (smallerValueAhead != valueAtIndex) {
                    return true;
                }

            }
        }

        return false;
    }
}
