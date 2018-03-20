
public class ExcepcionAitmetica {
    public static int numerador = 10;
    public static Integer denominador = 0;
    public static float division;
    public static void aritmetica ( ){
        System.out.println("Antes de la division");
        try{
            division = numerador / denominador;
        }
        catch(ArithmeticException ex)
        {   division = 0;
            System.out.println("Eror: "+ex.getMessage());
        }
        finally
        {   System.out.println("Divsion: "+division);
            System.out.println("Despues de la division");
        }
    }
}