/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poolibroconatributos1;

/**
 *
 * @author joseb
 */
public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    /*Constructores*/
    
    public Libro (int pISBN, String pTitulo, String pAutor, int pnumPaginas){
        
        this.ISBN=pISBN;
        titulo=pTitulo;
        autor=pAutor;
        numPaginas=pnumPaginas;
    }
    
    /*Metodos*/

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    /*Metodo toString*/
    
    @Override
    public String toString(){
        return "El libro "+titulo+" con ISBN "+ISBN+""
                + " escrito por el autor "+autor+""
                + " tiene "+numPaginas+" páginas";
    }
    
}
