package sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSum {

	@Test
	public void testSum2Num2() {
		assertEquals(4, sum(1,3));
	}


	@Test
	public void testSumNumWithZero() {
		assertEquals(2, sum(2,0));
		assertEquals(2, sum(0,2));
	}

	
	int sum(int a, int b) {
		return a+b;
	}
}
