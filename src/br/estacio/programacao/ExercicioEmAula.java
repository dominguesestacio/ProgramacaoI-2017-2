/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao;

/**
 *
 * @author aluno
 */
public class ExercicioEmAula {
    public static void main(String[] args) {
        
        for (int j =0; j<5; j++)
            for (int i=0; i<5; i++)
                if (vetor[i]> vetor [i+1]){
                    aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1]= aux;
               // vetor organiza posiçoes
               // [j] [i] [3][7][2][9][6][5]
               //  0   0                   
               //  1   1                   
               //      2                   
               //      3                     
                }
        
    }
    
}
