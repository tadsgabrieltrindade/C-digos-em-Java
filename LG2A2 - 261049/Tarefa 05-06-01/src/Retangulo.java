public class Retangulo {
    public double base;
    public  double altura;


    public double areaRetangulo() {
        return base * altura;
    }

    public double perimetroRetangulo() {
        return 2 * (base + altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double b) {
        this.base = b;
    }

    public void setAltura(double h) {
        this.altura = h;
    }

    public double getAltura() {
        return altura;
    }
}
