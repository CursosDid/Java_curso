public class ExcepcionPuntero {
    public static final int TAMANIO = 10;
    public static int indAuxiliar = 0;
    public static double arreglo [] = new double [TAMANIO];
    public static void acceso (){
        try{
        for ( indAuxiliar = 0; indAuxiliar < TAMANIO; indAuxiliar++ )
            arreglo[indAuxiliar] = indAuxiliar;
        System.out.println("Obtengo elemto "+indAuxiliar
                            +" "+arreglo[TAMANIO + 1]);}
        catch (Exception ex)
        {System.out.println("Error: "+ex.getMessage());}
    }
}