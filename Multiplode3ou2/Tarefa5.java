package tarefa5;
import java.util.Scanner;

/**
 *
 * @author daian
 */
public class Tarefa5 {
    public double n1;
    public double n2;
    public double c1;
    public double c2;
    public double c3;
    public double c4;

public void leituraN (Scanner leitor) 
{

    System.out.println("Digite o primeiro número: ");
    n1 = leitor.nextDouble();
     System.out.println("Digite o segundo número: ");
    n2 = leitor.nextDouble();


}

public void calcularN () 
{

    c1 = (n1%3);
    c2 = (n2%2);
    c3 = (n1%2);
    c4 = (n2%3);
    
}

public void exibir ()
{
    String msg;
    if (c1 == 0 & c2 ==0)
    {
    
    msg = "O número " + n1 + " é múltiplo de 3  e o " + n2 + " é múltiplo de 2";
    
    
    } else if (c3 == 0 & c2 == 0 ) {
    
    msg = "O número " + n1 + " e " + n2 + " é múltiplo de 2";
    
    } else if (c3 == 0 & c4 == 0){

    msg = "O número " + n1 + " é múltiplo de 2 e o " + n2 + " é múltiplo de 3";    

    } else if (c1 == 0 & c4 == 0) {
    msg = "O número " + n1 + "e o " + n2 + " é múltplico de 3";


}   else if  (c1 == 0 & c2 != 0) {

    msg = "O número " + n1 + " é múltiplo de 3 e o " + n2 + " não é múltiplo de 3 e não também é multiplo de 2";
    
}   else if (c1 != 0 & c2 == 0)
    {
        msg = "O número " + n1 + " não é múltiplo de 2 e também não é múltiplo de 3 " + " e  o " + n2 + " é múltiplo de 2"; 


    }else if (c3 == 0 & c4 != 0) {
    
        msg = "O número " + n1 + " é múltiplo de 2 e o número " + n2 + " não é múltiplo de 3 e também não é múltiplo 2";
    
    }else if (c3 != 0 & c4 == 0) {
    
        msg = "O número " + n1 + " não é múltiplo de 2 e nem de 3 e o número " + n2 + " é múltiplo de 3";
    
    
    }else {
    
    msg = " Os números "+ n1 + "e" + n2 + " não são multiplos de 3 e 2";
    
    
    } System.out.println(msg);

}  
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        Tarefa5 obj5 = new Tarefa5 ();
       
int tecla = 0;
        String menu = "\n***MENU***\n1 ler\n2 Calcular\n3 Exibir\n4 Sair\nItem:";
        
   do
  
   {
       System.out.println(menu);
       tecla = leitor.nextInt ();
       switch (tecla) 
       {
           
        case 1: obj5.leituraN (leitor) ;
                        break;
                        
        case 2: obj5.calcularN();
                        break;
                        
       case 3: obj5.exibir ();
                       break;
                                
       case 4: System.exit(0); 
                        break;   
          
       }
       
    } while ( tecla != 4 );
   
  }
   
}