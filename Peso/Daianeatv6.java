package daianeatv6;
import java.util.Scanner;

/**
 *
 * @author daian
 */
public class Daianeatv6 {

    
    public static void main(String[] args) 
    {
        
        Scanner leitor = new Scanner (System.in); 
        Pesoidealhomens ph = new Pesoidealhomens ();
        Pesoidealmulheres pm = new Pesoidealmulheres ();
     
     int tecla = 0;
     while (tecla !=3 ) {
     
         System.out.println("\n1 Calcular Peso F (Feminino) \n2 Calcular Peso M (Masculino)\n3 Sair\nItem:");
    
     tecla = leitor.nextInt ();
     switch (tecla) { 
         
         case 1:ph.leitura(leitor);
      
        System.out.println("\nPeso Ideal(M):" + ph.pesoIdeal());
        break;
        
        case 2: pm.leitura (leitor);
        
        System.out.println("\nPeso Ideal (F): " + pm.pesoIdeal());
        break;
        
       case 3:System.out.println("\nPrograma Finalizado!"); 
       System.exit(0);
       break;
     
     }
     
        
    }
    
}
    
}
