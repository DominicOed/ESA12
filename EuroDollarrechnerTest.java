package school;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EuroDollarrechnerTest {
	EuroDollarrechner edrt;
	

	@BeforeEach
	void setUp() throws Exception {
		edrt = new EuroDollarrechner();
	}

	@Test
	void testNachEuro() {
		assertEquals(edrt.nachEuro(110.09), 101,"Nach Euro");
	}

	@Test
	void testNachUSDollar() {
		assertEquals(edrt.nachUSDollar(110),119.9,"Nach US Dollar");
	}

	@Test
	void testRundeDouble() {
		  assertEquals(edrt.rundeDouble(100.9, 0), 101, "Aufrunden");
	}
	

	
}
