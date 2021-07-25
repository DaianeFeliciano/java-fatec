
import javax.swing.JOptionPane; 
public class Produto {

public int a;
public int b;
public int c;
public int d;
String StatusR;

    


void leituraInteiros () {

a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de a: ", "Leitura", JOptionPane.QUESTION_MESSAGE));
b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de b: ", "Leitura", JOptionPane.QUESTION_MESSAGE));
c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de c: ", "Leitura", JOptionPane.QUESTION_MESSAGE));
d = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de d: ", "Leitura", JOptionPane.QUESTION_MESSAGE));


}

public int getP () {

int p;
p = (a*c);
return p;



}


public int getS () {

int s;
s = (b+d);
return s;

}


public void mostrar ()
{

String linhas;

linhas = "\n ***Resultado***";
linhas +="\n Valor de a: " + a;
linhas +="\n Valor de b: " + b;
linhas +="\n Valor de c: " + c;
linhas +="\n Valor de d: " + d;
linhas +="\n Valor de a x c = " + getP ();
linhas +="\n Valor de b + d = " + getS ();

JOptionPane.showMessageDialog ( null, linhas );
} 

}