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
public class PrimeiraClasse {

    /**
     * @param args the command line arguments este guit esta funcionando
     */
    public static void main(String[] args) {

        //Variaveis do tipo inteiro
        short variavelTipoShort = 10;
        int variavelDoTipoInt = 10;
        long variavelDoTipoLong = 1000;
        byte variavelDoTipobyte = 10;
        short variavelDoTiposhort = 10;

        //variavel do tipo flutuante / real
        float variavelDoTipoFloat = 134.2345f;
        double variavelDoTipoDouble = 12312312.123123123d;
        //variavel tipo logico recebe os valores true ou false
        boolean variavelLogica = true;

        //variavel do tipo caracter
        char variavelDoTipoCaracter = 'a';

        //objeto do tipo palavra/texto
        String palavra = "Sou uma String";

        System.out.println("Helo Word");
        System.out.println("Esta Variavel é do tipo byte: " + variavelDoTipobyte);
        System.out.println("Esta Variavel é do tipo short: " + variavelDoTiposhort);
        System.out.println("Esta Variavel é do tipo int: " + variavelDoTipoInt);
        System.out.println("Esta Variavel é do tipo long: " + variavelDoTipoLong);
        System.out.println("Esta Variavel é do tipo float: " + variavelDoTipoFloat);
        System.out.println("Esta Variavel é do tipo double: " + variavelDoTipoDouble);
        System.out.println("Esta Variavel é do tipo char: " + variavelDoTipoCaracter);
        System.out.println("Esta Variavel é do tipo boolean: " + variavelLogica);
        System.out.println("Esta Variavel é do tipo String: " + palavra);

    }

}
