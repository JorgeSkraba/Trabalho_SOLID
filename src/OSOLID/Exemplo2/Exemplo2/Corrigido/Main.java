package OSOLID.Exemplo2.Exemplo2.Corrigido;

public class Main {
    public static void main(String[] args) {
        Formadepagamento metodo1 = new Cartao();
        Formadepagamento metodo2 = new Pix();
        Formadepagamento metodo3 = new Boleto();
        SistemaPagamento sistemaPagamento = new SistemaPagamento();

        sistemaPagamento.realizarPagamento(200, metodo1);
        sistemaPagamento.realizarPagamento(300, metodo2);
        sistemaPagamento.realizarPagamento(400, metodo3);
    }
}
