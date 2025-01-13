import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Assert;

import org.junit.Test;

public class TestCalcolatrice {

	@Test
	public void testSomma() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.somma(5,6);
		
		assertEquals(11, res);
	}
	@Test
	public void testSomma2() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.somma(6,6);
		
		assertEquals(12, res);
	}
	@Test
	public void testSommaNegativo() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.somma(10,-5);
		
		assertEquals(5, res);
	}
	@Test
	public void testSott() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.differenza(5,6);
		
		assertEquals(-1, res);
	}
	@Test
	public void testSott2() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.differenza(6,6);
		
		assertEquals(0, res);
	}
	@Test
	public void testSottNeg() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.differenza(-5,-3);
		
		assertEquals(-2, res);
	}
	@Test
	public void testMolt() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.moltiplicazione(5,6);
		
		assertEquals(30, res);
	}
	@Test
	public void testMolt2() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.moltiplicazione(6,6);
		
		assertEquals(36, res);
	}
	@Test
	public void testMoltNeg() 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.moltiplicazione(-5,6);
		
		assertEquals(-30, res);
	}
	@Test
	public void testDiv()  throws Exception 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.divisione(8,8);
		
		assertEquals(1, res);
	}
	@Test
	public void testDiv2()  throws Exception 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.divisione(20,4);
		
		assertEquals(5, res);
	}
	@Test
	public void testDivNeg()  throws Exception 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.divisione(-5,10);
		
		assertEquals(-0.5, res);
	}
	
	@Test
	public void testDiv3()  throws Exception 
	{	
		Calcolatrice c = new Calcolatrice();
		
		double res =  c.divisione(-5,10);
		
		assertNotEquals(82, res);
	}
	@Test
	public void testDiv0() throws Exception 
	{	
		Calcolatrice c = new Calcolatrice();
		
		try
		{
			double res =  c.divisione(5,0);
			assertEquals(null, res);
		}
		catch(Exception e)
		{
			System.out.println("impossibile div per 0");
			
		}
		
		
	}
}
