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
           System.out.println("Sucesso" + a);
       } else { 
           System.out.println("Ferrou" + a);
           
       }
        //exemplo1
         int b = 20;
         int y = (b+=3);
        System.out.println(y);
        //exemplo2
         int c = 10;
         int z = c++ + ++c;
         System.out.println(z);
         
         //para proxima aula
         // int a = 3;
         // int b = 1;
         // int c = b + 1;
         // int d = c > ++b ? (a -3) : b;
         // int e = 4;
         
         // if( d > a && b + 1 < a || b > 1)
         //   c += 7;
         // if( -7 >= -c)
         //   a -= 4;
         // else d *= 2;
         
         // e = ++d % 3;
         // b = d++ % 3;

         
         
    }
    
}
