
 
package com.vanessarosa.projetofilmes;

/**
 *
 * @author Vanessa
 */
//A Subclasse Especializada, adiciona o atributo oscars.
public class FilmePremiado extends Filme {
    private int oscars;

    public FilmePremiado(String id, String titulo, int ano, double notaImdb, String diretor, String genero, int oscars) {
        super(id, titulo, ano, notaImdb, diretor, genero);
        this.oscars = oscars;
    }

    // Reescrita de Método
    @Override
    public String exibeDetalhes() {
    return super.exibeDetalhes() + " | Prêmios Oscar: " + oscars;
    }

    public int getOscars() { return oscars; }
    public void setOscars(int oscars) { this.oscars = oscars; }
}
    

