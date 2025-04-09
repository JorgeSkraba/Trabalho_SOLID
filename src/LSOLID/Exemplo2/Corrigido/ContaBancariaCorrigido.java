package LSOLID.Exemplo2.Corrigido;

public class ContaBancariaCorrigido extends Conta{
   public void sacar(double valor){
       this.saldo -= valor;
   }
}
