package br.infnet.edu.tp03;

public class Alunos extends Pessoas {
    private float notaAv1;
    private float notaAv2;
    private int quantidade;
        
    public Alunos(String nome, float notaAv1, float notaAv2){
        this.nome = nome;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }
        
    public Alunos(String nome, float notaAv1, float notaAv2, int quantidade, String status){
        this(nome, notaAv1, notaAv2);
        this.quantidade = quantidade;
        this.status = status;
    }
    
    @Override
    public void exibirAlunos(){
        System.out.println("Nome do aluno: "+this.nome);
        System.out.println("Nota da AV1: "+this.notaAv1);
        System.out.println("Nota da AV2: "+this.notaAv2);
       
    }    
        
}
