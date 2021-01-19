public class Main {


    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Retangulo retangulo1 = new Retangulo();
        Quadrado quadrado1 = new Quadrado();

        System.out.println("Dados do Circulo: ");
        circulo1.setRaio(5);
        System.out.println("Raio: " + circulo1.getRaio());
        System.out.println("Área: " + circulo1.calcularArea());
        System.out.println("Perimetro: " + circulo1.calcularPerimetro());

        System.out.println("\nDados do Retângulo: ");
        retangulo1.setAltura(4);
        retangulo1.setBase(3);
        System.out.println("Altura: " + retangulo1.getAltura());
        System.out.println("Base: " + retangulo1.getBase());
        System.out.println("Área: " + retangulo1.areaRetangulo());
        System.out.println("Perimetro: " + retangulo1.perimetroRetangulo());

        System.out.println("\nDados do Quadrado: ");
        quadrado1.setLado(6);
        System.out.println("Lado: " + quadrado1.getLado());
        System.out.println("Área: " + quadrado1.areaQuadrado() );
        System.out.println("Perimetro: " + quadrado1.perimetroQuadrado() + "\n\n");

        // Conta

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.setNumero(1);
        conta1.setSaldo(500);
        conta1.setLimite(1000);

        conta2.setNumero(2);
        conta2.setSaldo(700);
        conta2.setLimite(1400);


        System.out.println("-----Operação de saque-----" ); //Testes para transferir //Testes para sacar
        conta1.sacar(600);
        System.out.println("Saldo: " + conta1.getSaldo());
        conta1.sacar(800);
        System.out.println("Saldo: " + conta1.getSaldo());
        conta1.sacar(100);
        System.out.println("Saldo: " + conta1.getSaldo());


        conta1.setNumero(1);
        conta1.setSaldo(300);
        conta1.setLimite(1200);

        System.out.println("\n-----Operação de transferência-----" ); //Testes para transferir
        conta1.transferir(500, conta2);
        System.out.println("Primeira operação:\nSaldo Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2: " + conta2.getSaldo());
        conta1.transferir(900, conta2);
        System.out.println("\nSegunda operação:\nSaldo Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2: " + conta2.getSaldo());
        conta1.transferir(200, conta2);
        System.out.println("\nTerceira operação:\nSaldo Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2: " + conta2.getSaldo());

    }

}