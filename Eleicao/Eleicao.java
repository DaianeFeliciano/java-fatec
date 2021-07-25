
import javax.swing.JOptionPane;
public class Eleicao {
    
public double qva;

public double qvb;

public double qvc;

public double qvn;
public double qvbb;
    

void leituravotos () {

qva = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de votos válidos candidato A: ", "Leitura", JOptionPane.QUESTION_MESSAGE));


qvb = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de votos válidos candidato B: ", "Leitura", JOptionPane.QUESTION_MESSAGE));


qvc = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de votos válidos candidato C: ", "Leitura", JOptionPane.QUESTION_MESSAGE));

qvn = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de votos nulos: ","Leitura", JOptionPane.QUESTION_MESSAGE));
qvbb = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de votos brancos: ","Leitura", JOptionPane.QUESTION_MESSAGE));


}

/*Quantidade total de eleitores*/

public double getQET() {

double qet;
qet= qva+qvb+qvc+qvn+qvbb;
return qet;



}

/*o percentual correspondente de votos válidos em relação à quantidade de
eleitores*/
public double getQPVV () {

double qpvv;
qpvv = (qva +qvb +qvc)/(qva+qvb+qvc+qvn+qvbb) *100;
return qpvv;



}

public double getQPVA () {

double qpva;
qpva = qva/(qva+qvb+qvc+qvn+qvbb) *100;
return qpva;



}



public double getQPVB () {

double qpvb;
qpvb = qvb/(qva+qvb+qvc+qvn+qvbb) *100;
return qpvb;



}

public double getQPVC () {

double qpvc;
qpvc = qvc/(qva+qvb+qvc+qvn+qvbb) *100;
return qpvc;

}

public double getQPVN () {

double qpvn;
qpvn = qvn/(qva+qvb+qvc+qvn+qvbb)*100;
return qpvn;

}

public double getQPVBB () {

double qpvbb;
qpvbb = qvbb/(qva+qvb+qvc+qvn+qvbb) *100;
return qpvbb;

}


public void mostrar ()
{

String linhas;

linhas = "\n ***Resultado Eleição***";
linhas +="\n Número total eleitores " + String.format("= %.0f",getQET ());
linhas +="\n Votos válidos canditado a " + String.format("= %.0f", qva);
linhas +="\n Votos válidos canditado b " + String.format("= %.0f", qvb);
linhas +="\n Votos válidos canditado c " + String.format("= %.0f", qvc);
linhas +="\n Votos nulos: " + String.format("= %.0f", qvn);
linhas +="\n Votos brancos: "  + String.format("= %.0f", qvbb);
linhas +="\n Percentual correspondente de votos válidos em relação à quantidade de\n eleitores "  + String.format("= %.2f",getQPVV ()) + "%";
linhas +="\n o percentual correspondente de votos válidos do candidato A em relação à quantidade de\n" +
"eleitores " + String.format("= %.2f", getQPVA ())+ "%";
linhas +="\n o percentual correspondente de votos válidos do candidato B em relação à quantidade de\n" +
"eleitores " + String.format("= %.2f", getQPVB ())+ "%";
linhas +="\n o percentual correspondente de votos válidos do candidato C em relação à quantidade de\n" +
"eleitores " + String.format("= %.2f",  getQPVC ())+ "%";
linhas +="\n o percentual correspondente de votos nulos em relação à quantidade de\n" +
"eleitores " + String.format("= %.2f",  getQPVN ())+ "%";
linhas +="\n o percentual correspondente de votos brancos em relação à quantidade de\n" +
"eleitores "  + String.format("= %.2f",  getQPVBB ())+ "%";

JOptionPane.showMessageDialog ( null, linhas );
} 


}

