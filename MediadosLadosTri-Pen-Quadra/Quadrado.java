package tarefa0006;

/**
 *
 * @author daian
 */
public class Quadrado {

public double Numlados;
public double Medlados;
public double area;
public String tipo;
public double s;    
    
    
    
public void calcular () 
{
 s = (Medlados*3)/2;
    
}    
    
    
public void processarTipo () 
{
    
    if(Numlados == 4){
        
        tipo = "Quadrado";
       
        area = Math.pow(Medlados,2);
        
        
    }     
    
    
}
    
}
