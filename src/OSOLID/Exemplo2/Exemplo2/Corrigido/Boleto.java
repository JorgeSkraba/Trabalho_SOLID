package OSOLID.Exemplo2.Exemplo2.Corrigido;

public class Boleto extends Formadepagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via BOLETO.");
    }
}