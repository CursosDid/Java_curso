public class CHipodromo
{
	public static void main(String[] args)
	{
		String nomCaballo = null;
		final int num_participantes = 5;
		
		CTablon tablon = new CTablon(num_participantes);
		CCaballo[] participante = new CCaballo[num_participantes];
		CMarcador marcador = new CMarcador(tablon);
		
		//iniciar el hilo marcador
		marcador.start();
		for(int i = 0; i < num_participantes; ++i)
		{
			//Datos de los participantes
			nomCaballo = new String("Caballo "+i);
			participante[i] = new CCaballo(i, nomCaballo, tablon);
			//iniciar los hilos de los caballos participantes
			//iniciar los hilos de los caballos participantes

			participante[i].start();
		}
	}
}