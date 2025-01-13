
public class Calcolatrice {
	public double somma (double...addendi)
	{
		double s = 0;
		for(double addendo : addendi)
		{
			if(addendo < 0) {
				System.out.println("addendo è negativo");
			}
			if(addendo == 0) {
				System.out.println("addendo è 0");
			}
			if(addendo > 0) {
				System.out.println("addendo è positivo");
			}
			s = s+ addendo;
		}
		return s;
	}
	
	public double differenza (double d1, double d2) {
		double diff = 0;
		diff = d1-d2;
		return diff;
	}
	
	
	public double moltiplicazione(double...moltiplicandi)
	{
		double s=1;
		for(double moltiplicando:moltiplicandi)
		{
			s=s*moltiplicando;
		}
		return s;
	}
	
	public double divisione(double divisore, double dividendo) throws Exception
	{
		double ris;
		ris = divisore/dividendo;
		if(dividendo==0)
		{
			throw new Exception();
		}
		return ris;
	}
}
