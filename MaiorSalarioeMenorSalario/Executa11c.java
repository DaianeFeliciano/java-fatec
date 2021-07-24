import java.util.Scanner;

public class Executa11c extends Classe11c {

   void Exibir() {
       System.out.println("\nMENORES DE IDADE");
       System.out.println("A quantidade de pessoas nessa categoria é de " + this.contmidade);
       System.out.println("O saldo dos salários é de R$" + this.saldosalariomenoridade);
       System.out.println("A média dos salários é de R$" + this.mediasalmenoridade);
       System.out.println("O menor salário é de R$" + this.salariominoridade);
       System.out.println("O maior salário é de R$" + this.salariom);
       System.out.println("\nMAIORES DE IDADE!");
       System.out.println("A quantidade de pessoas nessa categoria é de " + this.contMidade);
       System.out.println("O saldo dos salários é de R$" + this.saldosalariomaioridade);
       System.out.println("A média dos salários é de R$" + this.mediasalmaioridade);
       System.out.println("O menor salário é de R$" + this.salariomaioridade);
       System.out.println("O maior salário é de R$" + this.salarioM);
   }

   public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       Executa11c ex = new Executa11c();
       int tecla = 0;
       while (tecla != 4) {
           System.out.println("\nMENU\n1 - Leitura\n2 - Cálculo\n3 - Exibir\n4 - Sair\nItem: ");
           tecla = leitor.nextInt();
           switch (tecla) {
               case 1:
                   ex.Ler(leitor);
                   break;
               case 2:
                   ex.calcMedia();
                   break;
               case 3:
                   ex.Exibir();
                   break;
           }
       }
       System.out.println("\n\nSaindo do programa...");
       System.exit(0);
   }
}

