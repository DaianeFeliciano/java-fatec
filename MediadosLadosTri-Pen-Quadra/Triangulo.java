
package tarefa0006;

/**
 *
 * @author daian
 */
public class Triangulo {
    
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
    
    if(Numlados == 3){
        
        tipo = "Triângulo";
       
        area =  Math.sqrt((s*(s-Medlados)*(s-Medlados)*(s-Medlados)));
        
        
    }     
    
    
}

}