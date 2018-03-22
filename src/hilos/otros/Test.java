
public class Test
{
		public static void main(String[] args)
		{
			//ContadorAdelante cuentaAdelante = new ContadorAdelante("Contador+");
			//ContadorAtras objetoCuentaAtras = new ContadorAtras("Contador-");
			
			/*CBufer muestras = new CBufer(10);
			CAdquirirDatos adquirirDatos_0 = new CAdquirirDatos(muestras);
			CAdquirirDatos adquirirDatos_1 = new CAdquirirDatos(muestras);
			adquirirDatos_0.start();
			adquirirDatos_1.start();*/
			
			CMensaje mensaje = new CMensaje();
			Productor productor1 = new Productor(mensaje);
			Consumidor consumidor1 = new Consumidor(mensaje);
			
			productor1.start();
			consumidor1.start();
		}
}