public class Circulo {

    public double raio;
    private final double PI = 3.14;

    public double calcularArea(){
        return PI * (raio * raio);
    }

    public double calcularPerimetro(){
        return 2 * PI * raio;
    }
}
