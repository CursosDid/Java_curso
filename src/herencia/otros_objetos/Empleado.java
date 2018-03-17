package herencia.otros_objetos;
import herencia.objetos.Persona;
public class Empleado extends Persona{
    private String numCuenta, categoria, departamento;
    public Empleado (String nombre, String edad, String curp
                        ,String numCuenta, String categoria, String departamento){
        super(nombre, edad, curp);
        this.numCuenta = numCuenta;
        this.categoria = categoria;
        this.departamento = departamento;
    }
    public String getNumCuenta(){
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta){
        this.numCuenta = numCuenta;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getNombre(){
        return super.getNombre();
    }
    public void setNombre(String nombre){
        super.setNombre(nombre);
    }
    public String getEdad(){
        return super.getEdad();
    }
    public void setEdad(String edad){
        super.setEdad(edad);
    }
    public String getCurp(){
        return super.getCurp();
    }
    public void setCurp(String curp){
        super.setCurp(curp);
    }
    public String toString( ){
        return getNombre()+" "+getEdad()+" "+getCurp()+"\n"
                +getNumCuenta()+" "+getCategoria()+" "+getDepartamento();
    }        
} 