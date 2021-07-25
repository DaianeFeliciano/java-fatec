package atv07j;

import javax.swing.JOptionPane;

/**
 *
 * @author daian
 */

public class Atv07j {

public double vldolar;
public double atdolar;

public void leitura () {

vldolar = Double.parseDouble(
         
           JOptionPane.showInputDialog(null,"Digite a quantidade de dolares que possui: ")
         
         
       ); 
 
atdolar = Double.parseDouble (
         
         JOptionPane.showInputDialog(null, "Digite a cotação do dolar atual: ", "Conversão", JOptionPane.QUESTION_MESSAGE)
       ); 

}
public double calcular () {

double conversao;
conversao = (vldolar/atdolar);
return conversao;
        
}

public void exibir () {
String msg;
 msg = "\n*** A conversão dos valores para real é R$: " + String.format("%.2f",calcular () ); ;
   
   JOptionPane.showMessageDialog(null, msg, " Tela de Saída", JOptionPane.INFORMATION_MESSAGE);



}
public static void main(String[] args) {
    
    Atv07j t1 = new Atv07j ();
        
        t1.leitura();
        t1.exibir();

    
    
       
    }
    
}
