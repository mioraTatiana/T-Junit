import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class MoneyTest {

	@Test
	
	//public void test() {
		//fail("Not yet implemented");
	//}
	
	public void testSimpleAdd(){
		Money m12CHF = new Money(12, "CHF");
		Money m14CHF = new Money(14, "CHF");
		Money expected = new Money(26, "CHF");
		Money result = m12CHF.add(m14CHF);
		assertTrue(expected.equals(result));
		
	}
	
	@Before
	public void testEquals(){
		Money m12CHF = new Money(12, "CHF");
		Money m14CHF = new Money(14, "CHF");
		
		assertTrue(!m12CHF.equals(null));
		assertEquals(m12CHF, m12CHF);
		assertEquals(m12CHF, new Money(12, "CHF"));
		assertTrue(!m12CHF.equals(m14CHF));
		
	}
	
	

}
