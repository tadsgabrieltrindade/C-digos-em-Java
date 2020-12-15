public class Quadrado {
    public double lado;

    public  double areaQuadrado(){
        return lado * lado;
    }

    public  double perimetroQuadrado(){
        return 4 * lado;
    }

    public boolean podeConter(double q){
        if(q <= lado)
            return true;
        else
            return false;
    }


}
