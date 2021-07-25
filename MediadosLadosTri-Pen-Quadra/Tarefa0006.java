package Tarefa0006;

import java.util.Scanner;
/**
 *
 * @author daian
 */
public class Tarefa0006 {
    public double Numlados, Medlados;
    String tipo;
    public double s;
    public double area;
    
public void leitura (Scanner leitor) 
{
    
    System.out.println("Digite o número de lados do pentágono regular: ");
    Numlados = leitor.nextDouble ();
    System.out.println("Digite a medida de lados do pentágono regular: ");
    Medlados= leitor.nextDouble ();
   
    
    
}

public void calcular () 
{
 s = (Medlados*3)/2;
    
}


public void processarTipo () 
{
    
    if(Numlados == 3){
        
        tipo = "Triângulo";
       
         area =  Math.sqrt((s*(s-Medlados)*(s-Medlados)*(s-Medlados)));
        
        
    } 
    else if (Numlados == 4){
        
        tipo = "Quadrado";
        
        area = Math.pow(Medlados,2);
       
    }
    else if (Numlados == 5)
    {
        
        tipo = "Pentágono";
        
         area = 5*Medlados/2*(Medlados/(2*(Math.tan((Math.toRadians(90 - ((5-2)*180/5)/2))))));
    } 
    else if (Numlados > 5) {
        
        tipo = "Polígono não identificado"; }
    else {
    
        tipo = "Não é polígono";
    }
} 

   
public void exibir () 
{
    
    System.out.println(tipo);
    System.out.println();
    System.out.println("Semiperímetro " + s);
    System.out.println("Área do triãngulo " + String.format("= %.2f", area));
}
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in); 
        Tarefa0006 a1 = new Tarefa0006 ();
        Triangulo t = new Triangulo ();
        Quadrado q = new Quadrado ();
        Pentagono p = new Pentagono ();
        
        
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