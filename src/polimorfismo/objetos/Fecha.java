package polimorfismo.objetos;
public class Fecha{
    private int dia;
    private int mes;
    private int anio;

    // Creamos los métodos de acceso para sus respectivos atributos
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    //Modificamos el método constructor nulo y además lo definimos.
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public Fecha (){}
    public Fecha ( String cadFecha ){
        //Buscamos la primera ocurrencia de '/'
        int pos1 = cadFecha.indexOf('/');
        //Buscamos la última ocurrencia de '/'
        int pos2 = cadFecha.lastIndexOf('/');
        //Extraemos elemetos para los atributos
        String cadDia = cadFecha.substring(0,pos1);
        String cadMes = cadFecha.substring(pos1+1,pos2);
        String cadAnio = cadFecha.substring(pos2+1);
        // Asignamos a los respectivos atributos
        dia = Integer.parseInt(cadDia);
        mes = Integer.parseInt(cadMes);
        anio = Integer.parseInt(cadAnio);
    }
    //Modificamos el método toString(), heredado de la clase object
    public String toString(){
        return getDia()+" "+getMes()+" "+getAnio();
    }
}