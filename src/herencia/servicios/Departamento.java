package herencia.servicios;
// Final, clase con contendio estático o que no se heredará a nadie.
// Final, definición de constantes
public final class Departamento{
    private static final int MESADIRECTIVA = 0;
    private static final int ADMINISTRACION = 1;
    private static final int DID = 2;
    private static final int DSC = 3;
    private static final int DSA = 4;
    private static final int DROS = 5;
    private static final int SALAS = 6;
    private static final int PREBECARIO = 7;
    private static final int ROTATORIO = 8;
    private static String departamentos [] = { "Mesa directiva ", "Administracion", "DID", "DSC", "DSA", "DROS",
                                                "Salas", "Pre-Becario", "Rotatorio", "No aplica"};
    public static String obtenDepartamento (int opcion){
        switch ( opcion ){
            case MESADIRECTIVA:
                return departamentos[0];
            case ADMINISTRACION:
                return departamentos[1]; 
            case DID:
                return departamentos[2]; 
            case DSC:
                return departamentos[3]; 
            case DSA:
                return departamentos[4]; 
            case DROS:
                return departamentos[5]; 
            case SALAS:
                return departamentos[6]; 
            case PREBECARIO:
                return departamentos[7];
            case ROTATORIO:
                return departamentos[8];
            default:
                return departamentos[9];                                                                                                              
        }
    }                                              
}