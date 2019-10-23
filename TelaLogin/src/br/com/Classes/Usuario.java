/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Classes;

/**
 *
 * @author senaii04
 */
public class Usuario {
    
    //declarando as variaveis
    private String usuario;
    private String senha;

    @Override
    public String toString() {
        return usuario +""+  senha ;
    }
    
    
    
    //construtor
    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario() {
    }

    

   
    
   
   
    
    
    //getters e setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
       usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String usuario) {
        senha = usuario;
    }
    
    
}

