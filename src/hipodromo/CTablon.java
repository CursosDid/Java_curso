public class CTablon
{
	private int[] m_Posicion; // posicion de los caballos durane la carrera
	private int m_nParticipantes; // numero de participantes
	
	public CTablon(int participantes)
	{
		//Crear e iniciar la matriz de posiciones de los participantes
		m_nParticipantes = participantes;
		m_Posicion = new int[m_nParticipantes];
		for(int i = 0; i < m_nParticipantes; ++i)
			m_Posicion[i] = 0; // contadores a cero
	}
	
	public boolean finCarrera()
	{
		for(int i = 0; i < m_nParticipantes; ++i)
		{
			if(m_Posicion[i] == 75) //distancia a recorrer
				return true;
		}
		return false;
	}
	
	public void incrementarPosicion(int dorsal)
	{
		m_Posicion[dorsal]++;//posicion actual
	}
	
	public int numParticipantes()
	{
		return m_nParticipantes; // numero de participantes
	}
	public int posicion(int i){
		return m_Posicion[i];
	}
}