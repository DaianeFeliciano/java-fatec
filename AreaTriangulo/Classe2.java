package classe2;

import java.util.Scanner;
/**
 *
 * @author daian
 */
public class Classe2 {
    public double a, b, c;
    String tipo;
    public double s;
    public double area;
    
public void leitura (Scanner leitor) 
{
    
    System.out.println("Digite os lados de a, b e c ");
    a = leitor.nextDouble ();
    b = leitor.nextDouble ();
    c = leitor.nextDouble ();
    
    
}

public void calcular () 
{

    s = (a + b + c)/2;
    area =  Math.sqrt((s*(s-a)*(s-b)*(s-c))); 
}


public void processarTipo () 
{
    
    if(a==b && b==c){
        
        tipo = "Equilátero";
        
        
        
    } 
    else if (a!=b && a!=c && b !=c){
        
        tipo = "Escaleno";
       
    }
    else 
    {
        
        tipo = "Isóceles";
       
    }
}

   
public void exibir () 
{
    
    System.out.println(tipo);
    System.out.println();
    System.out.println("a = " + a + " b = " + b + " c = " + c);
    System.out.println("Semiperímetro " + s);
    System.out.println("Área do triãngulo " + String.format("= %.2f", area));
}
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        Classe2 a1 = new Classe2 ();
        
        
        int tecla = 0;
        String menu = "\n***MENU***\n1 ler\n2 Processar\n3 Calcular\n4 Exibir\n5 Sair\nItem:";
        
   do
  
   {
       System.out.println(menu);
       tecla = leitor.nextInt ();
       switch (tecla) 
       {
           
        case 1: a1.leitura ( leitor) ;
                        break;
                        
        case 2: a1.processarTipo();
                        break;
                        
        case 3: a1.calcular ();
                        break;
                        
        case 4: a1.exibir();
                        break;
                                
        case 5: System.exit(0); 
                        break;   
          
       }
       
    } while ( tecla != 4 );
   
  }
   
}