public class Test
{
    public static void main(String[] args)
    {
        // defi no un array de alumnos
        Alumno arr[] = { new Alumno("Juan",20,8.5)
                        , new Alumno("Pedro",18,5.3)
                        , new Alumno("Alberto",19,4.6) };
        Util.ordenar(arr); // lo ordeno
        muestraArray(arr);
        // defi no, ordeno y muestro un array de strings
        String[] arr2 = { "Pablo","Andres","Marcelo" };
        Util.ordenar(arr2);
        muestraArray(arr2);
        // defi no, ordeno y muestro un array de integers
        Integer[] arr3 = { new Integer(5)
        , new Integer(3)
        , new Integer(1) };
        Util.ordenar(arr3);
    }
    private static void muestraArray(Comparable arr[])
    {
        for( int i=0; i<arr.length; i++ )
        {
        System.out.println(arr[i]);
        }
    }
/*
    public static void main(String[] args)
    {
        Alumno arr[] = { new Alumno("Martin", 25, 7.2)
            ,new Alumno("Carlos", 23, 5.1)
            ,new Alumno("Anastasio", 20, 4.8) };
        Util.ordenar(arr,new CriterioAlumNombre());
        Util.imprimir(arr);
        Util.ordenar(arr,new CriterioAlumNotaProm());
        Util.imprimir(arr);
    }*/

}