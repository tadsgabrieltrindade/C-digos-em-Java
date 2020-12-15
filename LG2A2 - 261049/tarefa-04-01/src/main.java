import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Circulo firstCicle = new Circulo();
        Circulo secondCicle = new Circulo();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o raio do 1º círculo: ");
        firstCicle.raio = input.nextDouble();
        System.out.print("Digite o raio do 2º círculo: ");
        secondCicle.raio = input.nextDouble();
        input.close();

        System.out.println("\nÁrea do 1º círculo: "+firstCicle.calcularArea());
        System.out.println("Perímetro do 1º círculo: "+firstCicle.calcularPerimetro());
        System.out.println("\nÁrea do 2º círculo: "+secondCicle.calcularArea());
        System.out.println("Perímetro do 2º círculo: "+secondCicle.calcularPerimetro());

        Quadrado q1 = new Quadrado();
        q1.lado = 50;
        Quadrado q2 = new Quadrado();
        q2.lado = 10;
        Retangulo r1 = new Retangulo();
        r1.base = 15;
        r1.altura = 10;
        Retangulo r2 = new Retangulo();
        r2.base = 3;
        r2.altura = 5;

        System.out.println("\nO quadrado 1 pode conter o quadrado 2? " + q1.podeConter(q2.lado));
        System.out.println("O quadrado 2 pode conter o quadrado 1? " + q2.podeConter(q1.lado));

        System.out.println("\nO retângulo 1 pode conter o retângulo 2? " + r1.podeConter(r2.base, r2.altura));
        System.out.println("O retângulo 2 pode conter o retângulo 1? " + r2.podeConter(r1.base, r1.altura));

    }

}
