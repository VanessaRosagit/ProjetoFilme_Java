
 
package com.vanessarosa.projetofilmes;

/**
 *
 * @author Vanessa
 */
//A Subclasse Herança Direta. Adiciona campos específicos como diretor e genero.
public class Filme extends Midia {
    private String diretor;
    private String genero;

    public Filme(String id, String titulo, int ano, double notaImdb, String diretor, String genero) {
        super(id, titulo, ano, notaImdb);
        this.diretor = diretor;
        this.genero = genero;
    }

    // Sobrecarga de Método
    public String exibeDetalhes(boolean incluirGenero) {
        if (incluirGenero) {
            return exibeDetalhes() + " | Gênero: " + genero;
        }
        return exibeDetalhes();
    }

    // Reescrita de Método
    @Override
    public String exibeDetalhes() {
        return super.exibeDetalhes() + " | Diretor: " + diretor;
    }

    public String getDiretor() { return diretor; }
    public void setDiretor(String diretor) { this.diretor = diretor; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}

