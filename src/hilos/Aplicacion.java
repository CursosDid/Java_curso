import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicacion extends Frame{
    private static final long serialVersionUID = 1L;
	private Button boton;
    private Choice combo;
    public Aplicacion()
    {
        setLayout(new FlowLayout());
        add( boton = new Button("Esto se va a demorar"));
        boton.addActionListener(new EscuchaBoton());
        
        add( combo = new Choice() );
        combo.addItem("Tania");
        combo.addItem("Luis");
        combo.addItem("Ricardo");
        setSize(300,300);
        setVisible(true);
    }
    class EscuchaBoton implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            //boton.setEnabled(false);
            //TareaBoton t = new TareaBoton();
            //t.start();
            try
            {
                Thread.sleep(5000);
                System.out.println("Termino la espera...");
                boton.setEnabled(true);
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }        
    }
    /*class TareaBoton extends Thread
    {
        public void run()
        {
            try
            {
                Thread.sleep(10000);
                System.out.println("Termino la espera...");
                boton.setEnabled(true);
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }*/
    public static void main(String[] args)
    {
        new Aplicacion();
    }
}