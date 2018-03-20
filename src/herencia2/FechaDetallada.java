//Es accesible de la clase:static
//No static: Necesita de un objeto

public class FechaDetallada extends Fecha{
    private static String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agisto","Septiembre","Octubre","Noviembre","Diciembre"};

    public String toString(){
        return getDia()+"/"+meses[getMes()-1]+"/"+getAnio()+"";
    }
}