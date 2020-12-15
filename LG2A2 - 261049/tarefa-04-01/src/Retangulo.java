public class Retangulo {
    public  double base;
    public  double altura;

    public  double areaRetangulo(){
        return base * altura;
    }

    public  double perimetroRetangulo(){
        return 2 * (base + altura);
    }

    public boolean podeConter(double b, double h){
        if(b <= base && h <= altura)
            return true;
        else
            return false;
    }

}
