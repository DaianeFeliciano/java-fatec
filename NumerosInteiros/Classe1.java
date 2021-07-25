package aula3;
import javax.swing.JOptionPane;

/**
 *
 * @author daian
 */
public class Classe1{
    //Atributos
    public String alerta = "Para calcular a diferença entre dois números inteiros,"
            + " sendo do maior número inteiro pelo menor valor inteiro, dê 'ok'";
    public int n1;
    public int n2;
    public int diferença;
    
    //Métodos
public void leitura () {
JOptionPane.showMessageDialog(null, alerta, "Cálculo", JOptionPane.INFORMATION_MESSAGE);
  n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o maior número inteiro que deseja calcular: ",
          "1º Valor",JOptionPane.QUESTION_MESSAGE));
JOptionPane.showMessageDialog(null, n1, "Primeiro Valor", JOptionPane.INFORMATION_MESSAGE);
  n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o menor número inteiro que deseja calcular: ", 
          "2º Valor", JOptionPane.QUESTION_MESSAGE));
JOptionPane.showMessageDialog(null, n2, "Segundo Valor", JOptionPane.INFORMATION_MESSAGE);
 System.out.println("O maior número inteiro que foi digitado: "
            + n1 + " \n e o menor número inteiro digitado: " + n2);
}
    
public void calcular () {
    
    diferença = (n1 - n2);
    
}
public void imprimir () {
    String msg;  
    if (n1<n2){
        msg = "Você precisa digitar primeiramente o maior número"
                + " para saber a diferença do maior pelo menor valor";
    System.out.println("Você precisa digitar primeiramente "
            + "o maior número para saber a diferença do maior pelo menor valor");
    }  else {
        msg = "Primeiro valor maior que o segundo, "
                + "o cálculo da diferença dos valores é de: " + diferença;
    System.out.println("O Cálculo da diferença dos valores é de " 
            + diferença);
            }
     JOptionPane.showMessageDialog(null, msg, "Calculo da Diferença", JOptionPane.INFORMATION_MESSAGE);
}
    public static void main(String[] args) {
        Classe1 obj1 = new Classe1 ();
        obj1.leitura();
        obj1.calcular();
        obj1.imprimir ();
    }
}
        


 //JOptionPane.showMessageDialog(null, diferença, "Calculo da Diferença", JOptionPane.INFORMATION_MESSAGE);
 //if(n1>n2 && n1 > - n2){
   // msg = "Primeiro valor maior que o segundo, o cálculo da diferença dos valores é de: " + diferença;
   // System.out.println("O Cálculo da diferença dos valores é de " + diferença);
   // } else if (n1<n2){
    //msg = "Você precisa digitar primeiramente o maior número para saber a diferença do maior pelo menor valor";
    // System.out.println("Você precisa digitar primeiramente o maior número para saber a diferença do maior pelo menor valor");
  //  } else
   // msg = "Digite algum valor";
        
    

