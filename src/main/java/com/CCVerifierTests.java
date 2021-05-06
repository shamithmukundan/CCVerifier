package com.javainuse.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CCVerifierTests {
	
	private CCVerifier ccVerifier;

	@BeforeEach
    void setUp() throws Exception {
		ccVerifier = new CCVerifier();
    }
	
	@Test                                               
    public void testCreditCardName() {
		String file = "src/test.csv";
		CreditCar cc = ccVerifier.cardVerify(file);
        assertEquals("testName", cc.getName(),"Name is matching");          
    }
	
}
