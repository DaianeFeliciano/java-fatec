package tarefa5c;
import java.util.Scanner;
/**
 *
 * @author daian
 */
public class Tarefa5c {
    public double x;
    public double y;
    public double z;
    public double aux;
    
    
public void leituraNub (Scanner leitor) 
{
    
    System.out.println("Digite o valor de x: ");
    x = leitor.nextDouble();
    System.out.println("Digite o valor de y: ");
    y = leitor.nextDouble();
    System.out.println("Digite o valor de z: ");
    z =  leitor.nextDouble();

}    

public void exibir ()
{
    
    
String msg;
    if ( x > y ) 
        if  (y > z) {
            msg = "A ordem crescente dos valores é \n" + z + "\n" + y + "\n" + x;
            
        }
        else {
            if (x > z){
                msg = "A ordem crescente dos valores é \n" + y + "\n" + z + "\n" + x;
                
            }
            else {
            msg = "A ordem crescente dos valores é \n" + y + "\n" + x + "\n" + z;
             
            }
        }
    
    else {
            if(y > z) {
                if(x > z) {
                    msg = "A ordem crescente dos valores é \n" + z + "\n" + x + "\n" + y;
 
                } 
                
                else{
                msg = "A ordem crescente dos valores é \n" + x + "\n" + z + "\n" + y;
             
                }
            }
            else {
                msg = "A ordem crescente dos valores é \n" + x + "\n" + y + "\n" + z;
               
            } System.out.println(msg);
    }


}
    

    
    public static void main(String[] args) {
     
    Scanner leitor = new Scanner (System.in);
    Tarefa5c obj5c = new Tarefa5c ();
 int tecla = 0;
        String menu = "\n***MENU***\n1 Ler\n2 Exibir\n3 Sair\nItem:";
        
   do
  
   {
       System.out.println(menu);
       tecla = leitor.nextInt ();
       switch (tecla) 
       {
           
        case 1: obj5c.leituraNub (leitor) ;
                        break;
                        
        case 2: obj5c.exibir();
                        break;
                                
       case 3: System.exit(0); 
                        break;   
          
       }
       
    } while ( tecla != 4 );
   
  }
   
}




