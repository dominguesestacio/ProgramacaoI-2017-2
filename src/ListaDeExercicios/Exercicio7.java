/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Exercicio7 {

    public static void main(String[] args) {
    
    String a, b, escolha;
    int es;
    float c, d, e;

    //Usando as Variaveis 
        escolha  = JOptionPane.showInputDialog("Digite 0 para Soma, \n Digite 1 para Subtraçao, \n Digite 2 para Divisao, \n Digite 3 para Multiplicacao");
        es  = Integer.parseInt(escolha);
        a  = JOptionPane.showInputDialog("Digite o primeiro numero");
        c  = Float.parseFloat(a);
        b  = JOptionPane.showInputDialog("Digite o segundo numero");
        d  = Float.parseFloat(b);

    //Usando o Switch Case  
        switch (es)
       {  
            
        case 0:   
        e = c + d;  
            JOptionPane.showMessageDialog(null, "Resultado da soma: " + e, "Feito", JOptionPane.PLAIN_MESSAGE );break;  
  
        case 1:   
        e = c - d;  
            JOptionPane.showMessageDialog(null, "Resultado da subtracao: " + e, "Feito", JOptionPane.PLAIN_MESSAGE );break;  
  
        case 2:   
            e = c / d;  
            JOptionPane.showMessageDialog(null, "Resultado da divisao: " + e, "Feito", JOptionPane.PLAIN_MESSAGE );break;  
  
        case 3:   
            e = c * d;  
            JOptionPane.showMessageDialog(null, "Resultado da multiplicacao: " + e, "Feito", JOptionPane.PLAIN_MESSAGE );break;  
  
       }  
    System.exit (0);
    
    } 
    
}
