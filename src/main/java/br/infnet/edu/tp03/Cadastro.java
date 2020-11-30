/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.infnet.edu.tp03;

import java.util.Scanner;

/**
 *
 * @author Maycon Souza
 */
public class Cadastro {
    
    public static void main(String[] args) {  
                
        int QTD = 100;
        int executor = 0;
        int quantidade = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        Pessoas turma[] = new Pessoas[QTD];
        
        do{
            
            executor = lerExecutor();
            
            switch(executor){
                case 1 -> {
                    cadastrarAluno(quantidade, turma);
                    quantidade++;
                    break;
                }
                case 2 -> {
                    cadastrarProfessor(quantidade, (Professores[]) turma);
                    quantidade++;
                    break;
                }
                case 3 -> {
                    try{
                        for (int i = 0; i < quantidade; i++) {
                        turma[i].exibirAlunos();
                        System.out.println("Consulta encerrada.");
                        if(quantidade != i){
                        } else {
                            throw new ExcecaoUm();
                            }
                    }                            
                    } catch(ExcecaoPersonalizada e){
                        System.err.println("Erro, verifique novamente."+e.getMessage());
                    }
                    
                    break;
                }
                case 4 -> {
                    System.out.println("Você saiu do sistema.");
                    break;
                }
                default -> {
                    System.out.println("Opção não reconhecida.");
                    break;
                }
            }
            
        } while(executor != 4);
    }
    
    public static int lerExecutor(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("[1] - Registrar aluno.");
        System.out.println("[2] - Registrar professor.");
        System.out.println("[3] - Consultar corpo de Discente e Doscente");
        System.out.println("[4] - Sair.");
        
        int executor = entrada.nextInt();
        
        return executor;
    }
    
    public static void cadastrarAluno(int quantidade, Pessoas turma[]){
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        float notaAv1,notaAv2;
        
        System.out.println("Digite o nome do aluno: ");
        nome = entrada.nextLine();
        System.out.println("Digite a nota da AV1: ");
        notaAv1 = entrada.nextFloat();
        System.out.println("Digite a nota da AV2: ");
        notaAv2 = entrada.nextFloat();
        System.out.println("Dados registrados! O ID do aluno é:" + quantidade );  
        Alunos aluno = new Alunos(nome, notaAv1, notaAv2, quantidade, "Aprovado");
        turma[quantidade] = aluno;
        
    }
    
        public static void cadastrarProfessor(int quantidade, Professores[] turma){
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        float salario;
       
        System.out.println("Digite o nome do professor: ");
        nome = entrada.nextLine();
        System.out.println("Digite o salario do professor: ");
        salario = entrada.nextFloat();
        System.out.println("Dados registrados! O ID do professor é:" + quantidade ); 
        Professores professor = new Professores(nome, salario, quantidade, "Registrado");
        turma[quantidade] = professor;
    }
    
    
    public static void calcularMedia(float n1, float n2){
        float media = (n1 + n2) / 2;
        String status = verificarStatus(media);
        System.out.println("Média do aluno: "+media);
        System.out.println("Status: "+status);
    }
    
    public static String verificarStatus(float media){
        String status;
        if(media >= 7){
            status = "Aprovado!";
        } else if(media <= 4){
            status = "Reprovado!";
        } else{
            status = "Prova final!";
        }
        
        return status;
    }
    
}
