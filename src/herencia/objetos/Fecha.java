package herencia.objetos;
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
    //Modificamos el método toString(), heredado de la clase object
    public String toString(){
        return getDia()+" "+getMes()+" "+getAnio();
    }
}