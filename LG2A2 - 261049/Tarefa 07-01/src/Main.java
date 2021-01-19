public class Main {


    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        Retangulo retangulo1 = new Retangulo(12);
        Quadrado quadrado1 = new Quadrado(6);
        System.out.println("\n\n------Figuras geométricas-----");

        System.out.println(">>>Dados do Circulo: ");
        System.out.println("Raio: " + circulo1.getRaio());
        System.out.println("Área: " + circulo1.calcularArea());
        System.out.println("Perimetro: " + circulo1.calcularPerimetro());

        System.out.println("\n>>>Dados do Retângulo: ");
        System.out.println("Altura: " + retangulo1.getAltura());
        System.out.println("Base: " + retangulo1.getBase());
        System.out.println("Área: " + retangulo1.areaRetangulo());
        System.out.println("Perimetro: " + retangulo1.perimetroRetangulo());

        System.out.println("\n>>>Dados do Quadrado: ");
        System.out.println("Lado: " + quadrado1.getLado());
        System.out.println("Área: " + quadrado1.areaQuadrado() );
        System.out.println("Perimetro: " + quadrado1.perimetroQuadrado());

        // Conta

        Conta conta1 = new Conta(1, 500.0, 1000);
        Conta conta2 = new Conta(2, 700.0, 140000.0);


        System.out.println("\n\n-----Operação de saque-----" ); //Testes para transferir //Testes para sacar
        conta1.sacar(600);
        System.out.println("Saldo: " + conta1.getSaldo());
        conta1.sacar(800);
        System.out.println("Saldo: " + conta1.getSaldo());
        conta1.sacar(100);
        System.out.println("Saldo: " + conta1.getSaldo());


        conta1.setSaldo(300000);
        conta1.setLimite(1200);

        System.out.println("\n\n-----Operação de transferência-----" ); //Testes para transferir
        conta1.transferir(500, conta2);
        System.out.println("Primeira operação:\nSaldo Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2: " + conta2.getSaldo());
        conta1.transferir(900, conta2);
        System.out.println("\nSegunda operação:\nSaldo Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2: " + conta2.getSaldo());
        conta1.transferir(200, conta2);
        System.out.println("\nTerceira operação:\nSaldo Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2: " + conta2.getSaldo());


        System.out.println("\n\n------Contrutores------");   //teste dos contrutores

        Conta conta3 = new Conta(59);
        System.out.println("\n>>>Conta 3\nNúmero: "+ conta3.getNumero());
        System.out.println("Saldo: " + conta3.getSaldo());
        System.out.println("Limite: " + conta3.getLimite());

        Conta conta4 = new Conta(78, 60);
        System.out.println("\n>>>Conta 4\nNúmero: "+ conta4.getNumero());
        System.out.println("Saldo: " + conta4.getSaldo());
        System.out.println("Limite: " + conta4.getLimite());

        Conta conta5 = new Conta(106, 17500.50, 10200);
        System.out.println("\n>>>Conta 5\nNúmero: "+ conta5.getNumero());
        System.out.println("Saldo: " + conta5.getSaldo());
        System.out.println("Limite: " + conta5.getLimite());
    }

}