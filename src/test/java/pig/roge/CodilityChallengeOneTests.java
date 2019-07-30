package pig.roge;

import org.junit.Assert;
import org.junit.Test;

import static pig.roge.CodilityChallengeOne.longestNeckLaceLength;

public class CodilityChallengeOneTests {
    @Test
    public void testWithNonEmptyArray() {
        int[] array = {5, 4, 0, 3, 1, 6, 2};

        Assert.assertEquals(longestNeckLaceLength(array), 4);
    }

    @Test
    public void testWithArrayOfOneElement() {
        int[] array = {0};

        Assert.assertEquals(longestNeckLaceLength(array), 1);
    }

    @Test
    public void testWithEmptyArray() {
        int[] array = {};

        Assert.assertEquals(longestNeckLaceLength(array), 0);
    }
}

