package daianeatv6;
import java.util.Scanner;

/**
 *
 * @author daian
 */
public class Pesoidealmulheres {
    
   public double altura;
   public String sexo;
   
   
public void leitura (Scanner leitor) 



  {     
         System.out.println("Digite sua altura: ");
                 altura = leitor.nextDouble();                 }
  
public double pesoIdeal ()   

{return  (62.1 * altura) - 44.7;}



}


