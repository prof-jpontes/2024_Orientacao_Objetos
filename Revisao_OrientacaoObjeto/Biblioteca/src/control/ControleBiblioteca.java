/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.HashMap;
import model.Autor;
import model.Exemplar;
import model.Livro;

/**
 *
 * @author Aluno
 */
public class ControleBiblioteca {
    HashMap<String, Autor>autores = new HashMap<String, Autor>();
    HashMap<String, Livro>livros = new HashMap<String, Livro>();
    HashMap<String, Exemplar> exemplares = new HashMap<String, Exemplar>();
    
    
    public void cadastrarLivro(String isbn, String titulo, String chaveAutor){
        Livro livro = new Livro(isbn, titulo, autores.get(chaveAutor));
        livros.put(isbn, livro);
        
    }
    
    public void cadastrarAutor(String nome, String nacionalidade){
        Autor autor = new Autor(nome, nacionalidade);
        autores.put(nome, autor);
    }
    
    public String exibirInfoLivros(){
        String info = "";
        for(Livro l: livros.values()){
            info+= l.exibirInfo() + "\n";
        }
        return info;
    }
    
    public String getIdAutor(){
        String info = "";
        for(Autor a: autores.values()){
            info += a.getId() + "\n";
        }
        return info;
    }
    
    public void cadastrarExemplar(String codigo, String isbn){
        Exemplar exemplar = new Exemplar(livros.get(isbn), codigo);
        exemplares.put(isbn, exemplar);
        
    }
    
}  
