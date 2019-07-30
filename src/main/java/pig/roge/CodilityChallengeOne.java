package pig.roge;

public class CodilityChallengeOne {
    public static void main(final String[] args) {
        int[] A = {5, 4, 0, 3, 1, 6, 2};
        int[] B = {};

        System.out.println(longestNeckLaceLength(A));
        System.out.println(longestNeckLaceLength(B));
    }

    public static int longestNeckLaceLength(int[] array) {
        int longestNeckLaceLength = 0;

        for(int x = 0; x < array.length; x++) {
            if (array[x] != -1) {
                longestNeckLaceLength = Math.max(longestNeckLaceLength, necklaceLength(x, array));
            }
        }

        return longestNeckLaceLength;
    }

    public static int necklaceLength(int initialIndex, int[] array) {
        int index = initialIndex;
        int length = 0;
        int value = array[index];

        while(value != initialIndex) {
            length++;
            value = array[index];
            array[index] = -1;
            index = value;

        }

        return length;
    }
}
