/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.fornecedor;

import model.Autenticavel;

public class Fornecedor implements Autenticavel {
    private String nome;
    private String id;
    private String senha;
    
    @Override
    public boolean autenticar(String senha) {
        
    }
    
}
