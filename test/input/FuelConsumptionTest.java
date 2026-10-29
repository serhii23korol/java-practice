package input;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuelConsumptionTest {

	@Test
	void throwsWhenLitersIsZero() {
		try {
			FuelConsumption.calculateConsumption(0, 1);
			fail("Expected an IllegalArgumentException");
        }
		catch (IllegalArgumentException e){
			// test passes
		}
	}

	@Test
	void throwsWhenKilometersIsZero() {
		try {
			FuelConsumption.calculateConsumption(1, 0);
			fail("Expected an IllegalArgumentException");
		}
		catch (IllegalArgumentException e){
			// test passes
		}
	}
}
