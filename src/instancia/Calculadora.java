package instancia;
public class Calculadora {
    // Variable de instancia, es decir, necesita una instancia de objeto para utilizarce
    private int memoria1;
    public Calculadora (int dato){
        memoria1 = dato;
    }
    public String toString(){
        return Integer.toString(memoria1);
    }
    public void setMemoria1(int dato){
        memoria1 = dato;
    }
    public int getValor( ){
        return memoria1;
    }
    public int sumar (int dato){
        return memoria1 + dato;
    }
    // Método estático, depende exclusivamente de los valores de los parámetros y 
    // no interactúa con algún atributo o variable de instancia.
    // No se necesita instanciar un objeto para utilizar el método
    public static int sumar (int dato1, int dato2){
        return dato1 + dato2;
    }
}