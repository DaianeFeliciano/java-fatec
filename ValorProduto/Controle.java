
import javax.swing.JOptionPane;
public class Controle {

   
    public void menu (Produto c2) {
        
        
         //String analise = null ;
        int item = 0;
        //int delta = 0 ; 
        
        String menu = "\n*** Menu  ***";
        menu += "\n1 Ler valores A, B e C";
        menu += "\n2 Efetuar Cálculo";
        menu += "\n3 Exibir resultados";
        menu += "\n4 Finalizar micro-sistema";
        menu += "\nItem:";
        
        while ( item != 4 )
        {
          item = Integer.parseInt( JOptionPane.showInputDialog(null, menu ));
      
            switch ( item )
            {
                case 1: c2.leituraInteiros ();
                        break;


                case 2:     c2.getP();
                            c2.getS();
                        JOptionPane.showMessageDialog(null, "Cálculos Efetuados com Sucesso!");
                        break;


                case 3: 
                        c2.mostrar ();
                        break;


                case 4: System.exit(0); 
                        break;
            }


       
        }
    }
    
    
    public static void main(String[] args) 
            
    {
       Produto c2 = new Produto();
       Controle c1 = new Controle();
       c1.menu ( c2 );
    
     
    }
    
}

