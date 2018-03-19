package herencia2;

import herencia2.prueba.Ejemplo;

public class TestEjemplo extends Ejemplo
{
    public static void main(String[] args)
    {
        //La siguientes dos líneas generan error:
        // + atributo2 es privado, acceso a través de una instancia 
        // + atributo3 es público, sin embargo es malas prácticas
        //System.out.println(atributo2);
        //System.out.println(atributo3);

        // Acceso a través de la herencia
        System.out.println(atributo1);
    }
}