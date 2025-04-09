package OSOLID.Exemplo2.Exemplo2.Corrigido;

public class SistemaPagamento {
    public void realizarPagamento(double valor, Formadepagamento metado) {
        metado.pagar(valor);
    }
}
