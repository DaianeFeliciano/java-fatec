
/* Efetuar a leitura de um valor inteiro positivo ou negativo 
*apresentar o número lido como sendo um valor positivo, ou seja,
*o programa deverá apresentar o módulo de um número fornecido. 
*Lembre-se de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.*/

package aula3;
import javax.swing.JOptionPane;

/**
 *
 * @author daian
 */
public class Classe2 {
public String informação = "Clique em 'ok' para digitar um número inteiro negativo ou positivo e visualizar seu módulo";
public int n1;
public int int_neg;

public void leituraNúmero (){
JOptionPane.showMessageDialog(null,informação,"Número Inteiro",JOptionPane.INFORMATION_MESSAGE);
n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro positivo ou negativo: ", 
        "Númeiro Inteiro", JOptionPane.QUESTION_MESSAGE));
}

public void calcularn1 () {

int_neg = (n1*(-1));

}

public void mostrarn1 (){
        String msg;
        
        if ( n1 < 0)
        { msg = "O númeiro inteiro digitado é negativo,  o modulo do número é: " + int_neg;
            System.out.println("O númeiro inteiro digitado é negativo, o modulo do número é: " + int_neg);
        }
        else {
        msg = "O número digitado é inteiro positivo , o módulo do número é" + n1;  
            System.out.println("O número inteiro digitado é positivo, o módulo do número é: " + n1);
        }
            
        JOptionPane.showMessageDialog(null, msg,"Número inteiro", JOptionPane.INFORMATION_MESSAGE);
    } //mostrar // saida
    

    public static void main(String[] args) {
        Classe2 obj2 = new Classe2 ();
        obj2.leituraNúmero();
        obj2.calcularn1();
        obj2.mostrarn1();
    }
    
}
