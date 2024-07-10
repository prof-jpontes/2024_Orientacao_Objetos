/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Exemplar {
    private Livro livro;
    private String codigo;

    public Exemplar(Livro livro, String codigo) {
        this.livro = livro;
        this.codigo = codigo;
    }
    
    public String exibirInfo(){
        return this.codigo + "\n" + this.livro.exibirInfo();
    }
    
}
