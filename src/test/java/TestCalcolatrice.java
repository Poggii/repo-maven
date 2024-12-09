import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestCalcolatrice {

	@Test
	void testSomma() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.somma(5,6);
		
		Assert.assertEquals(11, res, 0);
	}

	@Test
	void testSomma2() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.somma(6,6);
		
		Assert.assertEquals(11, res, 0);
	}
}
