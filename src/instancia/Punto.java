package instancia;

public class Punto{
    private int x;
    private int y;
    public Punto (int cordX, int cordY)
    {
        x = cordX;
        y = cordY;
    }
    public String toString(){
        return " ( "+x+","+y+" )";
    }
}