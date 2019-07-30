package pig.roge;

import org.junit.Assert;
import org.junit.Test;

import static pig.roge.CodilityChallengeTwo.isSortableInOneSwapOrLess;

public class CodilityChallengeTwoTests {
    @Test
    public void testOne() {
        int[] array = {1, 5, 3, 3, 7};

        Assert.assertTrue(isSortableInOneSwapOrLess(array));
    }

    @Test
    public void testTwo() {
        int[] array = {1, 3, 5, 3, 4};

        Assert.assertFalse(isSortableInOneSwapOrLess(array));
    }

    @Test
    public void testThree() {
        int[] array = {1, 3, 5};

        Assert.assertTrue(isSortableInOneSwapOrLess(array));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};

        Assert.assertTrue(isSortableInOneSwapOrLess(array));
    }
}
