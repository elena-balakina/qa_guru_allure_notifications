package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledTests {

    @Test
    @Disabled
    public void disabled1Test() {
        assertTrue(true);
    }

    @Test
    @Disabled
    public void disabled2Test() {
        assertTrue(true);
    }

    @Test
    @Disabled
    public void disabled3Test() {
        assertTrue(true);
    }

    @Test
    @Disabled
    public void disabled4Test() {
        assertTrue(true);
    }

    @Test
    @Disabled
    public void disabled5Test() {
        assertTrue(true);
    }
}
