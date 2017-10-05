/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios;

/**
 *
 * @author aluno
 */
public class Exercicios1a3 {
    /*------------------------EXERCICIOS-------------------------
     1. Explique o processo de compilação e interpretação do JAVA.
     R: Compilação: é a execuçao mais rapida, somente o executavel
     é carregado na memoria. Interpletaçao: é a portabilidade. 
     ambos sao interpletados pelo java e cada SO possui uma JVM 
     para interpletar os codigos chamados de ".java" que utiliza  
     um utilitario chamado javac.
    
     2. Para executar um programa Java deve ocorrer um processo que
     envolve compilação e interpretação. Quando se compila uma
     classe  com  extensão.java  é  gerado  um  arquivo com extensão
     R: ".class"
     */

    /*3.*/
    public static void main(String[] args) {
        int idade;
        idade = 22;
        System.out.println("idade: " + idade);
        String nome;
        nome = "andre";
        System.out.println("nome: " + nome);
        int peso;
        peso = 85;
        System.out.println("peso: " + peso);
        char tipoSangue;
        tipoSangue = 'O';
        System.out.println("tipo Sanguineo: " + tipoSangue);
        String stringData;
        stringData = "21/12/1994";
        System.out.println("Data Aniversario: " + stringData);
        int calca;
        calca = 42;
        System.out.println("numero que calço: " + calca);
        boolean casado;
        casado = false;
        System.out.println("casado: " + casado);
    }
}
