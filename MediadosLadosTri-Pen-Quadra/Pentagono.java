package tarefa0006;

/**
 *
 * @author daian
 */
public class Pentagono {

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
    
    if(Numlados == 5 ){
        
      tipo = "Pentágono";
        
      area = 5*Medlados/2*(Medlados/(2*(Math.tan((Math.toRadians(90 - ((5-2)*180/5)/2))))));
        
        
    }     
    
    
}
    
}
