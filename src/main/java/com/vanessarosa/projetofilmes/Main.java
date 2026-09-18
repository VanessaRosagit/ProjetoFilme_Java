
package com.vanessarosa.projetofilmes;

/**
 *
 * @author Vanessa
 */

//A Classe Executável.É o ponto de entrada do programa, onde a aplicação começa a rodar, Cria instâncias (objetos) de cada classe preenchidas com dados reais
public class Main {
    public static void main(String[] args) {
     
        Filme f1 = new Filme("tt0073335", "Mahogany", 1975, 6.1, "Berry Gordy", "Drama, Romance");
        FilmePremiado f2 = new FilmePremiado("tt0073335", "Mahogany", 1975, 6.1, "Berry Gordy", "Drama, Romance", 1);

        System.out.println("=== Teste de Reescrita (Filme) ===");
        System.out.println(f1.exibeDetalhes());

        System.out.println("\n=== Teste de Reescrita (Filme Premiado) ===");
        System.out.println(f2.exibeDetalhes());

        System.out.println("\n=== Teste de Sobrecarga ===");
        System.out.println(f1.exibeDetalhes(true));
    }
}