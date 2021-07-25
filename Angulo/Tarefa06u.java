package Tarefa06u;

import java.util.Scanner;
/**
 *
 * @author daian
 */
public class Tarefa06u {
    public double ang1,ang2,ang3;
    String tipo;
    
public void leitura (Scanner leitor) 
{
    
    System.out.println("Digite o valor do primeiro ângulo do triângulo: ");
    ang1 = leitor.nextDouble ();
	System.out.println("Digite o valor do segundo ângulo do triângulo: ");
	ang2 = leitor.nextDouble ();
    System.out.println("Digite o valor do terceiro ângulo do triângulo: ");
    ang3= leitor.nextDouble ();
   
    
    
}

public void tipoTriangulo () 
{
    
    if(ang1 == 90 || ang2 == 90 || ang3 == 90){
        
        tipo = "Retângulo";
    } 
    else if (ang1 > 90 || ang2 > 90 || ang3 > 90){
        
        tipo = "Obtusângulo";       
    }
    else if (ang1 < 90 && ang2 < 90 && ang3 < 90)
    {
        tipo = "Acutângulo";
    } 
} 

   
public void exibir () 
{
    System.out.println("O tipo do triângulo é: " + tipo + " com os lados " + ang1 +", " + ang2 + ", " + ang3);
}
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in); 
        Tarefa06u a1 = new Tarefa06u ();
   
        
        
        int tecla = 0;
        String menu = "\n***MENU***\n1 Ler\n2 Descobrir o Triângulo\n3 Exibir\n4  Sair\nItem:";
        
   do
  
   {
       System.out.println(menu);
       tecla = leitor.nextInt ();
       switch (tecla) 
       {
           
        case 1: a1.leitura ( leitor) ;
                        break;
                        
        case 2: a1.tipoTriangulo();
                        break;
                        
        case 3: a1.exibir ();
                        break;
                        
        case 4: System.exit(0); 
                        break;   
       }
       
    } while ( tecla != 4 );
   
  }
   
}

