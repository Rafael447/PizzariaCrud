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
public class Produto {
    //declarando as variaveis
    private String Tipo;
    private String Tamanho;
    private String Sabor;
    private int ID;
    //construtor
    public Produto(String Tipo, String Tamanho, String Sabor) {
        this.Tipo = Tipo;
        this.Tamanho = Tamanho;
        this.Sabor = Sabor;
    }
    
    //métodos
    public Produto() {
    }

    @Override
    public String toString() {
        return  "Produto=" + Tipo + ", Tamanho=" + Tamanho + ", Sabor=" + Sabor + '}';
    }
    
    //getters e setters
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public void setTamanho(String Tamanho) {
        this.Tamanho = Tamanho;
    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
}
