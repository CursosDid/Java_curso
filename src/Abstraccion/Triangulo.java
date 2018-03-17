public class Triangulo extends CalculoAbstracto{

    public Triangulo(float num1, float num2){
        super(num1,num2);
    }

    public float perimetro(){
        return super.getValor1()*3;
    }
        
    public float area(){
        return super.getValor1()*super.getValor1()/2;
    }

    public float volumen(){
        return 0;
    }
    
    public void imprimeResultado(){
        System.out.println("El perimetro del triangulo es: "+ perimetro());
        System.out.println("El area del triangulo es: "+ area());
        System.out.println("El volumen el triangulo es:" +volumen());
    }


}