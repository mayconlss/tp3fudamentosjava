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
public class ExcecaoPersonalizada extends Exception {
    private String informacao;
    
    public ExcecaoPersonalizada(String informacao) {
        super(informacao);
        this.informacao = informacao;
    }
    
    @Override
    public String getMessage(){
        return informacao;
    }
    
}
