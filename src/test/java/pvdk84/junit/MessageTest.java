package pvdk84.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for Message
 */

public class MessageTest {

    String testMessage = "Hello World";

    Message message = new Message(testMessage);

    @Test
    public void testMessage() {
        assertEquals(testMessage, message.printMessage());
    }
}
