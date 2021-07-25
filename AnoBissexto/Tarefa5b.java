package tarefa5b;
import java.util.Scanner;

/**
 *
 * @author daian
 */
public class Tarefa5b {
    public int ano;
    public String msg;
    public int ca;

    
public void LeituraAno (Scanner leitor) 
{

    System.out.println("Digite o ano para descobrir se é um ano bissexto!");
    ano = leitor.nextInt();

}


public void CalcularAno () 
{
    
    ca = (ano%4);
 
}

public void exibir () 
{   String msg;
    if (ca == 0 & ano%100 != 0 || ano %400 ==0) {
     
        msg = "O ano " + ano + " é bissexto!";

} else {
    
       msg =  "O ano " +  ano  + " não é bissexto!";
        
    } System.out.println(msg);

}
    public static void main(String[] args) {
        
    Scanner leitor = new Scanner (System.in);
    Tarefa5b obj5b = new Tarefa5b();
int tecla = 0;
        String menu = "\n***MENU***\n1 ler\n2 Calcular\n3 Exibir\n4 Sair\nItem:";
        
   do
  
   {
       System.out.println(menu);
       tecla = leitor.nextInt ();
       switch (tecla) 
       {
           
        case 1: obj5b.LeituraAno (leitor) ;
                        break;
                        
        case 2: obj5b.CalcularAno();
                        break;
                        
       case 3: obj5b.exibir ();
                        break;
                                
       case 4: System.exit(0); 
                        break;   
          
       }
       
    } while ( tecla != 4 );
   
  }
   
}