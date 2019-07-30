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
            if (array[x] != -1) {
                longestNeckLaceLength = Math.max(longestNeckLaceLength,
                        necklaceLength(x, array)
                );
            }
        }

        return longestNeckLaceLength;
    }

    public static int necklaceLength(final int initialIndex,
                                     final int[] array) {
        int index = initialIndex;
        int length = 0;
        int value = array[index];

        while (value != initialIndex) {
            length++;
            value = array[index];
            array[index] = -1;
            index = value;

        }

        return length;
    }
}
