package patterns.factory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KnifeFactoryTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Testing KnifeFactory");
    }

    @Test
    public void testGet() {
        var knife = KnifeFactory.createKnife(Knife.KnifeType.BUTCHER);
        assertEquals(knife.getClass(), ButcherKnife.class);
    }
}