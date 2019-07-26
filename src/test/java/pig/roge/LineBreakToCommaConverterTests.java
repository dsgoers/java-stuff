package pig.roge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LineBreakToCommaConverterTests {

    private LineBreakToCommaConverter lineBreakToCommaConverter;
    private final String lineBreakDelimitedList = "Roge\nDaisy\n";
    private final String commandDelimitedList = "Roge, Daisy, ";

    @Before
    public void setup() {
        lineBreakToCommaConverter = new LineBreakToCommaConverter(
                lineBreakDelimitedList
        );
    }

    @Test
    public void testLineBreaksReplacedWithCommas() {
        Assert.assertEquals(lineBreakToCommaConverter.execute(),
                commandDelimitedList);
    }
}
