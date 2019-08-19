/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto07scanner;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Projeto07Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Classe Scanner deve ser importada de dentro do pacote java.util.Scanner
        // para instanciar um objeto vc deve colocar qual a classe dele e o nome
        // depois do sinal de igual usar a palavra reservada NEW e colocar de novo o nome
        // da classe e quais os paramentros ela recebe
        // exemplo: Classe objeto = new Classe(parametros);

        String nome = "Matheus";
        Scanner s = new Scanner(System.in);

        //criar um programa que receba uma entrada de 2 valores
        //e verifique qual o maior e menor entre os dois
        int n1, n2;
        System.out.println("Digite o primeiro número: ");
        n1 = s.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = s.nextInt();

        System.out.println("Valor de N1: " + n1);
        System.out.println("Valor de N2: " + n2);
        
        if(n1 > n2){
            System.out.println(n1 + " é maior que " + n2);
        }else if(n2 > n1){
            System.out.println(n2 + " é maior que " + n1);
        }else{
            System.out.println("Eles são iguais");
        }
    }

}
