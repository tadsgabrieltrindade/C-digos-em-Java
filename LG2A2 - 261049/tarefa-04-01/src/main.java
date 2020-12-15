public class main {
    public static void main(String[] args) {

        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        q1.lado = 10;
        q2.lado = 14;

        System.out.println("Área do quadrado 1: " + q1.areaQuadrado());
        System.out.println("Perímetro do quadrado 1: " + q1.perimetroQuadrado());
        System.out.println("\nÁrea do quadrado 2: " + q2.areaQuadrado());
        System.out.println("Perímetro do quadrado 2: " + q2.perimetroQuadrado());

        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();
        r1.base = 10;
        r1.altura = 4.9;
        r2.base = 25.6;
        r2.altura = 14.35;

        System.out.println("\n\nÁrea do retângulo 1: " + r1.areaRetangulo());
        System.out.println("Perímetro do retângulo 1: " + r1.perimetroRetangulo());
        System.out.println("\nÁrea do retângulo 2: " + r2.areaRetangulo());
        System.out.println("Perímetro do retângulo 2: " + r2.perimetroRetangulo());



    }

}
