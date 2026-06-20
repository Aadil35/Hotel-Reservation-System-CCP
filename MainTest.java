import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testTotalBillCalculation() {
        double roomPrice = 5000;
        int nights = 2;

        double totalBill = roomPrice * nights;

        assertEquals(10000, totalBill);
    }

    @Test
    public void testRoomPriceShouldBePositive() {
        double roomPrice = 5000;

        assertTrue(roomPrice > 0);
    }

    @Test
    public void testNightsShouldBeGreaterThanZero() {
        int nights = 2;

        assertTrue(nights > 0);
    }
}