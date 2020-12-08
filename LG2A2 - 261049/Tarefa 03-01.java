import java.util.Scanner;

public class main{
    public static int x;

    public static void main(String[] args) {
        double[] numbers = new double[args.length];
        x = (int) args.length;
        for (int i = 0; i < x; i++) {
            numbers[i] = Double.parseDouble(args[i]);
        }
        printConjunto(numbers);
        System.out.println("\nMedia " + media(numbers));
        System.out.println("Maior " + maiorElemento(numbers));
        System.out.println("Menor " + menorElemento(numbers));
    }

    static void printConjunto(double[] numbers) {
        for (int i = 0; i < x; i++) {
            if (i == 0) {
                System.out.print("Conjunto: ");
                System.out.print(numbers[i] + ", ");
            } else if (i < (x - 1))
                System.out.print(numbers[i] + ", ");
            else
                System.out.print("" + numbers[i]);
        }
    }

    static double media(double[] numbers) {
        double media = 0;
        for (int i = 0; i < x; i++)
            media = media + numbers[i];
        return media / x;
    }

    static double maiorElemento(double[] numbers){
        double maior = numbers[0];
            for(int j=1; j<x; j++){
                if(!(maior > numbers[j]))
                    maior = numbers[j];
        }
        return maior;
    }

    static double menorElemento(double[] numbers){
        double menor = numbers[0];
        for(int j=1; j<x; j++){
            if(!(menor < numbers[j]))
                menor = numbers[j];
        }
        return menor;
    }
}
