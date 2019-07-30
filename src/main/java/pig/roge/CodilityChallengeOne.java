package pig.roge;

public final class CodilityChallengeOne {
    private CodilityChallengeOne() { }

    public static void main(final String[] args) {
        int[] arrayA = {5, 4, 0, 3, 1, 6, 2};
        int[] arrayB = {};

        System.out.println(longestNeckLaceLength(arrayA));
        System.out.println(longestNeckLaceLength(arrayB));
    }

    public static int longestNeckLaceLength(final int[] array) {
        int longestNeckLaceLength = 0;

        for (int x = 0; x < array.length; x++) {
            int value = array[x];

            if (value != -1) {
                longestNeckLaceLength = Math.max(
                        longestNeckLaceLength,
                        necklaceLength(x, value, array)
                );
            }
        }

        return longestNeckLaceLength;
    }

    private static int necklaceLength(final int initialIndex,
                                     final int value,
                                     final int[] array) {
        if (value != initialIndex) {
            int newValue = array[value];
            array[value] = -1;

            return 1 + necklaceLength(initialIndex, newValue, array);
        }

        return 1;
    }
}
