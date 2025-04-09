package OSOLID.Exemplo2.Exemplo2.Corrigido;

public class Pix extends Formadepagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }
}
