
 
package com.vanessarosa.projetofilmes;

/**
 *
 * @author Vanessa
 */

//A Classe Mãe / Base Guarda as informações universais que todo item de filmes possui (id, titulo, ano, notaImdb)

public class Midia {
    // Atributos privados (encapsulamento e visibilidade)
    
    private String id;
    private String titulo;
    private int ano; 
    private double notaImdb;
    
// Construtor principal
    
    public Midia(String id, String titulo, int ano, double notaImdb){
    
    this.id = id;
    this.titulo = titulo;
    this.ano = ano;
    this.notaImdb = notaImdb;
    }
    // Construtor sobrecarga 
    public Midia (String titulo, int ano){
    this.id = "N/A";
    this.titulo = titulo;
    this.ano = ano;
    this.notaImdb = 0.0;
     }
    
    //Getters e Setters
    public String getId(){return id;}
    public void setId(String id){this.id = id;}
    
    public String getTitulo(){return titulo;}
    public void setTitulo(String titulo){ this.titulo = titulo;}
    
    public int getAno() {return ano;}
    public void setAno (int ano){this.ano = ano;}
    
    public double getNotaImdb(){return ano;}
    public void setNotaImdb(double notaImdb){this.notaImdb = notaImdb;}
    
    
    //método que será reescrito nas subclasses
    public  String exibeDetalhes(){
        return "ID:"+ id + "| Título: " + titulo +" (" + ano +")- Nota IMDb:" + notaImdb;
    }
   }
