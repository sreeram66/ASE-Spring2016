import static org.junit.Assert.*;

import org.junit.Test;

public class TestArea {
	
	Area a = new Area();
	Double area = a.areaTestInput(8.0);
	
	Double testArea = 64.0;
	
	@Test
	public void test() {
		
		System.out.println("@Test conversion(): " + area + " = " + testArea);
		assertEquals(testArea, area);
		
	}
}