package herencia.servicios;
import herencia.otros_objetos.*;
import java.util.Scanner;
public final class AdminEmpleado {
    private static Empleado [] listaEmpleados = new Empleado[3];
    private static int contEmpleado = 0;
    public static void altaEmpleado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombreEmpleado = scanner.nextLine();
        System.out.println("Edad: ");
        String edadEmpleado = scanner.nextLine();
        System.out.println("Curp: ");
        String curpEmpleado = scanner.nextLine();
        System.out.println("Numero cuenta: ");
        String numCuentaEmpleado = scanner.nextLine();
        System.out.println("Categoria: ");
        int categoriaEmpleado = scanner.nextInt();
        System.out.println("Departamento: ");
        int departamentoEmpleado = scanner.nextInt();
        Empleado nuevoEmpleado = generaEmpleado(nombreEmpleado, edadEmpleado, curpEmpleado, 
                                                numCuentaEmpleado, categoriaEmpleado, departamentoEmpleado);
        System.out.println("Genero empleado ");
        System.out.println(nuevoEmpleado);
        listaEmpleados[contEmpleado] = nuevoEmpleado;
        contEmpleado++;
        scanner.close();
    }
    private static Empleado generaEmpleado(String nombreEmpleado, String edadEmpleado, String curpEmpleado,
                                        String numCuentaEmpleado, int categoriaEmpleado, int departamentoEmpleado  )
    {
        return new Empleado(nombreEmpleado, edadEmpleado, curpEmpleado, 
                                            numCuentaEmpleado, Categoria.obtenCategoria(categoriaEmpleado), 
                                            Departamento.obtenDepartamento(departamentoEmpleado));
        
    }
}