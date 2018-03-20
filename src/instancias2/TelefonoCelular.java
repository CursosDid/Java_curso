// Clases (abstractas o no) se heredan, las interfaces se implementan
public class TelefonoCelular extends Telefono implements Comunicador, Internet {
    private String [] marcadoRapido;
    private String [] memoriaCelular;
    public TelefonoCelular (int listaNumeros){
        marcadoRapido = new String [listaNumeros];
        memoriaCelular = new String [100];
    }
    public void marcaTelefono (int numLista ){
        super.servicioMarcar(marcadoRapido[numLista]);
    }
    public void enviarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    public void ConexionInternet (){
        System.out.println("Mecanismos de conexion a internet...");
    }
    private String recibeMensjae(){
        // Mecanismos de recepción de mensajes
        return memoriaCelular[0] = "Un mensjae";
    }
    public void leerMensaje () {
        System.out.print("Mensaje recibido "+recibeMensjae());
    }
    public void pruebaSintaxis() {}
}