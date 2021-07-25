package daianeatv6;
import java.util.Scanner;

/**
 *
 * @author daian
 */
public class Pesoidealhomens {
    
   public double altura;
   public String sexo;
   
   
public void leitura (Scanner leitor) 



  {     
         System.out.println("Digite sua altura: ");
                 altura = leitor.nextDouble();                 }
  
public double pesoIdeal ()   

{return  (72.7 * altura) - 58;}



}


    

