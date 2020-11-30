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
public class Professores extends Pessoas {
    private float salario;
    private int quantidade;
        
    public Professores(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }
        
    public Professores(String nome, float salario, int quantidade, String status){
        this(nome, salario);
        this.quantidade = quantidade;
        this.status = status;
    }
    
}
