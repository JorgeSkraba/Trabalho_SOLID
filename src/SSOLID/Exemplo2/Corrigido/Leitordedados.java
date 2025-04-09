package SSOLID.Exemplo2.Corrigido;

import java.util.Scanner;

public class Leitordedados {
    private String idEncomenda;
    private double peso;

    Scanner sc = new Scanner(System.in);

    public String idencomenda() {
        System.out.println("Digite o ID da encomenda: ");
        idEncomenda = sc.nextLine();

        return idEncomenda;
    }

    public double peso(){
        System.out.println("Digite o peso (em kg): ");
        peso = sc.nextDouble();
        return peso;
    }

    public String getIdEncomenda() {
        return idEncomenda;
    }

    public double getPeso() {
        return peso;
    }
}
