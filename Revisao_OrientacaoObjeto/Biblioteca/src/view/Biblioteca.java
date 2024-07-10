/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import control.ControleBiblioteca;
import model.Autor;
import model.Livro;


public class Biblioteca {

    
    public static void main(String[] args) {
        
        ControleBiblioteca cb = new ControleBiblioteca();
        cb.cadastrarAutor("Machado", "Brasileiro");
        cb.cadastrarLivro("123456", "Nao sei 2", "Machado");
        cb.cadastrarLivro("123454", "Nao sei 3", "Machado");
        cb.cadastrarLivro("123457", "Nao sei 4", "Machado");
        
        
        System.out.println(cb.exibirInfoLivros());
        System.out.println("Quantidade de livros: " + Livro.getContador());
        System.out.println("Quantidade de autores: " + Autor.getContador());
        System.out.println("Id dos Livros \n" + cb.getIdAutor());
        
        
    }
    
}
