package LSOLID.Exemplo2.Corrigido;

public class mainConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(12);
        System.out.println(c.getSaldo());

        ContaPoupançaCorrigido cp = new ContaPoupançaCorrigido();
        cp.depositar(12);
        System.out.println(cp.getSaldo());

        ContaBancariaCorrigido cb = new ContaBancariaCorrigido();
        cb.depositar(12);
        System.out.println(cb.getSaldo());
        cb.sacar(6);
        System.out.println(cb.getSaldo());
    }
}
