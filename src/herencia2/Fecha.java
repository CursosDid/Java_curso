

public class Fecha{
        private int dia;
        private int mes;
        private int anio;

        //void si no tiene un valor de retorno, todo metodo de preferencia publico
        //atributos privados (para hacer evidente la parte de encapsulamiento)

        public Fecha(int dia, int mes, int anio){
            this.dia=dia;
            this.mes=mes;
            this.anio=anio;
        }

        public Fecha(){
            dia=9;
            mes= 10;
            anio=1999;
        }

        public void setDia(int dia){
            this.dia=dia;

        }

        public void setMes(int mes){
            this.mes=mes;
        }

        public void setAnio(int anio){
            this.anio=anio;
        }

        public int getDia(){
            return dia;
        }

        public int getMes(){
            return mes;
        }

        public int getAnio(){
            return anio;
        }

        public String toString(){
            return getDia()+"/"+getMes()+"/"+getAnio()+"";
        }
}