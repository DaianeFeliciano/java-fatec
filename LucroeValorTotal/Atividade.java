/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import javax.swing.JOptionPane;

/**
 *
 * @author daian
 */
public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
       String nome = null;
       
       nome =  JOptionPane.showInputDialog(null,
               "Digite o nome do produto: ", "Produto", JOptionPane.QUESTION_MESSAGE);
        System.out.println("Produto: " + nome);
        
        JOptionPane.showMessageDialog(null,nome,"Saida", JOptionPane.INFORMATION_MESSAGE);
        
       double valor;
      
       valor = Double.parseDouble
        (JOptionPane.showInputDialog(null, "Digite o valor do produto: ")
                 ); // converte para o tipo double
        System.out.println("Valor do produto:" + valor);
       JOptionPane.showMessageDialog(null, valor, "Saida - Valor", JOptionPane.INFORMATION_MESSAGE);
        
      if (valor < 20){
          double lucro = (valor*0.45);
          JOptionPane.showMessageDialog(null, lucro, "O lucro é de: ", JOptionPane.INFORMATION_MESSAGE);
          System.out.println("O lucro é de: " + lucro);
          double valorfinal1= (valor+lucro);
          JOptionPane.showMessageDialog(null, valorfinal1, "O valor total é de: ", JOptionPane.INFORMATION_MESSAGE);
          System.out.println("O valor total do produto é de " + valorfinal1);
          
    }else {
        double lucro2 = (valor*0.30);
        JOptionPane.showMessageDialog (null, lucro2, "O lucro é de: ", JOptionPane.INFORMATION_MESSAGE);
         System.out.println("O lucro é de: " + lucro2);
        double valorfinal2 = (valor+lucro2);
        JOptionPane.showMessageDialog (null, valorfinal2, "O valor final é de: ", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("O valor total do produto é de " + valorfinal2);
       }
        
    }}
   