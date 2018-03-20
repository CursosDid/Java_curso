import java.util.Scanner;

public class Test {
    public static void main (String [] argv){
        //ExcepcionAitmetica.aritmetica();
        //ExcepcionPuntero.acceso();
        try {
            muestraArray(leerValor());
        }catch (ValorNoValido e) {
                System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice incorrecto...");
        }
    }
    public static int leerValor() throws ValorNoValido {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero > 0 ");
        int n = sc.nextInt();
        sc.close();
        if (n <= 0) {
            // Se lanza la excepcion e invoca al constructor
            // Resuelto por el catch del método que llamó al método/instancia
            throw new ValorNoValido("El numero debe ser positivo.");
        }
        //sc.close();
        return n;
    }
    public static void muestraArray(int indAuxiliar){
        int [] array = {2, 3, 4};
        try{
            System.out.println("Valor en esa posicion: "+array[indAuxiliar]);
        }
        catch(ArrayIndexOutOfBoundsException ex){ throw ex; }
    }
}