/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author daian
 */


   import javax.swing.JOptionPane;

 

public class Exemplo 
{
  public static void main(String[] args) 
   {
     JOptionPane.showMessageDialog( null, 
                            "Olá Mundo!",
                   "** Boas Viindas ***",
          JOptionPane.INFORMATION_MESSAGE );
     
     
     String nome = null;
     
     nome = JOptionPane.showInputDialog(null,
                            "Digite o nome:",
                            "** Leitura do Nome",
                            JOptionPane.QUESTION_MESSAGE);
     
     
       
       JOptionPane.showMessageDialog( null, nome, "* Saida *",
               JOptionPane.INFORMATION_MESSAGE);
       
        
       double a, b;
       
       a = Double.parseDouble (
               JOptionPane.showInputDialog (null, "Digite um valor:") 
               );
       
       b = Double.parseDouble (
               JOptionPane.showInputDialog (null, "Digite outro valor:") 
               );
       
       double media = (a + b) /2;
       
       JOptionPane.showMessageDialog(null, media);
       
       
       
       
       
String msg = "Deseja Sair?",
titulo = "Confirma Operação";

 

int resp = JOptionPane.showConfirmDialog ( null, msg, titulo , JOptionPane.YES_NO_OPTION);

 

if ( resp == JOptionPane.YES_OPTION)
    
    System.exit(0);

 

else
    JOptionPane.showMessageDialog(null, "O Show vai continuar!");

 

 

   }
}