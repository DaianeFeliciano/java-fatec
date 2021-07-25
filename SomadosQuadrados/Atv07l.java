package atv07l;

import javax.swing.JOptionPane;

/**
 *
 * @author daian
 */
public class Atv07l {

public double a;
public double b;
public double c;
public double a2;
public double b2;
public double c2;
public double abc2;

public void leitura () {

a = Double.parseDouble(
         
           JOptionPane.showInputDialog(null,"Digite o valor de a: ")
         
         
       ); 
 
b = Double.parseDouble (
         
         JOptionPane.showInputDialog(null, "Digite o valor de b: ", "", JOptionPane.QUESTION_MESSAGE)
       ); 

c = Double.parseDouble (
         
         JOptionPane.showInputDialog(null, "Digite o valor de c: ", "", JOptionPane.QUESTION_MESSAGE)
       );



}

public double calcular () {
    double r;
    a2 = (double)Math.pow (a,2);
    b2 = (double) Math.pow (b,2);
    c2 = (double) Math.pow (c,2);
    abc2 = (2*a*b*c);
    r = getqdrSoma(a2,b2,c2,abc2);
    return r;



}

public double getqdrSoma (double a2, double b2, double c2, double abc2) 
{
   double resultado; 
   resultado = (a2+abc2+b2+c2);
   return resultado;


}  

public void exibir  (){

String msg;

msg = "A soma dos quadrados dos três valores lidos: " + calcular ();

JOptionPane.showMessageDialog(null, msg, " Tela de Saída", JOptionPane.INFORMATION_MESSAGE);



}
    
    public static void main(String[] args) {
        Atv07l t3 = new Atv07l ();
        t3.leitura();
        t3.exibir();
        
        
    }
    
}
