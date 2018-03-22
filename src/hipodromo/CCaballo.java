public class CCaballo extends Thread
{
	private CTablon tablon; // acceso al tablon
	private int dorsal; // numero de caballo
	private String nombre; // nomrbe de caballo
	
	public CCaballo()
	{
		nombre = new String("Caballo desconocido");
		dorsal = 0;
	}
	
	public CCaballo(int dor, String nom, CTablon t)
	{
		dorsal = dor;
		nombre = nom;
		tablon = t;
	}
	public void run()
	{
		int limiteInf = 1, limiteSup = 1000; // milisegundos
		//While(!tablon.finCarrera())
		while(!tablon.finCarrera())
		{
			try
			{
				sleep((int)((limiteSup-limiteInf+1)*Math.random()+limiteInf));
			}
			catch(InterruptedException e){}
			//avanzar
			tablon.incrementarPosicion(dorsal);
		}
	}
}