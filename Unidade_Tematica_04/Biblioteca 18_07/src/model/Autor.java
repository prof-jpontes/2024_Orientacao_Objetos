package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Autor {
    private String nome;
    private String nacionalidade;
    private static int contador = 0;
    private String id;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        contador++;
        this.id = String.format("%06d", contador);
    }

    public static int getContador() {
        return contador;
    }
    
    
    public String exibirInfo(){
        return this.nome+"\n"+this.nacionalidade+"\n";
    }

    public String getId() {
        return id;
    }
    
}
