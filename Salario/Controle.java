import javax.swing.JOptionPane;
public class Controle {

   
    public void menu (Salario s3) {
        
        int item = 0;
        
        String menu = "\n*** Menu  ***";
        menu += "\n1 Ler valor salarial e percentual PR";
        menu += "\n2 Efetuar Cálculo";
        menu += "\n3 Exibir resultados";
        menu += "\n4 Finalizar micro-sistema";
        menu += "\nItem:";
        
        while ( item != 4 )
        {
          item = Integer.parseInt( JOptionPane.showInputDialog(null, menu ));
      
            switch ( item )
            {
                case 1: s3.leiturasalario ();
                        break;


                case 2:     s3.getNS ();
                        JOptionPane.showMessageDialog(null, "Cálculos Efetuados com Sucesso!");
                        break;


                case 3: 
                        s3.mostrar ();
                        break;


                case 4: System.exit(0); 
                        break;
            }


       
        }
    }
    
    
    public static void main(String[] args) 
            
    {
       Salario s3 = new Salario();
       Controle c2 = new Controle();
       c2.menu ( s3 );
    
     
    }
    
}
