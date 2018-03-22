public class CMensaje
{
	private String textoMensaje;
	private int numeroMensaje;
	private boolean disponible = false;
	
	public synchronized void almacenar(int nmsj)
	{
		while( disponible == true)
		{
			//el último mensaje aún no ha sido mostrado
			try
			{
				wait(); // el hilo se pone a dormir y cede el monitor
			}
			catch(InterruptedException e){}
		}
		
		
		numeroMensaje = nmsj;
		//Suponer operaciones para buscar el mensjae en una tabla de mensajes
		textoMensaje = "mensaje";
		disponible = true;
		notifyAll();
	}
	
	public synchronized String obtener()
	{
		while( disponible == false)
		{
			//No hay mensaje
			try
			{
				wait(); // el hilo se pone a dormir y cede el monitor
			}
			catch(InterruptedException e){}
		}
		
		disponible = false;
		notifyAll();
		
		//Componer el mensjae bajo un determinado formato
		String mensaje;
		mensaje = textoMensaje + " #" + numeroMensaje;
		return mensaje;
	}
}