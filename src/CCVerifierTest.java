import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CCVerifierTest {

	private CCVerifier ccVerifier;

	@Before
    public void setUp() throws Exception {
		ccVerifier = new CCVerifier();
    }
	
	@Test                                               
    public void testCreditCardName() {
		String file = "src/test.csv";
		CreditCard cc = ccVerifier.cardVerify(file);
		System.out.println(cc.getName());
        assertEquals("testName", cc.getName().toString(),"Name is not matching");          
    }

}
