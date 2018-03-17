package herencia.objetos;
public class Persona {
    private String nombre, edad, curp;

       // Creamos los métodos de acceso para sus respectivos atributos
    public String getNombre(){
        return nombre;
    }
    public String getEdad(){
        return edad;
    }
    public String getCurp(){
        return curp;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(String edad){
        this.edad = edad;
    }
    public void setCurp(String curp){
        this.curp = curp;
    }
    //Modificamos el método constructor nulo y además lo definimos.
    public Persona(String nombre, String edad, String curp){
        this.nombre = nombre;
        this.edad = edad;
        this.curp = curp;
    }
    public Persona (){}
    //Modificamos el método toString(), heredado de la clase object
    public String toString(){
        return getNombre()+" "+getEdad()+" "+getCurp();
    }
}