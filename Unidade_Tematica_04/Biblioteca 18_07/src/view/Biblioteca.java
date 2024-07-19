/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import control.ControleBiblioteca;
import java.util.ResourceBundle;
import model.Autor;
import model.Livro;


public class Biblioteca {

    
    public static void main(String[] args) {
        ControleBiblioteca cb = new ControleBiblioteca();
        
        cb.cadastrarAutores("Machado De Assis", "Brasileiro");
        cb.cadastrarLivro("78321", "Quincas Borba", "Machado De Assis");
        cb.cadastrarLivro("98753", "nao sei", "Machado De Assis");
        cb.cadastrarLivro("42256", "SLA", "Machado De Assis");
        cb.cadastrarLivro("89787", "LAlalala", "Machado De Assis");
        cb.cadastrarLivro("12345", "O Ultimo Mestre de Java", 1899, "Editora Foda", "Machado De Assis");
        cb.cadastrarExemplar("78321");
        cb.cadastrarExemplar("78321");
        cb.cadastrarExemplar("12345");
        
        System.out.println(cb.exibirInfoExemplares());
        System.out.println(cb.emprestarExemplar("12345 - 0003"));
        System.out.println(cb.emprestarExemplar("12345 - 0003"));
        
        /*System.out.println(cb.exibirInfoLivros());
        System.out.println("Quantidade de livros: " + Livro.getContador());
        System.out.println("Quantidade de autores: " + Autor.getContador());
        System.out.println("ID dos Autores\n" + cb.getIdAutor());*/
    }
    
}
//Atividade para 05/07
//adicionar contador livros e autor com atributos estaticos. 
//implementar nas classes livro e autor.