/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeira_atividade;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author daian
 */
public class Primeira_Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite o nome do Produto: ");
        String nome = ler.nextLine();
        System.out.println("Digite o valor do Produto: ");
        float valor = ler.nextFloat();
        float desconto = (float) (valor*0.09);
        float valorf = (float) (valor - desconto);
        System.out.println("O nome do produto é: " + nome);
        System.out.println("O valor do produto sem desconto é: " + valor);
        System.out.println("O desconto do produto é: " + desconto );
        System.out.println("O valor final do produto ficou: " + valorf );
        Date relogio = new Date ();
        System.out.println("A data e hora que foi realizado esta primeira atividade de java foi:");
        System.out.println (relogio.toString());
       
    }
    
}
