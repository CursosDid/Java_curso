package herencia2.prueba;

public class Ejemplo
{
    protected static int atributo1;//Atributo protected
    private static int atributo2; //Atributo privado static
    public int atributo3;//Atributo público
    private int atributo4;//Atributo privado

    public static int getAtributo2()
    {
        return atributo2;
    }

    protected int getAtributo4()
    {
        return atributo4;
    }
    protected void setAtributo4(int valAtributo4)
    {
        atributo4 = valAtributo4;
    }
}