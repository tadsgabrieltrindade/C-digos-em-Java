public class Quadrado {
    public double lado;

    public double areaQuadrado(){
        return lado * lado;
    }

    public double perimetroQuadrado(){
        return lado * 4;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double l) {
        if(l <= 0)
            throw new IllegalArgumentException("O lado é menor ou igual a zero.");
        else
            this.lado = l;
    }
}
