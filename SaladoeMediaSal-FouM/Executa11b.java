package tarefa11;
import java.util.Scanner;

public class Executa11b extends Classe11b
{

    Executa11b (String sx)
   {
       super(sx);

   }

    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

            String sxtipo = "Media salárial";
            Executa11b obgp = new Executa11b(sxtipo);

            int tecla = 0;
            String menu = "\n***MENU***\n1 Ler\n2 Exibir\n3 Sair\nItem:";

            do {
                System.out.println(menu);
                tecla = leitor.nextInt();
                switch (tecla) {

                    case 1:
                         
                        obgp.leiturasexo(leitor);
                        obgp.tiposexo(leitor);
                        
                        break;

                    case 2:
                
                        obgp.exibir();
                        break;

                    case 3:
                        System.exit(0);
                        break;

                }

            } while (tecla != 4);
        }

    }

    }