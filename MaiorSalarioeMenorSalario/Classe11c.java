import java.util.Scanner;

public class Classe11c
{double idade;
double salario;
double saldosalariomenoridade;
double saldosalariomaioridade;
double mediasalmenoridade;
double mediasalmaioridade;
double salariominoridade;
double salariomaioridade;
double salariom;
double salarioM;
int contmidade;
int contMidade;

   void Ler(Scanner leitor) {
       System.out.print("\nDigite a idade da pessoa: ");
       idade = leitor.nextDouble();
       if (idade < 18) {
           contmidade++;
           System.out.print("\nDigite o salário da pessoa: R$");
           salario = leitor.nextDouble();
           saldosalariomenoridade += salario;
           if (contmidade == 1) {
               salariom = salario;
               salarioM = salario;
           }
           else if (salario < salariominoridade) {
               salariom = salario;
           }
           else if (salario > salariominoridade) {
               salariom = salario;
           }
       }
       if (idade >= 18) {
           contMidade++;
           System.out.print("\nDigite o salário da pessoa: R$");
           salario = leitor.nextDouble();
           saldosalariomaioridade += salario;
           if (contMidade == 1) {
               salariominoridade = salario;
               salarioM = salario;
           } else if (salario < salariomaioridade) {
               salariomaioridade = salario;
           
           }
       }
   }

   void calcMedia() {
       mediasalmenoridade = saldosalariomenoridade / contmidade;
       mediasalmaioridade = saldosalariomaioridade/ contMidade;
   }
}
