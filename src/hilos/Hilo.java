public class Hilo extends Thread /*implements Runnable*/{
    private String nombre;
    public Hilo(String nombre)
    {
        this.nombre = nombre;
    }
    public void run()
    {
        //try
        //{
            int x = (int)(Math.random()*5000);
            //Thread.sleep(x);
            System.out.println("Soy: "+nombre+" {"+x+"}");
        /*}
        catch(Exception ex)
        {
            ex.printStackTrace();
        }*/
    }
    /*
        public void run()
        {
            for(int cont = 0; cont < 5; cont ++)
            {
                System.out.println(nombre+" - "+cont);
                yield(); // Cede el procesador al siguiente proceso en listo
            }
        }

    */
}