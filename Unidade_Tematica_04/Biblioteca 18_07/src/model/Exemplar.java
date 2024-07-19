/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Exemplar {
    private Livro livro;
    private String codigo;
    private boolean disponivel;
    public static int contador = 0;

    public Exemplar(Livro livro) {
        contador++;
        this.livro = livro;
        this.codigo = livro.getIsbn() + " - " + String.format("%04d", contador);
        this.disponivel = true;
    }
    
    public boolean emprestar() {
        if (disponivel) {
            disponivel = false;
            return true;
        }
        return false;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public String exibirInfo(){
    return this.codigo + "\n" + this.livro.exibirInfo();
    }
    
}
