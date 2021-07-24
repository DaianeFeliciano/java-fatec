package tarefa11;
import java.util.Scanner;


public class Classe11b extends Object {
    public String sexo, sxfm, sexofm="F", sexomm= "M";
    public String sexoF, sexoM;
    public double salF, salM, mediaF, mediaM, saldoF, saldoM, salario;
    public int contF, contM;

    Classe11b(String sx) {
        sxfm = new String();
        this.sxfm = sx;
    }
    
    public void leiturasexo (Scanner leitor) {
    
        System.out.println("Digite o seu sexo (F ou M): ");
        sexo = leitor.next();
        
    
    
    }
    
    public void tiposexo (Scanner leitor) 
{
    
        if(sexo.equals(sexofm)){
        
        System.out.println("Digite o seu salário: ");
        salF = leitor.nextDouble();
        contF += 1;
        saldoF += salF;
        mediaF = saldoF / contF;
        
    }   else if (sexo.equals(sexomm)){
        
        System.out.println("Digite o seu salário: ");
        salM = leitor.nextDouble();   
        contM += 1;
        saldoM += salM;
        mediaM = saldoM / contM;
    }   else 
    {System.out.println("Sexo inválido, digite novamente! Por favor, digite F para Feminino ou M para Masculino!");
    } 
} 
    
    
   public void exibir() {
       
        System.out.println("**Sexo Feminino**" );
        System.out.println("O saldo é: " + saldoF);
        System.out.println("Média salarial: " + mediaF);
   
        System.out.println("**Sexo Masculino**");
        System.out.println("O saldo é: " + saldoM);
        System.out.println("Média salarial: " + mediaM);

    }
}