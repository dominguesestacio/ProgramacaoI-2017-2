/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author André
 */
public class Exercicio17 {
    private static int num;
    private static int base;
    public static void main(String[] args) {
        
    
    num = Integer.parseInt( JOptionPane.showInputDialog( "Entre com o número a ser convertido:" ) );  
    base = Integer.parseInt( JOptionPane.showInputDialog( "Qual é a base do número"+num+"? (2 ou 10)" ) );  

    if(base==2){  
        String bin = Integer.toString( num, 2 );  
        JOptionPane.showMessageDialog( null, "O número " + num + "(10) na base(2)é ? " + bin );  
    }  
    else{  
        if(base == 10){  
            String bin = Integer.toString( num, 10 );  
            JOptionPane.showMessageDialog( null , "O número" + num + "(2) na base (10) é " + bin );  
        }  
        else{  
            JOptionPane.showMessageDialog( null , base + " Não é uma base compatível" );  
        }  
    }
    }
}