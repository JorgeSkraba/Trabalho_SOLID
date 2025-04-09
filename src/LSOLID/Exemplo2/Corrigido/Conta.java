package LSOLID.Exemplo2.Corrigido;

public class Conta {
    public double saldo = 0;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
