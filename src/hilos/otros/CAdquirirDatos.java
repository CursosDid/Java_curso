
public class CAdquirirDatos extends Thread
{
	private CBufer m; // objeto para almacenar los datos
	public CAdquirirDatos(CBufer muestras)//contructor
	{
		m = muestras;
	}
	public void run()
	{
		int i = 0;
		do
		{
			i = m.adquirirDato(getName());//adquirir datos
		}while( i < m.tamaño);
	}
}