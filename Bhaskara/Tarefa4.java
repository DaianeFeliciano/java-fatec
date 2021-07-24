package Tarefa4;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author daian
 */
public class Tarefa4 {
  public String alerta = "Clique em 'OK' para calcular Equação 2º grau, sendo: ax²+bx+c=0";  
  public double a;
  public double b;
  public double c;
  public double delta;
  public double x1;
  public double x2;
  public double raiz;
  public double a2;
  

public void leituraequacao (JOptionPane leitor) {
JOptionPane.showMessageDialog(null, alerta, "Cálculo - Equação 2º Grau", JOptionPane.INFORMATION_MESSAGE);
a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de a ","Primeiro Valor", JOptionPane.QUESTION_MESSAGE));
b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de b ","Segundo Valor", JOptionPane.QUESTION_MESSAGE));
c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de c","Terceiro Valor",JOptionPane.QUESTION_MESSAGE));

}  
public void calculoequacacao (){

//delta = ((b*b)-(4*a*c));
delta = ((Math.pow(b,2)) - (4 * a * c));
raiz =  (Math.sqrt(delta));
a2 = 2*a;
x1 = (- b + raiz)/a2;
x2 = (- b - raiz)/a2;
}
public void imprimirequacacao () {
    String msg;
    if (a !=  0 && delta > 0) {
       msg = "O delta da equacão de 2º grau é " + String.format("= %.2f", delta)+ "\n" + "A raiz de delta é "
   + String.format("= %.2f", raiz) + " e as duas raízes encontradas na equação 2º grau é " + "x1  "
   + String.format("= %.2f", x1) + " e " + "x2  " + String.format("= %.2f",x2); 
       
    } else if (a == 0) {
 
     msg = "O valor a tem que ser diferente de 0 para seguir com a equação de segundo grau!";
    
    } else if (delta == 0){
    
    msg =  "O delta da equacão de 2º grau é " + String.format("= %.2f", delta) + "\n" + "A raiz de delta é "
   + String.format("= %.2f", raiz) + " e as duas raízes encontradas na equação 2º "
            + " grau são iguais, pois delta é igual a zero sendo: " + "x1 e x2  = " + String.format("%.2f", x1) + "; " + String.format("%.2f", x2);
      
    } else {

msg = "Sem solução no conjunto dos números reais!";
} JOptionPane.showMessageDialog(null, msg, "Equação de 2º grau", JOptionPane.INFORMATION_MESSAGE); 
     
 
} 

    public static void main(String[] args) {
        Tarefa4 obj3 = new Tarefa4 ();
        obj3.leituraequacao(leitor);
        obj3.calculoequacacao();
        obj3.imprimirequacacao();
        
        
     int tecla = 0;
        String menu = "\n***MENU***\n1 ler\n2 Calcular\n3 Exibir\n4 Sair\nItem:";
        
    
      do
  
   {
       System.out.println(menu);
       tecla = leitor.parseDouble;
       switch (tecla) 
       {
           
        case 1: obj3.leituraequacao ();
                        break;
                        
     
        case 3: obj3.calculoequacacao();
                        break;
                        
        case 4: obj3.imprimirequacacao();
                        break;
                                
        case 5: System.exit(0); 
                        break;   
          
       }   
    }
}
