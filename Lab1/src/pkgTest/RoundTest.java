package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Roll;
import pkgCore.Round;

public class RoundTest {

	@Test
	public void test() {
		
		for (int a = 0; a < 10000; a++) {
			Round X = new Round();
			assertTrue(X.RollCount()<= 1000);
		
		}
		
		
	}

}
