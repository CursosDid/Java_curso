
public class ContadorAdelante extends Thread
{
	public ContadorAdelante (String nombre) // constructor
	{
		if(nombre != null) setName(nombre);
		start();
	}
	public ContadorAdelante(){ this(null); } //constructor
	
	public void run()
	{
		for( int i = 1; i <= 100000; i++)
			System.out.print(getName() + " " + i + "\r");
		System.out.println();
	}
}