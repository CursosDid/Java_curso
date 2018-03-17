package herencia.servicios;
// Final, clase con contendio estático o que no se heredará a nadie.
// Final, definición de constantes
public final class Categoria{
    private static final int DIRECTOR = 0;
    private static final int ADMINISTRADOR = 1;
    private static final int JEFEDEPTO = 2;
    private static final int BECARIO = 3;
    private static final int PREBECARIO = 4;
    private static final int SERVICIO = 5;
    private static String categoria [] = { "Director", "Administrador", "Jefe del departamento", "Becario", "Pre-becario", 
                                            "Servicio", "No aplica"};
    public static String obtenCategoria (int opcion){
        switch ( opcion ){
            case DIRECTOR:
                return categoria[0];
            case ADMINISTRADOR:
                return categoria[1]; 
            case JEFEDEPTO:
                return categoria[2]; 
            case BECARIO:
                return categoria[3]; 
            case PREBECARIO:
                return categoria[4]; 
            case SERVICIO:
                return categoria[5]; 
            default:
                return categoria[6];                                                                                                              
        }
    }                                              
}