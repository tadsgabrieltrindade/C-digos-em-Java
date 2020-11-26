import java.util.Scanner;

public class Tarefa02-01 {
    public static void main(String[] args) {

        double num1, num2;

        String opSoma = new String("soma");
        String opSubtracao = new String("subtração");
        String opMultiplicacao = new String("multiplicação");
        String opDivisao = new String("divisão");

        Scanner input = new Scanner(System.in);
        double result;
        System.out.println("Qual operação você deseja realizar? ");
        System.out.println("Operações disponíveis: soma, subtração, multiplicação ou divisão");
        System.out.print("Digite a operação: ");
        String op = input.nextLine();
        if (op.equalsIgnoreCase(opSoma) || op.equalsIgnoreCase(opSubtracao) || op.equalsIgnoreCase(opMultiplicacao) || op.equalsIgnoreCase(opDivisao) ) {
            System.out.println("Entre com o primeiro número: ");
            num1 = input.nextDouble();
            System.out.println("Entre com o segundo número: ");
            num2 = input.nextDouble();
            if (op.equalsIgnoreCase(opSoma)) {
                result = add(num1, num2);
                System.out.println("A soma entre os valores inseridos é " + result);
            }
            if (op.equalsIgnoreCase(opSubtracao)) {
                result = sub(num1, num2);
                System.out.println("A subtração entre os valores inseridos é " + result);
            }
            if (op.equalsIgnoreCase(opMultiplicacao)) {
                result = multi(num1, num2);
                System.out.println("A multiplicação entre os valores inseridos é " + result);
            }
            if (op.equalsIgnoreCase(opDivisao)) {
                if(num2 == 0)
                    System.out.println("Erro! Divisor igual a 0.");
                else {
                    result = sub(num1, num2);
                    System.out.println("A divisão entre os valores inseridos é " + result);
                }
            }

        }else {
            System.out.println("Erro! Por favor, digite uma das operações disponíveis.");
        }
        input.close();
    }

    public static double add(double n1, double n2){
        return (n1+n2);
    }
    public static double multi(double n1, double n2){
        return (n1*n2);
    }
    public static double sub(double n1, double n2){
        return (n1-n2);
    }
    public static double div(double n1, double n2){
        return (n1/n2);
    }
}
