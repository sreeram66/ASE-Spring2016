import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPerimeter {
	Perimeter p = new Perimeter();
	Double perimeter = p.parimeterTestInput(11.0);
	
	Double testPerimeter = 44.0;
	
	@Test
	public void test() {
		
		System.out.println("@Test conversion(): " + perimeter + " = " + testPerimeter);
		assertEquals(testPerimeter, perimeter);
		
	}
}
