import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        double num1, num2;

       String opSoma = new String("soma");
       String opSubtracao = new String("subtração");
       String opMultiplicacao = new String("multiplicação");
       String opDivisao = new String("divisão");

       Scanner input = new Scanner(System.in);
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
                    add(num1, num2);
                }else{
                    if(op.equalsIgnoreCase(opSubtracao)){
                        sub(num1, num2);
                    }else{
                        if(op.equalsIgnoreCase(opMultiplicacao)){
                            multi(num1, num2);
                        }else{
                            if(op.equalsIgnoreCase(opDivisao)){
                                div(num1, num2);
                            }
                        }
                    }
                }
            }else {
                System.out.println("Erro! Por favor, digite uma das operações disponíveis.");
            }
        input.close();
    }

    public static void add(double n1, double n2){
        System.out.println("A soma entre os valores inseridos é " + (n1 + n2));
    }
    public static void multi(double n1, double n2){
        System.out.println("A multiplicação entre os valores inseridos é " + (n1 * n2));
    }
    public static void sub(double n1, double n2){
        System.out.println("A subtração entre os valores inseridos é " + (n1 - n2));
    }
    public static void div(double n1, double n2){
        if(n2 == 0){
            System.out.println("Erro! Divisor igual a 0.");
        }else {
            System.out.println("A divisão entre os valores inseridos é " + (n1 / n2));
        }
    }
}
