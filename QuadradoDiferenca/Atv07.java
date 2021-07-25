package atv07;

import javax.swing.JOptionPane;

/**
 *
 * @author daian
 */
public class Atv07 {

public int a;
public int b;
public int quadradoD;
public int a2;
public int b2;
public int ab2;

public void leitura () {

 a = Integer.parseInt(
         
           JOptionPane.showInputDialog(null,"Digite o maior número inteiro: ")
         
         
       ); 
 
 b = Integer.parseInt (
         
         JOptionPane.showInputDialog(null, "Digite o menor número inteiro", "Quadrado da diferença", JOptionPane.QUESTION_MESSAGE)
       ); 


}

public int valida () {

    if (a < b) {
        System.out.println("Valores inválidos, digite na ordem correta");
        return 1;
    }
    else {
        return 0;
    }


}
public int calcular (){

    int r;
    a2 = (int) Math.pow(a,2);
    b2 = (int) Math.pow (b,2);
    ab2 = (2*a*b);
    r = getqdrDif(a2,b2,ab2);
    return r;



}

public int getqdrDif (int a2, int b2,int ab2) 
{
   int resultado; 
   resultado = (a2-ab2+b2);
   return resultado;


}  

public void exibir () {
    String msg;
    msg = "\n*** O quadrado da diferença é de: " + calcular ();
   
   JOptionPane.showMessageDialog(null, msg, " Tela de Saída", JOptionPane.INFORMATION_MESSAGE);
   
   



}
    
public static void main(String[] args) {
               Atv07 a07 = new Atv07();
               //a07.leitura();
               int v = 1;
               
               while (v != 0) {
                   
                    a07.leitura();
                    v = a07.valida();
               };
               System.out.println(v);
               a07.exibir();

    
    
    }
    
}
