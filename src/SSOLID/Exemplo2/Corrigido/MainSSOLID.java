package SSOLID.Exemplo2.Corrigido;

public class MainSSOLID {
    public static void main(String[] args) {
        Leitordedados leitordedados = new Leitordedados();
        Calculafrete calculafrete = new Calculafrete();
        Gravadordearquivo gravadordearquivo = new Gravadordearquivo();

        leitordedados.idencomenda();
        leitordedados.peso();
        gravadordearquivo.salvarEmArquivo(leitordedados.getIdEncomenda(),calculafrete.calcular(leitordedados.getPeso()));
    }
}