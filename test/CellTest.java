import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CellTest {

	@Test
	public void testToStringX() {
		Cell ce = new Cell();
		ce.setText("X");
		
		String result = ce.toString();
		System.out.println(result);
		assertEquals("X", result);
	}
	
	@Test
	public void testToStringDot() {
		Cell ce = new Cell();
		ce.setText(".");
		
		String result = ce.toString();
		System.out.println(result);
		assertEquals(".", result);
	}
	
	@Test
	public void testToStringelse() {
		Cell ce = new Cell();
		ce.setText("E");
		
		String result = ce.toString();
		System.out.println(result);
		assertEquals(".", result);
	}

}