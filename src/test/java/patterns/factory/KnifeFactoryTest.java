package patterns.factory;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KnifeFactoryTest {

    @Test
    public void testKnifeCreation() {
        var knife = KnifeFactory.createKnife(Knife.KnifeType.BUTCHER);
        assertEquals(knife.getClass(), ButcherKnife.class);
    }

    @Test
    public void testFailure() {
        var bGotException = false;
        try {
            KnifeFactory.createKnife(Knife.KnifeType.NONE);
        } catch (IllegalArgumentException e) {
            bGotException = true;
        }
        assertTrue(bGotException);
    }
}