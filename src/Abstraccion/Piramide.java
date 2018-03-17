public class Piramide extends Triangulo{

    private float altura;
    private float lado3;

    public Piramide(float lado1, float lado2, float lado3, float altura){
        super(lado1, lado2);
        this.altura = altura;
    }

    public float area(){
        return (super.perimetro() * this.altura / 2) + super.area();
    }

    public void imprimeResultado(){
        System.out.println("El area de la Piramide es: " + area());
    }

}