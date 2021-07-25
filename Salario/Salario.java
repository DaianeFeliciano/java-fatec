
import javax.swing.JOptionPane;
public class Salario {
    
    public double sm;
    public double pr;
    
void leiturasalario () {

sm = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do salário R$: ", "Leitura", JOptionPane.QUESTION_MESSAGE));
pr = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor percentual de reajuste: ", "Leitura", JOptionPane.QUESTION_MESSAGE));

}

public double getNS () {
        double c = pr/100;
int ns;
ns =    (int) (sm*c+sm);
return ns;



}


public void mostrar ()
{

String linhas;

linhas = "\n ***Resultado***";
linhas +="\n Valor do salário mensal: " + sm;
linhas +="\n Valor percentual: " + pr + "%";
linhas +="\n Valor total salarial " + getNS();


JOptionPane.showMessageDialog ( null, linhas );
} 

}
