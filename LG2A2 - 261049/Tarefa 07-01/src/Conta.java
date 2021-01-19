public class Conta {
    private int numero;
    private double saldo;
    private double limite;

    public Conta(int numero){
        this.setNumero(numero);
        this.saldo = 0.0;
        this.limite = 0.0;
    }

    public Conta(int numero, double saldo){
        this.setNumero(numero);
        this.saldo = saldo;
        this.limite = 0.0;
    }

    public Conta(int numero, double saldo, double limite){
        this.setNumero(numero);
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(double valor) {
        validarValor(valor);
        if (valor <= saldo) {
            if (valor <= saldo + limite)
                saldo = saldo - valor;
            else
                throw new IllegalArgumentException("Liimite esgotado!");
        } else {      //para poder entrar aqui, o valor ultrapassa o saldo disponível positivo
            if (saldo > 0) {
                if (valor <= saldo + limite) {
                    double aux = valor - saldo;
                    limite = limite - aux;
                    saldo = aux * (-1);
                } else
                    throw new IllegalArgumentException("Limite indisponível!");
            } else {
                if (valor <= limite) {
                    limite = limite - valor;
                    saldo = saldo + (valor * (-1));
                } else
                    throw new IllegalArgumentException("Limite esgostado!");
            }
        }

    }

    public void depositar(double valor) {
        validarValor(valor);
        saldo = saldo + valor;
    }

    public void transferir(double valor, Conta conta) {
        validarValor(valor);
        if (valor <= saldo) {
            if (valor <= saldo + limite) {
                saldo = saldo - valor;
                conta.saldo = conta.saldo + valor;
            }else
                throw new IllegalArgumentException("Limite esgotado!");
        } else {      //para poder entrar aqui, o valor ultrapassa o saldo disponível positivo
            if (saldo > 0) {
                if (valor <= saldo + limite) {
                    double aux = valor - saldo;
                    limite = limite - aux;
                    saldo = aux * (-1);
                    conta.saldo = conta.saldo + valor;
                } else
                    throw new IllegalArgumentException("Limite indisponível!");
            } else {
                if (valor <= limite) {
                    limite = limite - valor;
                    saldo = saldo + (valor * (-1));
                    conta.saldo = conta.saldo + valor;
                } else
                    throw new IllegalArgumentException("Limite esgostado!");
            }
        }
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int n) {
        this.numero = n;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double l) {
        this.limite = l;
    }

    private void validarValor(double valor) {
        if (valor <= 0.0)
            throw new IllegalArgumentException("O valor deve ser maior que 0!");
    }

    private void verificarLimite(double valor) {
        if (valor <= saldo) {
            if (valor <= saldo + limite)
                saldo = saldo - valor;
            else
                throw new IllegalArgumentException("Limite esgotado!");
        } else {      //para poder entrar aqui, o valor ultrapassa o saldo disponível positivo
            if (saldo > 0) {
                if (valor <= saldo + limite) {
                    double aux = valor - saldo;
                    limite = limite - aux;
                    saldo = aux * (-1);
                } else
                    throw new IllegalArgumentException("Limite indisponível!");
            } else {
                if (valor <= limite) {
                    limite = limite - valor;
                    saldo = saldo + (valor * (-1));
                } else
                    throw new IllegalArgumentException("Limite esgostado!");
            }
        }
    }
}

