package herencia.otros_objetos;
import herencia.objetos.Fecha;
public class FechaDetallada extends Fecha{
    private static String meses[]={"Enero" ,"Febrero" ,"Marzo" ,"Abril" ,"Mayo" ,"Junio" ,"Julio",
                                    "Agosto" ,"Septiembre" ,"Octubre" ,"Noviembre" ,"Diciembre"};
    public String toString(){
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
    }
    public FechaDetallada(){
        this(0,0,0);
    }
    public FechaDetallada(int dia, int mes, int anio){
        super(0,0,0);
    }
    // No requiere instancia de objeto ya que la propia clase posee por default el arreglo
    public static String catalogoMeses (int mes){
        return meses[mes - 1];
    }                                    
}