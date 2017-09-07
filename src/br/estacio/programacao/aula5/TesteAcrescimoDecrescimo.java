package br.estacio.programacao.aula5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class TesteAcrescimoDecrescimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int prefixo = 10;
       int sufixo = 40;
       
       int diferencaPrefixo, diferencaSufixo;
       diferencaPrefixo = ++prefixo;
       
       System.out.println("Deferenca " + diferencaPrefixo);
       System.out.println("Prefixo " + prefixo);
       
       diferencaSufixo = sufixo++;
       
       System.out.println("Deferenca2 " + diferencaSufixo);
       System.out.println("Sufixo " + sufixo);
      
       int a = 10;
         if (a++ == 11){
           System.out.println("Sucesso");
       } else { 
           System.out.println("Ferrou");
       }
           
    }
    
}
