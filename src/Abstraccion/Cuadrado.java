//import testcalculadora.CalculoAbstracto;

public class Cuadrado extends CalculoAbstracto{

    public Cuadrado(float lado1){
        super(lado1);
    }

    public float perimetro(){
        return super.getValor1()*4;
    }

    public float area(){
        return super.getValor1()*super.getValor1();
    }

    public float volumen(){
        return 0;
    }

    public void imprimeResultado(){
        System.out.println("El perimetro del Cuadrado es: "+ perimetro());
        System.out.println("El area del Cuadrado es: "+ area());
        System.out.println("El volumen el Cuadrado es:" +volumen());
    }
}