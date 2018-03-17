public abstract class CalculoAbstracto{

    private float elemento1;
    private float elemento2;


    public CalculoAbstracto(float num1){
        this.elemento1 = num1;
    }

    public CalculoAbstracto(float num1, float num2){
        this.elemento1 = num1;
        this.elemento2 = num2;
    }

    public abstract float perimetro();
    public abstract float area();
    public abstract float volumen();
    public abstract void imprimeResultado();

    public void setValor1(float elemento1){
        this.elemento1 = elemento1;
    }
    public void setValor2(float elemento2){
        this.elemento2 = elemento2;
    }

    public float getValor1(){
        return this.elemento1;
    }

    public float getValor2(){
        return this.elemento2;
    }


}