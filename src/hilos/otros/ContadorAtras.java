
public class ContadorAtras implements Runnable
{
	private Thread cuentaAtras;
	
	public ContadorAtras (String nombre) // constructor
	{
		cuentaAtras = new Thread(this); // Objeto de clase thread
		if(nombre != null) cuentaAtras.setName(nombre);
		cuentaAtras.start();// el hilo ejecuta el método run de ContadorAtras
	}
	public ContadorAtras(){ this(null); } //constructor
	
	public void run()
	{
		for( int i = 100000; i > 0; i--)
			System.out.print("\t\t\t"+cuentaAtras.getName()+" "+ i + "\r");
		System.out.println();
	}
}