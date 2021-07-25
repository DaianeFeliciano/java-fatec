/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2;

import javax.swing.JOptionPane;

/**
 *
 * @author daian
 */
public class Atividade_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = null;
        nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ", "Nome", JOptionPane.QUESTION_MESSAGE);
        System.out.println("Nome: " + nome);
        
        int idade;
        double plano;
        idade = Integer.parseInt
        (JOptionPane.showInputDialog (null, "Digite sua idade: ", JOptionPane.QUESTION_MESSAGE));
        System.out.println("Idade: " + idade);
        if (idade <= 10){
         plano = (30.00);   
      
        } else if (idade > 10 && idade <= 29){
         plano = (60.00);
       
        } else if (idade >29 && idade <=45){
        plano =(120.00);
       
    } else if (idade >45 && idade <=59) {
        plano = (150.00);
      
    } else if (idade >59 && idade <= 65){
        plano = (250.00);      
  
    } else {
        plano = (400.00);
       
   
    } System.out.println("O valor do seu plano é: " + plano); 
      JOptionPane.showMessageDialog(null, plano, "O valor do seu plano é: ", JOptionPane.INFORMATION_MESSAGE);
    } 
    }

