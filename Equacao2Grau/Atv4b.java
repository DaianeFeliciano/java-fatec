package atv4b;

import java.util.Scanner;
/**
 *
 * @author daian
 */
public class Atv4b {
    
  public double a;
  public double b;
  public double c;
  public double delta;
  public double x1;
  public double x2;
  public double raiz;
  public double a2;
    
public void leitura (Scanner leitor) 
{
    
    System.out.println("Digite os lados de a, b e c ");
    a = leitor.nextDouble ();
    b = leitor.nextDouble ();
    c = leitor.nextDouble ();
    
    
}

public void calcular () 
{

delta = ((Math.pow(b,2)) - (4 * a * c));
raiz =  (Math.sqrt(delta));
a2 = 2*a;
x1 = (- b + raiz)/a2;
x2 = (- b - raiz)/a2;

}


public void exibir () 
{
    
   String msg;
    if (a !=  0 && delta > 0) {
       msg = "O delta da equacão de 2º grau é " + String.format("= %.2f", delta)+ "\n" + "A raiz de delta é "
   + String.format("= %.2f", raiz) + " e as duas raízes encontradas na equação 2º grau é " + "x1  "
   + String.format("= %.2f", x1) + " e " + "x2  " + String.format("= %.2f",x2); 
       
    } else if (a == 0) {
 
     msg = "O valor a tem que ser diferente de 0 para seguir com a equação de segundo grau!";
    
    } else if (delta == 0){
    
    msg =  "O delta da equacão de 2º grau é " + String.format("= %.2f", delta) + "\n" + "A raiz de delta é "
   + String.format("= %.2f", raiz) + " e as duas raízes encontradas na equação 2º "
            + " grau são iguais, pois delta é igual a zero sendo: " + "x1 e x2  = " + String.format("%.2f", x1) + "; " + String.format("%.2f", x2);
      
    } else {

msg = "Delta é negativo, sendo " + String.format("= %.2f", delta) + " - Sem solução no conjunto dos números reais!";

}   System.out.println(msg);

}
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        Atv4b obj4 = new Atv4b ();
        
        
        int tecla = 0;
        String menu = "\n***MENU***\n1 ler\n2 Calcular\n3 Exibir\n4 Sair\nItem:";
        
   do
  
   {
       System.out.println(menu);
       tecla = leitor.nextInt ();
       switch (tecla) 
       {
           
        case 1: obj4.leitura (leitor) ;
                        break;
                        
        case 2: obj4.calcular();
                        break;
                        
        case 3: obj4.exibir ();
                        break;
                                
        case 4: System.exit(0); 
                        break;   
          
       }
       
    } while ( tecla != 4 );
   
  }
   
}