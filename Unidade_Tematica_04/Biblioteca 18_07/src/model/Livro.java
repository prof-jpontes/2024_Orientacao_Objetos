package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Livro {
    private String isbn;
    private String titulo;
    private int anoPub;
    private String editora;
    private Autor autor;
    private static int contador = 0;

    public static int getContador() {
        return contador;
    }

    public Livro(String isbn, String titulo, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        contador++;
      
    }

    public Livro(String isbn, String titulo, String editora, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
        contador++;
    }

    public Livro(String isbn, String titulo, int anoPub, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anoPub = anoPub;
        this.autor = autor;
        contador++;
    }

    public Livro(String isbn, String titulo, int anoPub, String editora, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anoPub = anoPub;
        this.editora = editora;
        this.autor = autor;
        contador++;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }
    
    public String exibirInfo(){
      String info = this.isbn+"\n"+this.titulo+"\n" + this.autor.exibirInfo();
      
      if(this.anoPub != 0) info += this.anoPub + "\n";
      
      if(this.editora != null) info += this.editora + "\n"; 
      
      return info;
    }


   
}
