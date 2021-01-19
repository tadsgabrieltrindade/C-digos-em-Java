public class Circulo {
    public double raio;
     double pi = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return pi * (raio * raio);
    }

    public double calcularPerimetro(){
        return 2 * pi * raio;
    }

    public double getRaio(){
        return this.raio;
    }

    public void setRaio(double r){
        this.raio = r;

    }
}
