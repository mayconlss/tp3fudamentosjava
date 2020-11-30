/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.infnet.edu.tp03;

/**
 *
 * @author Maycon Souza
 */
public class Pessoas {
    String nome;
    String status;
    int quantidade;
    
    
    public String getNome () {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String verificarStatus() {
        return status;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    }

    void exibirAlunos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
