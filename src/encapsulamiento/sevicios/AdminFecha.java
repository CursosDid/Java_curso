package encapsulamiento.servicios;
import encapsulamiento.objetos.Fecha;
public class AdminFecha extends Fecha{
    public void altaFecha (int dia, int mes, int anio){
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }
}