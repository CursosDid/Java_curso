public class Productor extends Thread
{
	private CMensaje mensaje; //ultimo mensaje producido
	public Productor( CMensaje c) // constructor
	{
		mensaje = c;
	}
	public void run()
	{
		int numeroMsj; // numero de mensaje
		while(true)
		{
			numeroMsj = (int)(Math.random()*100);
			mensaje.almacenar(numeroMsj);// almacenar el mensaje
			
			System.out.println("Productor "+ getName() + " almacenar el mensaje #" + numeroMsj);
			
			try
			{
				int msegs = (int)(Math.random()*100);
				//poner a dormir el hilo hasta que se produzca el siguiente mensaje
				sleep(msegs);
			}
			catch (InterruptedException e){	}
		}
	}
}