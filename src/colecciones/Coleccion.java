public class Coleccion /*<T>*/ {
    private Object datos[] = null;
    private int len = 0;
    // en el constructor se especifi ca la capacidad inicial
    public Coleccion(int capacidadInicial)
    {
    datos = new Object[capacidadInicial];
    }   
    public Object obtener(int i)
    {
        return datos[i];
    }
    // indica cuantos elementos tiene la coleccion
    public int cantidad()
    {
        return len;
    }
    public void insertar(Object elm, int i)
    {
        if( len<datos.length )
        {
            Object aux[] = datos;
            datos[i] = elm;
            for(int j=i+1; j<len; j++)
            {
                datos[j]=aux[j];
            }
            aux=null;
        len++;
        }
    }
    public int buscar(Object elm)
    {
        int i=0;
        // mientras no me pase del tope y mientras no encuentre...
        for( ;i<len && !datos[i].equals(elm); i++ );
        // si no me pase entonces encontre, si no... no encontre
        return i<len ? i : -1;
    }
    public void insertar(Object elm)
    {
        insertar(elm,len);
    }
    public Object eliminar(int i)
    {
        Object aux = datos[i];
        for( int j=i; j<len-1; j++ )
        {
            datos[j]=datos[j+1];
        }
        len--;
        return aux;
    }    
}