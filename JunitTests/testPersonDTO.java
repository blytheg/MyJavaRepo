package JunitTests;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testPersonDTO {

	@Before
	public void testBefore()throws Exception {
		System.out.println("Before test");
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}


	@After
	public void testAfter() throws Exception {
		System.out.println("After test");
	}
}
