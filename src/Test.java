//Encapsulamiento
/*import encapsulamiento.servicios.AdminFecha;
public class Test{
    public static void main(String [] argv){
        AdminFecha f1 = new AdminFecha();
        f1.altaFecha(17,03,2018);
        System.out.println(f1);
    }
}*/
//Instancia
/*import instancia.Calculadora;
public class Test{
    public static void main(String [] argv ){
        //int operacion = Calculadora.sumar(2, 5); // Invocación del método sumar a través del nombramiento de la clase Numero
        //System.out.println("Resultado: "+operacion);
        Calculadora calculadora = new Calculadora(1);
        System.out.println("Resultado sumar(a,b): "+calculadora.sumar(2, 3));
        System.out.println("Resultado sumar(a): "+ calculadora.sumar(calculadora.getValor( ), 3));
        System.out.println("Resultado sumar(a,b): "+calculadora.sumar(8));
    }
}*/
//Instancia 
/*import instancia.Punto;
public class Test{
    public static void main(String [] argv ){
        // Instancia de dos objetos de una misma clase y diferentes valores
        Punto p1 = new Punto(2,3); 
        Punto p2 = new Punto(4,5); 
        System.out.println("Punto 1: "+p1);
        System.out.println("Punto 2: "+p2);
    }
}*/
//Instancia o estático
/*public class Test{
    private int a = 0;
    //private static int a = 0;
    //public void unMetodo( ){
    //    System.out.println("Esto en unMetodo");
    //}
    public static void unMetodo( ){
        System.out.println("Esto en unMetodo");
    }
    public static void main(String [] argv ){
        System.out.println("A = " +a); // No puedo utilizar una variable de instancia
        unMetodo(); // Se necesita instancia un objeto
    }
}*/
//Herencia con variable de clase
/*import herencia.otros_objetos.FechaDetallada;
public class Test{
    public static void main(String [] argv ){
        FechaDetallada f = new FechaDetallada();
        f.setDia(16);
        f.setMes(03);
        f.setAnio(2018);
        System.out.println("Fecha detalla: "+f);
        System.out.println("Catalogo del mes: "+FechaDetallada.catalogoMeses(3));
    }
}*/
//Polimorfismo
/*import polimorfismo.otros_objetos.FechaDetallada;
import polimorfismo.objetos.Fecha;
public class Test{
    public static void main(String [] argv ){
        Fecha fecha = new FechaDetallada("16/03/2018");
        Object objeto = new FechaDetallada("16/03/2018");
        FechaDetallada fecha2 = new Fecha("16/03/2018");//No puede se puede referir porque Fecha no extiende de FechaDetallada
        System.out.println("Fecha: "+fecha);
        System.out.println("Objeto: "+objeto);
        System.out.println("FechaDetallada: "+fecha2);
    }
}*/
//Herencia
//import herencia.servicios.AdminEmpleado;
//import herencia.otros_objetos.Empleado;
/*public class Test{
    public static void main(String [] argv ){
        //AdminEmpleado.altaEmpleado();
        Empleado empleado = new Empleado("Emmanuel", "23", "RORE", 
                                            "31030", "Becario", "DID");
        System.out.println(empleado);
    }
}*/
//Excepciones
/*import excepciones.Conexion;
public class Test {
    public static void main(String[] args) {
        try {
            Conexion app = new Conexion();
            // intento el login
            Usuario u = app.login("juan","juan123sito");
            // muestro el resultado
            System.out.println(u);
        }
        catch(Exception ex) {
            // ocurrio un error
            System.out.print("Servicio temporalmente interrumpido: ");
            System.out.println(ex.getMessage());
        }
    }
}*/