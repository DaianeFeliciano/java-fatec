package Atv06;

import java.util.Scanner;
/**
 *
 * @author daian
 */
public class Atv06 {
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


public void processarTipo () 
{
    
    if(Numlados == 3){
        
        tipo = "Triângulo";
         s = (Medlados*3)/2;
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
    System.out.println("Área do pentágono " + String.format("= %.2f", area));
}
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        Atv06 a1 = new Atv06 ();
        
        
        int tecla = 0;
        String menu = "\n***MENU***\n1 ler\n2 Processar Tipo e Calcular\n3 Exibir\n4 Sair\nItem:";
        
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
                        
        case 3: a1.exibir();
                        break;
                                
        case 4: System.exit(0); 
                        break;   
          
       }
       
    } while ( tecla != 4 );
   
  }
   
}