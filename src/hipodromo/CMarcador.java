public class CMarcador extends Thread
{
	private CTablon m_tablon; // acceso al tablon
	
	public CMarcador(CTablon tablon)
	{
		m_tablon = tablon;
	}
	
	public void run()
	{
		int nParticipantes;
		 nParticipantes = m_tablon.numParticipantes();
		 
		 while(!m_tablon.finCarrera())
		 {
			 System.out.println("POSICIONES DE CARRERA");
			 System.out.println("----------------------");
			 for(int i=0; i < nParticipantes; ++i)
			 {
				 for(int p = 0; p < m_tablon.posicion(i)-1; ++p)
					 System.out.print(".");//distancia recorrida
				 System.out.println("*");// caballo
			 }
			 try
			 {
				 sleep(500);
			 }
			 catch(InterruptedException e){}
		 }
	}
}