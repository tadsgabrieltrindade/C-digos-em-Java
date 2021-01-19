public class Retangulo {
    public double base;
    public  double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double valor){
        this.setBase(valor);
        this.setAltura(valor);
    }

    public double areaRetangulo() {
        return base * altura;
    }

    public double perimetroRetangulo() {
        return 2 * (base + altura);
    }

    public double getBase() {
        return base;
    }

    private void setBase(double b) {
        this.base = b;
    }

    private void setAltura(double h) {
        this.altura = h;
    }

    public double getAltura() {
        return altura;
    }
}
