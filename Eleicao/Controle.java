import javax.swing.JOptionPane;
public class Controle {

   
    public void menu (Eleicao e3) {
        
        int item = 0;
    
            
        String menu = "\n*** Menu  ***";
        menu += "\n1 Ler votos";
        menu += "\n2 Efetuar Cálculo de votos";
        menu += "\n3 Exibir resultados";
        menu += "\n4 Finalizar micro-sistema";
        menu += "\nItem:";
        
        while ( item != 4 )
        {
          item = Integer.parseInt( JOptionPane.showInputDialog(null, menu ));
      
            switch ( item )
            {
                case 1: e3.leituravotos ();
                        break;


                case 2:     e3.getQET();
                            e3.getQPVV(); 
                            e3.getQPVA();
                            e3.getQPVB();
                            e3.getQPVC();
                            e3.getQPVN ();
                            e3.getQPVBB();
             
                        JOptionPane.showMessageDialog(null, "Votos calculados!");
                        break;


                case 3: 
                        e3.mostrar ();
                        break;


                case 4: System.exit(0); 
                        break;
            }


       
        }
    }
    
    
    public static void main(String[] args) 
            
    {
       Eleicao e3 = new Eleicao();
       Controle c2 = new Controle();
       c2.menu (e3);
    
     
    }
    
}

